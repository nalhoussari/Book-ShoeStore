package ca.bcit.comp1451.assignment1.alhoussari; 

/**
 * Name class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Name {
	
	public final static String DEFAULT_FIRST_NAME = "FirstName"; 
	public final static String DEFAULT_LAST_NAME = "LastName";
	public final static String DEFAULT_MIDDLE_NAME = "MiddleName"; 

	private String firstName;
	private String middleName;
	private String lastName;
	/**
	 * @param firstName
	 */
	public Name(String lastName) {
		super();
		setLastName(lastName);
	}
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Name(String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
	}
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 */
	public Name(String firstName, String middleName, String lastName) {
		super();
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(String firstName) {
		if (firstName != null && firstName.trim().length() > 0) {
            this.firstName = (firstName.trim().toUpperCase().substring(0, 1)) +  (firstName.trim().substring(1));
        }
        if (this.firstName == null) {
            this.firstName = DEFAULT_FIRST_NAME;
        }
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public final void setMiddleName(String middleName) {
		if (middleName != null && middleName.trim().length() > 0) {
            this.middleName = (middleName.trim().toUpperCase().substring(0, 1)) +  (middleName.trim().substring(1));
        }
        if (this.middleName == null) {
            this.middleName = DEFAULT_MIDDLE_NAME;
        }
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(String lastName) {
		if (lastName != null && lastName.trim().length() > 0) {
            this.lastName = (lastName.trim().toUpperCase().substring(0, 1)) +  (lastName.trim().substring(1));
        }
        if (this.lastName == null) {
            this.lastName = DEFAULT_LAST_NAME;
        }
	}
	
	public String getFullName(){
	    if (getFirstName() == null){
	       return getLastName();
	   }else if (getFirstName() != null && getMiddleName() == null){
	       return getFirstName() + " " + getLastName();
	   }else{
		   return getFirstName() + " " + getMiddleName() + " " + getLastName();
	   }
    }
}
