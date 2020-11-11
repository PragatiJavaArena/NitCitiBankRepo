package com.nt.beans;

public class Example {
	int x;
	int y;
	
	public Example(int x,int y) {
		this.x=x;
		this.y=y;
	
	}
	public Example() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	  void m1(Example e) { x=x+1; e.x=e.x+3; }
	 //stop storing data  wise duplicate objects into collection in HashMap 
	  @Override
	public int hashCode() {
	return x;
	}
	  @Override
	public boolean equals(Object obj) {
		 if(obj instanceof Example) {
			 Example e=(Example)obj;
			 return this.x==e.x && this.y==e.y;
			 
		 }
		 return false;
	}
	  @Override
	public String toString() {
	
		return  "Example("+x+","+y+")" ;
	}

}
