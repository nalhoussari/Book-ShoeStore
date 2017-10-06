package ca.bcit.comp1451.assignment1.alhoussari;

/**
 * Address class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Address {
	
	public final static String STREET_NUMBER = "0000";
	public final static String STREET_NAME = "Default Street Name";
	public final static String CITY = "Vancouver";
	public final static String POSTAL_CODE = "A1A 1A1";


	private String streetNumber;
	private String streetName;
	private String city;
	private String postalCode;
	
	/**
	 * @param streetNumber
	 * @param streetName
	 * @param city
	 * @param postalCode
	 */
	public Address(String streetNumber, String streetName, String city, String postalCode) {
		super();
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setCity(city);
		setPostalCode(postalCode);
	}
	
	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public final void setStreetNumber(String streetNumber) {
		if (streetNumber != null && streetNumber.trim().length() > 0) {
            this.streetNumber = streetNumber.trim();
        }
        if (this.streetNumber == null) {
            this.streetNumber = STREET_NUMBER;
        }
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public final void setStreetName(String streetName) {
		if (streetName != null && streetName.trim().length() > 0) {
            this.streetName = (streetName.trim().toUpperCase().substring(0, 1)) +  (streetName.trim().toLowerCase().substring(1));
        }
        if (this.streetName == null) {
            this.streetName = STREET_NAME;
        }
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		if (city != null && city.trim().length() > 0) {
            this.city = (city.trim().toUpperCase().substring(0, 1)) +  (city.trim().toLowerCase().substring(1));
        }
        if (this.city == null) {
            this.city = CITY;
        }
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public final void setPostalCode(String postalCode) {
		if (postalCode != null && postalCode.trim().length() > 0) {
            this.postalCode = postalCode.trim().toUpperCase();
        }
        if (this.postalCode == null) {
            this.postalCode = POSTAL_CODE;
        }
	}

	/**
	 * @return full address
	 */
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", streetName=" + streetName + ", city=" + city
				+ ", postalCode=" + postalCode + "]";
	}
	
	
	

}
