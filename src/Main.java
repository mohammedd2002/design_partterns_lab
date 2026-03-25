public class Main {
    public static void main(String[] args) {
        LibraryService library = LibraryService.getInstance();

        Book book1 = BookFactory.createBook("physical", "Harry Potter");
        Book book2 = BookFactory.createBook("ebook", "Clean Code");
        library.addBook(book1);
        library.addBook(book2);

        User user1 = new User("John", true);
        User user2 = new User("Jane", false);
        library.addObserver(user1);
        library.addObserver(user2);

        LibraryFacade facade = new LibraryFacade();

        System.out.println("Borrowing with Chain of Responsibility");
        facade.borrowBook("Harry Potter", user1);

        System.out.println("\nPremium Book Decorator");
        Book premiumBook = new PremiumBookDecorator(book1);
        premiumBook.borrowBook(user1);

        System.out.println("\nPremium EBook Access");
        Book premiumEBook = new PremiumEBookDecorator(book2);
        premiumEBook.borrowBook(user1);
        premiumEBook.borrowBook(user2);

        System.out.println("\nAdapter Pattern");
        ExternalBook external = new ExternalBook("Design Patterns", true, "Erich Gamma", 1994);
        Book adapted = new BookAdapter(external);
        System.out.println("Adapted book: " + adapted.getTitle());

        System.out.println("\nObserver Pattern");
        facade.returnBook("Harry Potter");
    }
}
