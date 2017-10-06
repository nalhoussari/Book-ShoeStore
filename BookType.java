package ca.bcit.comp1451.assignment1.alhoussari;

import java.util.Map;
import java.util.HashMap;

/**
 * BookType enum
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public enum BookType {
    FICTION("fiction"),NONFICTION("nonfiction"),SCIENCEFICTION("sciencefiction"),
    REFERENCE("reference");
   
    private String theBookType;
   
    private static Map<String,BookType>lookup = new HashMap<String,BookType>();
   
    static{
        for(BookType b : BookType.values()){
            lookup.put(b.getTheBookType(), b);
        }
    }
    private BookType(String theBookType){
        this.theBookType = theBookType;
    }
   
    public String getTheBookType(){
        return theBookType;       
    }
   
    //the following method allows me to create a BookType enum from a String!
    //e.g. in the Book class, I could set the BookType instance variable to:
    //bookType = BookType.get("fiction");
    public static BookType get(String theBookType){
        return lookup.get(theBookType);
    }
}
