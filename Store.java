package ca.bcit.comp1451.assignment1.alhoussari;

import java.util.Collection;
import java.util.HashMap;

/**
 * Store class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Store {
	
	public static String DEFAULT_NAME = "Name";

	private Address streetAddress;
	private String name;
	private HashMap<String, Item> itemsForSale;
	
	
	/**
	 * @param streetAddress
	 * @param name
	 * @param itemsForSale
	 */
	public Store(Address streetAddress, String name) {
		super();
		setStreetAddress(streetAddress);
		setName(name);
		setItemsForSale(itemsForSale);
		itemsForSale = new HashMap<String, Item> ();
		
	}
	public Store(){
		itemsForSale = new HashMap<String, Item> ();
		
	}
	
	/**
	 * @return the streetAddress
	 */
	public Address getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public final void setStreetAddress(Address streetAddress) {
		if (streetAddress != null){
		this.streetAddress = streetAddress;
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		if (name != null && name.trim().length() > 0) {
            this.name = name;
        }
        if (this.name == null) {
            this.name = DEFAULT_NAME;
        }
	}
	/**
	 * @return the items
	 */
	public HashMap<String, Item> getItemsForSale() {
		return itemsForSale;
	}
	/**
	 * @param items the items to set
	 */
	public final void setItemsForSale(HashMap<String, Item> itemsForSale) {
		this.itemsForSale = itemsForSale;
	}
	
	/**
	 * @param add items to the items for sale
	 */
	public void addItem(Item item){
		if(item != null){
		   itemsForSale.put(item.getUniqueID(), item);
		}
	}
	
	public Item getItemByKey(String key){
		return itemsForSale.get(key);
	}
	
	public Collection getCollectionOfItems(){
		return itemsForSale.values();
	}
	

}
