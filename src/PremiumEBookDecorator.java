public class PremiumEBookDecorator extends BookDecorator {
    public PremiumEBookDecorator(Book book) {
        super(book);
    }

    @Override
    public void borrowBook(User user) {
        if (user.isPremium()) {
            book.borrowBook(user);
            System.out.println("Premium EBook access granted!");
        } else {
            System.out.println("Premium access required for this EBook.");
        }
    }
}
