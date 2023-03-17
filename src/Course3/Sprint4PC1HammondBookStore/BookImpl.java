package Course3.Sprint4PC1HammondBookStore;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author();
        author.setAuthorName("Stephen King");
        author.setAuthorPenName("Richard Bachman");
        book.setIsbn("978-0451192004");
        book.setTitle("The Long Walk");
        book.setDescription("A group of teenage boys are selected to take part in a grueling walking contest, where the last person standing wins.");
        book.setPrice(10.99);
        book.setAuthor(author);
        book.displayBookDetails();
    }
}
