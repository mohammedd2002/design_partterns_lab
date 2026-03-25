public abstract class BookDecorator extends Book {
    protected Book book;

    public BookDecorator(Book book) {
        super(book.getTitle());
        this.book = book;
    }

    public int getBorrowDays() {
        return 14;
    }
}
