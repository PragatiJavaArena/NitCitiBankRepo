package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

//@Component("vehicle")

@Component

//below code is allowed up to spring 3
@PropertySources(value= {@PropertySource(value="com/nt/commons/info.properties"),
		@PropertySource(value="com/nt/commons/info1.properties")}
                   )
//below code is used from  4 onwards
//@PropertySource(value = "com/nt/commons/info.properties")
//@PropertySource(value="com/nt/commons/info1.properties")
//@PropertySource(value= {"com/nt/commons/info.properties","com/nt/commons/info1.properties"})


public class Vehicle {
//	@Value("bus")
	@Value("${vehicle-type}")
	//@Value("{${petrol.engine.id},${diesel.engine.id},${vehicle.type}}")
	private String type;
	@Autowired
	private Engine engg;
	
	
	
	public void journey(String startPlace,String endPlace) {
		System.out.println("Vehicle.journey()::: journey started from   "+startPlace);
		engg.start();
		System.out.println("Vehicle :: journey is going  on...............in vahicle of type     "+type);
		engg.end();
		System.out.println("Vehicle.journey():::::journey ended at   "+endPlace);
		
		
	}

}
