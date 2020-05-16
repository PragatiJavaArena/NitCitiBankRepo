package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//@Primary
@Component("peEngg")
@PropertySource(value="com/nt/commons/info.properties")
public class PetrolEngine implements Engine {
	//@Value("789999")
  @Value("${petrol.engine.id}")
	
        private long  engineId;
        
	public void start() {
		System.out.println("PetrolEngine.start():::   journey started with  engineId      "+engineId);
	}

	public void end() {
		System.out.println("PetrolEngine.end()::: journey ended with  engine id         "+engineId);
		
	}

}
