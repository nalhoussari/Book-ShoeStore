package ca.bcit.comp1451.assignment1.alhoussari;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * BookStore class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

class BookStore extends Store {
	
    private BookType specialty;

    /**
     * A constructor for BookStore class.
     * @param address
     * @param name
     * @param specialty
     */    
    public BookStore(Address address, String name, BookType specialty){
        super(address, name);
        setSpecialty(specialty);
        addBooks();
    }
    
    /**
     * Another constructor for the BookStore class.
     * @param address
     * @param name
     * @param specialty
     */
    public BookStore(Address address, String name, String specialty){
        super(address, name);
        this.specialty = BookType.get(specialty);
        addBooks();
    }  
    
    /**
	 * @return the specialty
	 */
	public BookType getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public final void setSpecialty(BookType specialty) {
		this.specialty = specialty;
	}
    
    /**
     * A method to addBooks to the BookStore class.
     */
    public void addBooks(){
        Date birthDate = new Date(1919, 1, 1);
        Name name = new Name("Jerome", "David", "Salinger");
        BookType genre = BookType.get("fiction");
        Author author = new Author(birthDate, name, genre, "JD");
        Date datePublished  = new Date(1951, 5, 14);
        String title = "The Catcher in the Rye";
        Book b1 = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
        addItem(b1);
       

        datePublished  = new Date(1948, 1, 31);
        title = "A Perfect Day for Bananafish";
        genre = BookType.get("fiction");
        Book b2 = new Book(1.00, 11.00, 12.00, "2345", author, datePublished, title, genre);
        addItem(b2); 

        datePublished  = new Date(1945, 12, 12);
        title = "A Boy in France";
        genre = BookType.get("fiction");
        Book b3 = new Book(2.00, 33.00, 35.00, "3456", author, datePublished, title, genre);
        addItem(b3);    

        birthDate = new Date(1963, 9, 3);
        name = new Name("Malcolm", "Gladwell");
        genre = BookType.get("nonfiction");
        author = new Author(birthDate, name, genre);
        datePublished  = new Date(2008, 11, 18);
        title = "Outliers";
        Book b4 = new Book(2.1, 2.00, 6.00, "4567", author, datePublished, title, genre);
        addItem(b4);


        datePublished  = new Date(2000, 3, 1);
        title = "The Tipping Point";
        genre = BookType.get("nonfiction");
        Book b5 = new Book(0.5, 3.00, 5.00, "5678", author, datePublished, title, genre);
        addItem(b5); 

        birthDate = new Date(1919, 11, 26);
        name = new Name("Frederik", "Pohl");
        genre = BookType.get("sciencefiction");
        author = new Author(birthDate, name, genre, "Paul Dennis Lavond") ;
        datePublished  = new Date(1977, 7, 4);
        title = "Gateway";
        Book b6 = new Book(0.01, 4.00, 4.00, "6789", author, datePublished, title, genre);
        addItem(b6);      

        datePublished  = new Date(1937, 10, 6);
        title = "Elegy to a Dead Planet: Luna";
        genre = BookType.get("sciencefiction");
        Book b7 = new Book(0.1, 5.00, 11.00, "abcd", author, datePublished, title, genre);
        addItem(b7)  ;  

        birthDate = new Date(1918, 5, 11);
        name = new Name("Richard", "Phillips", "Feynman");
        genre = BookType.get("reference");
        author = new Author(birthDate, name, genre) ;
        datePublished  = new Date(1942, 5, 20);
        title = "Principle of Least Action in Quantum Mechanics";
        Book b8 = new Book(0.8, 15.00, 30.00, "efgh", author, datePublished, title, genre);
        addItem(b8);       

        datePublished  = new Date(1964, 6, 30);
        title = "The Messenger Lectures";
        genre = BookType.get("reference");
        Book b9 = new Book(0.6, 44.00, 45.5, "ijkl", author, datePublished, title, genre);
        addItem(b9);             

        datePublished  = new Date(1985, 11, 1);
        title = "Surely You're Joking Mr. Feynman";
        genre = BookType.get("nonfiction");
        Book b10 = new Book(1.0, 3.00, 13.00, "mnop", author, datePublished, title, genre);
        addItem(b10); 
    }
    
    /**
     * A method that displays all books written by every author.
     */
    public void displayAllBooksByEveryAuthor(){
    	 Collection<Book> books = getCollectionOfItems(); // From the Store class
    	 Iterator<Book> it = books.iterator();
         boolean displayedSome = false;
         while(it.hasNext()){
             Book b = (Book)it.next();
             System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " in " + b.getDatePublished().getYear());
             displayedSome = true;
         }	
         if(displayedSome == false){
             System.out.println("No books available by any author");  
         }
    }
    
    /**
     * A method that displays all books written by the author over given the parameter of the author's last name.
     * @param lastName
     */
    public void displayAllBooksByAuthor(String lastName){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        if (lastName != null){
            while(it.hasNext()){
               Book b = (Book)it.next();
               if(lastName.equals(b.getAuthor().getName().getLastName())){
                   System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle());
                   displayedSome = true;
               }    
            }      
            if(displayedSome == false){
               System.out.println("No books by author " + lastName);  
            }
        }
    }
    
    /**
     * A method that displays all books written before a specified year, over the given parameter age in years.
     * @param year
     */
    public void displayAllBooksWrittenBefore(int year){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Book b = (Book)it.next();
            if(b.getDatePublished().getYear() < year){
                System.out.println(b.getTitle() + " was published in " + b.getDatePublished().getYear() + ", which is before " + year);
                displayedSome = true;
            }    
        }      
        if(displayedSome == false){
            System.out.println("No books were published before " + year);  
        }
    }
    
    /**
     * A method that displays titles of books written by authors, over the given parameter of the author's pseudonym.
     * @param pseudonym
     */
    public void displayTitlesOfBooksWrittenBy(String pseudonym){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        if(pseudonym !=null){
           while(it.hasNext()){
               Book b = (Book)it.next();
               if(pseudonym.equals(b.getAuthor().getPseudonym())){
                  System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
                  displayedSome = true;
               }    
           }      
           if(displayedSome == false){
            System.out.println("No books were written by " + pseudonym);  
           }
        }
    }
    
    /**
     * A method that displays titles of books written by authors, over the given parameter of the author's pseudonym.
     * @param genre
     */
    public void displayAllBooksForGenre(String genre){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        if(genre != null){
           while(it.hasNext()){
               Book b = (Book)it.next();
               if(genre.equals(b.getGenreString())){
                   System.out.println(b.getTitle() + " is a " + b.getGenreString().toLowerCase() + " book written by " + b.getAuthor().getName().getLastName());
                   displayedSome = true;
               }    
           }      
           if(displayedSome == false){
               System.out.println("No " + genre.toLowerCase() + " books are available!");  
           }
        }
    }
    
    /**
     * A method that displays the total weight of all books.
     */
    public void displayTotalWeightKgOfAllBooks(){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        double totalWeight = 0.0;
        while(it.hasNext()){
            Book b = (Book)it.next();
            totalWeight += b.getWeightKg(); 
            displayedSome = true;
        }      
        System.out.println("total kg of books: " + totalWeight);
        if(displayedSome == false){
            System.out.println("No books to display total weight");  
        }
    }
    
    /**
     * A method that displays all book written by the authors over the given parameter age in years.
     * @param ageInYears
     */

    public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Book b = (Book)it.next();
            int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
            if(ageYears > ageInYears){
                System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + " at age " + ageYears + 
                        ", which is more than " + ageInYears);
                displayedSome = true;
            }    
        }      
        if(displayedSome == false){
            System.out.println("No books by authors over age " + ageInYears);  
        }
    }
    
    /**
     * A method that displays all books written by authors born on a give parameter of day of the week.
     * @param dayOfTheWeek
     */
    public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        if(dayOfTheWeek !=null){
           while(it.hasNext()){
               Book b = (Book)it.next();
               if(dayOfTheWeek.equalsIgnoreCase(b.getAuthor().getBirthDate().getDayOfTheWeek())){
                  System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + ", who was born on a " + b.getAuthor().getBirthDate().getDayOfTheWeek());
                  displayedSome = true;
               }    
           }      
           if(displayedSome == false){
              System.out.println("No authors were born on a " + ((dayOfTheWeek.trim().toUpperCase().substring(0, 1)) +  (dayOfTheWeek.trim().toLowerCase().substring(1))));  
           }
        }
    }
    
    /**
     * A method that displays all the books that were published on a give parameter of day of the week.
     * @param dayOfTheWeek
     */
    public void displayAllBooksPublishedOn(String dayOfTheWeek){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        if(dayOfTheWeek != null){
           while(it.hasNext()){
               Book b = (Book)it.next();
               if(dayOfTheWeek.equalsIgnoreCase(b.getDatePublished().getDayOfTheWeek())){
                  System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + ", which was published on a " + b.getDatePublished().getDayOfTheWeek());
                  displayedSome = true;
               }    
           }      
           if(displayedSome == false){
               System.out.println("No books were published on a " + ((dayOfTheWeek.trim().toUpperCase().substring(0, 1)) +  (dayOfTheWeek.trim().substring(1))));  
           }
        }
    }
    
    /**
     * A method that displays all books written by authors with a pseudonym
     */
    public void displayAllBooksWrittenByAuthorsWithAPseudonym(){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Book b = (Book)it.next();
            if(b.getAuthor().getPseudonym() != null && !(b.getAuthor().getPseudonym().equals(b.getAuthor().DEFAULT_PSEUDONYM))){
                System.out.println(b.getAuthor().getName().getLastName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
                displayedSome = true;
            }    
        }      
        if(displayedSome == false){
            System.out.println("No books were written by authors with a pseudonym");  
        }
    }
    
    /**
     * A method that displays book with the biggest percentage markup.
     */
    public void displayBookWithBiggestPercentageMarkup(){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        double highestMarkupRate = 0.0;
        Book b1 = new Book();
        while(it.hasNext()){
            Book b = (Book)it.next();
            double markup = b.getSuggestedRetailPriceDollar() - b.getManufacturingPriceDollars();
            double markupRate = (markup / b.getManufacturingPriceDollars()) * 100;
            if(markupRate > highestMarkupRate){
            	b1 = b;
            	highestMarkupRate = markupRate;
            }
        } 
        System.out.println("Highest markup is " + highestMarkupRate + "%, for " + b1.getTitle() + " by " + b1.getAuthor().getName().getLastName());
    }
    
    /**
     * A method that displays all books written out side specialty
     */
    public void displayAllBooksWrittenOutsideSpecialty(){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Book b = (Book)it.next();
            if(!b.getGenreString().equalsIgnoreCase(b.getAuthor().getGenreString2())){
                System.out.println(b.getAuthor().getName().getLastName() + " usually wrote " + b.getAuthor().getGenreString2() + " but wrote " + b.getTitle() + " which is " + b.getGenreString());
                displayedSome = true;
            }    
        }      
        if(displayedSome == false){
            System.out.println("No books were written out side specialty");  
        }
    }
    

}
