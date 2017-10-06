package ca.bcit.comp1451.assignment1.alhoussari;

import java.util.Map;
import java.util.HashMap;

/**
 * ShoeType enum
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public enum ShoeType { 
        WOMEN("women"), MEN("men"), CHILDREN("children"), 
        DRESS("dress"), SPORTS("sports");
	   
	    private String theShoeType;
	   
	    private static Map<String,ShoeType>lookup = new HashMap<String, ShoeType>();
	   
	    static{
	        for(ShoeType s : ShoeType.values()){
	            lookup.put(s.getTheShoeType(), s);
	        }
	    }
	    private ShoeType(String theShoeType){
	        this.theShoeType = theShoeType;
	    }
	   
	    public String getTheShoeType(){
	        return theShoeType;       
	    }
	   
	    //the following method allows me to create a ShoeType enum from a String!
	    //e.g. in the Shoe class, I could set the ShoeType instance variable to:
	    //ShoeType = ShoeType.get("women");
	    public static ShoeType get(String theShoeType){
	        return lookup.get(theShoeType);
	    }
}
