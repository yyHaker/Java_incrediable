package com.yy.pattern.product;


public class Property implements AutoInsurance {
   private String description;

   public String getInfo() {
	   description = "Property-Damage Liability Coverage: "+
	                  "This coverage pays for the repair "+
	                  "and replacement of vehicles and "+
	                  "other property damaged when you "+
	                  "or another authorized driver  "+
	                  "causes an accident";
	   return description;
   }
}
