package ca.bcit.comp1451.assignment1.alhoussari;

import java.awt.Color;

/**
 * Shoe class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Shoe extends Item{
	
	public final static int DEFAULT_SIZE = 0;
	
	private Material material;
	private int size;
	private Name designer;
	private ShoeType shoeType;
	private Color shoeColor;
	
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollar
	 * @param uniqueID
	 * @param material
	 * @param size
	 * @param designer
	 * @param shoeType
	 * @param shoeColor
	 */
	public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollar, String uniqueID,
			Material material, int size, Name designer, ShoeType shoeType, Color shoeColor) {
		super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollar, uniqueID);
		setMaterial(material);
		setSize(size);
		setDesigner(designer);
		setShoeType(shoeType);
		setShoeColor(shoeColor);
	}
	
	/**
	 * zero parameter constructor
	 */
	public Shoe(){
	    super();
	}
	
	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}
	
	/**
	 * @param material the material to set
	 */
	public final void setMaterial(Material material) {
		this.material = material;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public final void setSize(int size) {
		if (size > 0){
		    this.size = size;
		}else{
			this.size = DEFAULT_SIZE;
		}
	}
	/**
	 * @return the designer
	 */
	public Name getDesigner() {
		return designer;
	}
	/**
	 * @param designer the designer to set
	 */
	public final void setDesigner(Name designer) {
		this.designer = designer;
	}
	/**
	 * @return the shoeType
	 */
	public ShoeType getShoeType() {
		return shoeType;
	}
	/**
	 * @param shoeType the shoeType to set
	 */
	public final void setShoeType(ShoeType shoeType) {
		this.shoeType = shoeType;
	}
	/**
	 * @return the shoeColor
	 */
	public Color getShoeColor() {
		return shoeColor;
	}
	/**
	 * @param shoeColor the shoeColor to set
	 */
	public final void setShoeColor(Color shoeColor) {
		this.shoeColor = shoeColor;
	}
	/**
	 * @return shoe description
	 */
	public String getDescription(){
		return super.getUniqueID();
	}
	
	/**
	 * @param description as a String
	 */
	public void setDescription(String description){
		super.setUniqueID(description);
	}

	public String getTheMaterial() {
		// TODO Auto-generated method stub
		return material.getTheMaterial();
	}
	
	public String getTheShoeType() {
		// TODO Auto-generated method stub
	    return shoeType.getTheShoeType();
	}
	
	
	
	

}
