package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
@Named("vehicle")
@Scope("singleton")
@Lazy
public class Vehicle {
	
	@Value("bus")
	private String type;
	
	//field level
//	@Inject
//	@Named("peEngg")
//	@Resource(name="peEngg")
	private Engine engg;
	
	
	
	  //constructor injection
	// @Inject 
	// @Resource(name="peEgg")
	 //@Named("diEngg") 
	   public Vehicle(@Named("diEngg")Engine engg) {
	  super();
	   this.engg = engg; 
	   }
	 
	 
	
	  // setter injection
	  
	  @Inject
	   //@Named("diEngg")
	  @Resource(name="peEngg")
	  public void setEngg(Engine engg) {
		  System.out.println("Vehicle.setEngg()");
		  this.engg = engg; 
		  }
	 
	 
	
	//arbitary method
	
	
 // @Inject
//	@Named("peEngg") 
 // @Resource(name="diEngg")
	public void assign(Engine engg){
	  System.out.println("Vehicle.assign()");
	 this.engg=engg;
	  
	  }
	 
	 
	
	



	public void journey(String startPlace,String endPlace) {
		System.out.println("Vehicle.journey()::: journey started from   "+startPlace);
		engg.start();
		System.out.println("Vehicle :: journey is going  on...............in vahicle of type     "+type);
		engg.end();
		System.out.println("Vehicle.journey():::::journey ended at   "+endPlace);
		
		
	}



	

}
