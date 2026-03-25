public class PremiumBookDecorator extends BookDecorator {
    public PremiumBookDecorator(Book book) {
        super(book);
    }

    @Override
    public int getBorrowDays() {
        return super.getBorrowDays() + 10;
    }

    @Override
    public void borrowBook(User user) {
        book.borrowBook(user);
        System.out.println("Premium: You have " + getBorrowDays() + " days to return.");
    }
}
