package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diEngg")
@Primary
public class DieselEngine implements Engine {
	//@Value("1233333")
    @Value("${diesel.engine.id}")
        private long   engineId;
        
	public void start() {
		System.out.println("DieselEngine.start():::   journey started with  engineId   "+engineId);
	}

	public void end() {
		System.out.println("DieselEngine.end()::: journey ended with  engine id      "+engineId);
		
	}

}
