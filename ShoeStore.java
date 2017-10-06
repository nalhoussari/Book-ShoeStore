package ca.bcit.comp1451.assignment1.alhoussari;

import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * ShoeStore class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class ShoeStore extends Store{
	
    private ShoeType department;

	/**
	 * @param streetAddress
	 * @param name
	 * @param department
	 */
    public ShoeStore(Address address, String name, ShoeType department){
        super(address, name);
        setDepartment(department);
        addShoes();
	}
    
    /**
     * Another constructor for the ShoeStore class.
     * @param address
     * @param name
     * @param specialty
     */
    public ShoeStore(Address address, String name, String department){
        super(address, name);
        this.department = ShoeType.get(department);        
        addShoes();
    }

	/**
	 * @return the specialty
	 */
	public ShoeType getDepartment() {
		return department;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public final void setDepartment(ShoeType department) {
		this.department = department;
	}
	
    /**
     * Add shoes to the ShoeStore class
     */
	public void addShoes(){
        Name name = new Name("Skechers");
        Material material = Material.get("leather");
        ShoeType shoeType = ShoeType.get("men");
        Shoe s1 = new Shoe(1.0, 58.5, 90.0, "Diameter", material, 10, name, shoeType, java.awt.Color.DARK_GRAY);
        addItem(s1);
        
        name = new Name("Robert", "Cobbler");
        material = Material.get("leather");
        shoeType = ShoeType.get("dress");
        Shoe s2 = new Shoe(1.15, 104.0, 160.0, "Wave", material, 12, name, shoeType, java.awt.Color.BLACK);
        addItem(s2);
        
        name = new Name("Geox");
        material = Material.get("cloth");
        shoeType = ShoeType.get("men");
        Shoe s3 = new Shoe(1.0, 110.5, 170.0, "Monet", material, 7, name, shoeType, java.awt.Color.BLUE);
        addItem(s3);
        
        name = new Name("Nine", "West");
        material = Material.get("plastic");
        shoeType = ShoeType.get("women");
        Shoe s4 = new Shoe(0.85, 84.5, 130.0, "Camya Multi Glitter", material, 8, name, shoeType, java.awt.Color.BLACK);
        addItem(s4);
        
        name = new Name("Geox");
        material = Material.get("plastic");
        shoeType = ShoeType.get("women");
        Shoe s5 = new Shoe(0.9, 97.5, 150.0, "Marieclaire", material, 10, name, shoeType, java.awt.Color.GRAY);
        addItem(s5);
        
        name = new Name("Stride", "Rite");
        material = Material.get("rubber");
        shoeType = ShoeType.get("children");
        Shoe s6 = new Shoe(0.6, 45.5, 70.0, "Balance Of The Force", material, 9, name, shoeType, java.awt.Color.GRAY);
        addItem(s6);
        
        name = new Name("Sperry");
        material = Material.get("cloth");
        shoeType = ShoeType.get("children");
        Shoe s7 = new Shoe(0.7, 39.0, 60.0, "Top-Sider Unisex Bluefish H&L", material, 9, name, shoeType, java.awt.Color.ORANGE);
        addItem(s7);
        
        name = new Name("Skechers");
        material = Material.get("plastic");
        shoeType = ShoeType.get("children");
        Shoe s8 = new Shoe(0.85, 32.5, 50.0, "Lite Kicks Rainbow Sprite", material, 10, name, shoeType, java.awt.Color.PINK);
        addItem(s8);
        
        name = new Name("Robert", "Cobbler");
        material = Material.get("cloth");
        shoeType = ShoeType.get("children");
        Shoe s9 = new Shoe(0.5, 39.0, 60.0, "Toachi", material, 5, name, shoeType, java.awt.Color.BLUE);
        addItem(s9);
        
        name = new Name("Nike");
        material = Material.get("rubber");
        shoeType = ShoeType.get("sports");
        Shoe s10 = new Shoe(1.2, 117.0, 180.0, "Jordan Ace 23 II", material, 13, name, shoeType, java.awt.Color.WHITE);
        addItem(s10);
    
	}
	
    /**
     * A method that displays all shoes and designers.
     */
    public void displayAllShoesAndDesigners(){
    	 Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
         Iterator<Shoe> it = shoes.iterator();
         boolean displayedSome = false;
         while(it.hasNext()){
             Shoe s = (Shoe)it.next();
             System.out.println(s.getDesigner().getFullName() + " offers " + s.getTheMaterial() + " size-" + s.getSize() + " " + s.getTheShoeType() + "'s " + 
             s.getUniqueID());
             displayedSome = true;
         }	
         if(displayedSome == false){
             System.out.println("No shoes available by any designer");  
         }
    }
    
    /**
     * A method that displays all shoes by designer over given the parameter of the designer name.
     * @param designerName
     */
    public void displayAllShoesByDesigner(String designerName){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        if(designerName != null){
           while(it.hasNext()){
               Shoe s = (Shoe)it.next();
               if(designerName.equalsIgnoreCase(s.getDesigner().getLastName())){
                   System.out.println(s.getDesigner().getLastName() + " offers a " + "size-" + s.getSize() + " " + s.getTheShoeType() + "'s " + 
                   s.getDescription());
                   displayedSome = true;
               }    
           }      
           if(displayedSome == false){
               System.out.println("No shoes by " + ((designerName.trim().toUpperCase().substring(0, 1)) + (designerName.trim().toLowerCase().substring(1))));  
           }	
        }
    }
    
    /**
     * A method that displays all shoes that made of the given the parameter of the Material.
     * @param material as a Material
     */
    public void displayAllShoesMadeOf(Material material){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        if(material !=null){
            while(it.hasNext()){
                Shoe s = (Shoe)it.next();
                if(material.getTheMaterial().equals(s.getTheMaterial())){
                    System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of " + s.getTheMaterial());
                    displayedSome = true;
                }    
            }      
            if(displayedSome == false){
               System.out.println("No shoes made of " + material);  
            }	
        }
    }
    
    /**
     * A method that displays all shoes that made of the given the parameter of the material.
     * @param material as a String
     */
    public void displayAllShoesMadeOf(String material){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        if(material != null){
            while(it.hasNext()){
                Shoe s = (Shoe)it.next();
                if(material.equalsIgnoreCase(s.getTheMaterial())){
                    System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of " + s.getTheMaterial());
                    displayedSome = true;
                }    
            }      
            if(displayedSome == false){
                System.out.println("No shoes made of " + material.toLowerCase());  
            }	
        }
    }
    
    /**
     * A method that displays number of shoes that made by a given the parameter of the designer last name.
     * @param designer as a Name
     */
    public void displayNumberOfShoesDesignedBy(Name designer){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        int numberOfShoes = 0;
        if(designer !=null){
            while(it.hasNext()){
                Shoe s = (Shoe)it.next();
                if(designer.getFullName().equalsIgnoreCase(s.getDesigner().getFullName())){
                    numberOfShoes += 1;
                    displayedSome = true;
                }    
            } 
            System.out.println("This store has " + numberOfShoes + " shoes designed by " + designer.getFullName()); 
        }    	  
    }
    
    
    /**
     * A method that displays number of shoes that made by a given the parameter of the designer last name.
     * @param designerLastName as a String
     */
    public void displayNumberOfShoesDesignedBy(String designerLastName){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        int numberOfShoes = 0;
        if(designerLastName != null){
            if(it.hasNext()){
                while(it.hasNext()){
                    Shoe s = (Shoe)it.next();
                    if(designerLastName.equalsIgnoreCase(s.getDesigner().getLastName())){
            	       numberOfShoes++;
                    }    
                }
                System.out.println("This store has " + numberOfShoes + " shoes designed by " + ((designerLastName.trim().toUpperCase().substring(0, 1)) + (designerLastName.trim().toLowerCase().substring(1))));     	
            }else{
                System.out.println("No shoes designed by " + ((designerLastName.trim().toUpperCase().substring(0, 1)) + (designerLastName.trim().toLowerCase().substring(1))));   
            }
        }
    }
      
    /**
     * A method that displays the smallest shoe size
     */
    public void displaySmallestShoeSize(){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        int smallestSize = 20;
        if(it.hasNext()){
            while(it.hasNext()){
               Shoe s = (Shoe)it.next();
               if(s.getSize() < smallestSize){
                  smallestSize = s.getSize();
               }    
            } 
            System.out.println("smallest shoe size: " + smallestSize);  
        }else{
        	System.out.println("no shoes to determine the smallest shoe size");
        }
    }
    
    /**
     * A method that displays total weight kg of all shoes
     */
    public void displayTotalWeightKgOfAllShoes(){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        double totalWeight = 0;
        if (it.hasNext()){
            while(it.hasNext()){
                Shoe s = (Shoe)it.next();
                totalWeight += s.getWeightKg();   
            } 
            System.out.println("total kg of shoes: " + totalWeight); 
        }else{
        	System.out.println("no shoes to determine the total kg of shoes");
        }
    }

    /**
     * Display all shoes of the given parameter of material made by the given parameter of designer
     * @param m as Material
     * @param designer as Name
     */
    public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        if(m != null && designer !=null){
            if(it.hasNext()){
                while(it.hasNext()){
                    Shoe s = (Shoe)it.next();   
                    if(m.getTheMaterial().equals(s.getTheMaterial()) && designer.getFullName().equals(s.getDesigner().getFullName())){
                        System.out.println("The " + s.getDescription() + " is a " + m.getTheMaterial() + " shoe offered by " + s.getDesigner().getLastName());
                        displayedSome = true;
                    }
                } 
                if(displayedSome == false){
                    System.out.println("This store has no " + m.getTheMaterial() + " shoes designed by " + designer.getFullName());
                }
            } 
        }
    }
    
    /**
     * A method that displays all shoes 
     */
    public void displayAllShoesNotInMatchingStore(){
        Collection<Shoe> shoes = getCollectionOfItems(); // From the Store class
        Iterator<Shoe> it = shoes.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Shoe s = (Shoe)it.next();
            if(!(s.getTheShoeType().equalsIgnoreCase(department.getTheShoeType()))){
                System.out.println("The " + s.getDescription() + " is a " + s.getTheShoeType() + "'s shoe offered by " + s.getDesigner().getFullName());
                displayedSome = true;
            }    
        }      
        if(displayedSome == false){
            System.out.println("No shoes not in matching store");  
        }
    }
}
