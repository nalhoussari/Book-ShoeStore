package ca.bcit.comp1451.assignment1.alhoussari;

/**
 * Item class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Item {

	public final static double DEFAULT_WEIGHT_KG = 0.0; 
	public final static double DEFAULT_MANUFACTURING_PRICE_DOLLARS = 0.0; 
	public final static double DEFAULT_SUGGESTED_RETAIL_PRICE_DOLLARS = 0.0; 
	public final static String DEFAULT_UNIQUE_ID = "0000"; 
	
	private double weightKg;
	private double manufacturingPriceDollars;
	private double suggestedRetailPriceDollar;
	private String uniqueID;
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollar
	 * @param uniqueID
	 */
	public Item(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollar, String uniqueID) {
		super();
		setWeightKg(weightKg);
		setManufacturingPriceDollars(manufacturingPriceDollars);
		setSuggestedRetailPriceDollar(suggestedRetailPriceDollar);
		setUniqueID(uniqueID);
	}
	
	/**
	 * zero-parameter constructor for Item
	 */
	public Item(){
	}
	/**
	 * @return the weightKg
	 */
	public double getWeightKg() {
		return weightKg;
	}
	/**
	 * @param weightKg the weightKg to set
	 */
	public final void setWeightKg(double weightKg) {
		if(weightKg > 0.0) {
		    this.weightKg = weightKg;
		} else {
			this.weightKg = DEFAULT_WEIGHT_KG;
		}
	}
	/**
	 * @return the manufacturingPriceDollars
	 */
	public double getManufacturingPriceDollars() {
		return manufacturingPriceDollars;
	}
	/**
	 * @param manufacturingPriceDollars the manufacturingPriceDollars to set
	 */
	public final void setManufacturingPriceDollars(double manufacturingPriceDollars) {
		if(manufacturingPriceDollars > 0.0) {
		    this.manufacturingPriceDollars = manufacturingPriceDollars;
		} else {
			this.manufacturingPriceDollars = DEFAULT_MANUFACTURING_PRICE_DOLLARS;
		}
	}
	/**
	 * @return the suggestedRetailPriceDollar
	 */
	public double getSuggestedRetailPriceDollar() {
		return suggestedRetailPriceDollar;
	}
	/**
	 * @param suggestedRetailPriceDollar the suggestedRetailPriceDollar to set
	 */
	public final void setSuggestedRetailPriceDollar(double suggestedRetailPriceDollar) {
		if(suggestedRetailPriceDollar > 0.0) {
		    this.suggestedRetailPriceDollar = suggestedRetailPriceDollar;
		} else {
			this.suggestedRetailPriceDollar = DEFAULT_SUGGESTED_RETAIL_PRICE_DOLLARS;
		}
	}
	/**
	 * @return the uniqueID
	 */
	public String getUniqueID() {
		return uniqueID;
	}
	/**
	 * @param uniqueID the uniqueID to set
	 */
	public final void setUniqueID(String uniqueID) {
		if (uniqueID != null && uniqueID.trim().length() > 0) {
            this.uniqueID = (uniqueID.trim().toUpperCase().substring(0, 1)) +  (uniqueID.trim().substring(1));
        }
        if (this.uniqueID == null) {
            this.uniqueID = DEFAULT_UNIQUE_ID;
        }  
	}	
	
}
