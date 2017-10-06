package ca.bcit.comp1451.assignment1.alhoussari;

import java.util.Map;
import java.util.HashMap;

/**
 * Material enum
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public enum Material {
    PLASTIC("plastic"),LEATHER("leather"),RUBBER("rubber"),
    CLOTH("cloth");
   
    private String theMaterial;
   
    private static Map<String,Material>lookup = new HashMap<String,Material>();
   
    static{
        for(Material m : Material.values()){
            lookup.put(m.getTheMaterial(), m);
        }
    }
    private Material(String theMaterial){
        this.theMaterial = theMaterial;
    }
   
    public String getTheMaterial(){
        return theMaterial;       
    }
   
    //the following method allows me to create a Material enum from a String!
    //e.g. in the Shoe class, I could set the Material instance variable to:
    //Material = Material.get("leather");
    public static Material get(String theMaterial){
        return lookup.get(theMaterial);
    }
}

