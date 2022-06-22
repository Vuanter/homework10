public class Book {
    private final String bookName;

    Author author;
    private int publishedYear;

    public Book(String bookName, Author author, int publishedYear) {

        this.bookName = bookName;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getBookName() {
        return this.bookName;
    }
    Author getAuthor() {
        return this.author;
    }
    public int getPublishedYear() {
        return this.publishedYear;
    }
    public void setPublishedYear(int newPublishedYear) {
        this.publishedYear = newPublishedYear;
    }


    @Override
    public boolean equals(Object object) {
        Book object1 = (Book) object;
        if (this == object) return true;

        else if (this.bookName == object1.getBookName() && (this.author == object1.getAuthor()) && this.publishedYear == object1.getPublishedYear() )
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.bookName.hashCode();
    }

    @Override
    public String toString(){
        return "Название книги : " + this.bookName + " Год выпуска " + this.publishedYear;
    }
}
