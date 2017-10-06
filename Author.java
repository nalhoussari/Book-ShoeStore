package ca.bcit.comp1451.assignment1.alhoussari;

/**
 * Name class
 * @author Noor Alhoussari - A00981362
 * @version 4 November 2016
 */

public class Author {
	
	public final static String DEFAULT_PSEUDONYM = "Default";
	
	private Date birthDate;
	private Name name;
	private BookType genre;
	private String pseudonym;
	/**
	 * @param birthDate
	 * @param name
	 * @param genre
	 * @param pseudonym
	 */
	public Author(Date birthDate, Name name, BookType genre, String pseudonym) {
		super();
		setBirthDate(birthDate);
		setName(name);
		setGenre(genre);
		setPseudonym(pseudonym);
	}
	/**
	 * @param birthDate
	 * @param name
	 * @param genre
	 */
	public Author(Date birthDate, Name name, BookType genre) {
		super();
		setBirthDate(birthDate);
		setName(name);
		setGenre(genre);
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public final void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(Name name) {
		this.name = name;
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
	 * @return the pseudonym
	 */
	public String getPseudonym() {
		return pseudonym;
	}
	/**
	 * @param pseudonym the pseudonym to set
	 */
	public final void setPseudonym(String pseudonym) {
		if (pseudonym != null && pseudonym.trim().length() > 0) {
            this.pseudonym = pseudonym.trim();
        }
        if (this.pseudonym == null) {
            this.pseudonym = DEFAULT_PSEUDONYM;
        }		
	}
	/**
	 * @param Author name as a full name
	 */
	public String getAuthorName(){
		return name.getFullName();
	}
	
	public String getGenreString2() {
		// TODO Auto-generated method stub
		return genre.getTheBookType();
	}

}
