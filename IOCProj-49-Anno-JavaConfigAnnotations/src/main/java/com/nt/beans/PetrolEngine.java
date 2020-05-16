package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;

@Named("peEngg")
public class PetrolEngine implements Engine {
	
@Value("487584784")
        private long engineId;
	
        
	public void start() {
		System.out.println("PetrolEngine.start():::   journey started with  engineId      "+engineId);
	}

	public void end() {
		System.out.println("PetrolEngine.end()::: journey ended with  engine id         "+engineId);
		
	}

}
