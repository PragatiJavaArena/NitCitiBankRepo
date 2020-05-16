package com.nt.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("diEngg")
public class DieselEngine implements Engine {
	@Value("85783457")
        private long   engineId;
        
	public void start() {
		System.out.println("DieselEngine.start():::   journey started with  engineId   "+engineId);
	}

	public void end() {
		System.out.println("DieselEngine.end()::: journey ended with  engine id      "+engineId);
		
	}

}
