package ca.bcit.comp1451.assignment1.alhoussari;

/**
 * Book class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Book extends Item{
	public final static String DEFAULT_TITLE = "Book Title";

	private Author author;
	private Date datePublished;
	private String title;
	private BookType genre;
	
	/**
	 * @param weightKg
	 * @param manufacturingPriceDollars
	 * @param suggestedRetailPriceDollar
	 * @param uniqueID
	 * @param author
	 * @param datePublished
	 * @param title
	 * @param genre
	 */
	public Book(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollar, String uniqueID,
			Author author, Date datePublished, String title, BookType genre) {
		super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollar, uniqueID);
		setAuthor(author);
		setDatePublished(datePublished);
		setTitle(title);
		setGenre(genre);
	}
	
	/**
	 * zero parameter constructor
	 */
	public Book(){
	super();
	}
	
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public final void setAuthor(Author author) {
		this.author = author;
	}
	/**
	 * @return the datePublished
	 */
	public Date getDatePublished() {
		return datePublished;
	}
	/**
	 * @param datePublished the datePublished to set
	 */
	public final void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public final void setTitle(String title) {
		if (title != null && title.trim().length() > 0) {
            this.title = (title.trim().toUpperCase().substring(0, 1)) + (title.trim().substring(1));
        }
        if (this.title == null) {
            this.title = DEFAULT_TITLE;
        }
	}
	/**
	 * @return the genre
	 */
	public BookType getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public final void setGenre(BookType genre) {
		this.genre = genre;
	}
	
	/**
	 * return the item unique ID
	 */
	public String getISBN(){
		return super.getUniqueID();
	}
	
	public void setISBN(String ISBN){
		super.setUniqueID(ISBN);
	}
	
	/**
	 * @return the Genre as a String
	 */
	public String getGenreString(){
		return genre.getTheBookType();
	}
	
	/**
	 * @return the year published as an int
	 */
	public int getYearPublished(){
		return datePublished.getYear();
	}
	
	/**
	 * @return the Author full name
	 */
	public String getAuthorFullName(){
		return author.getAuthorName();
	}

}
