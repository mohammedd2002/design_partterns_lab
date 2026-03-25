public class LibraryFacade {
    private LibraryService libraryService;
    private BorrowHandler handler;

    public LibraryFacade() {
        this.libraryService = LibraryService.getInstance();
        Librarian librarian = new Librarian();
        Manager manager = new Manager();
        librarian.setNext(manager);
        this.handler = librarian;
    }

    public void borrowBook(String title, User user) {
        handler.handleRequest(title, user);
        libraryService.borrowBook(title, user);
    }

    public void returnBook(String title) {
        libraryService.returnBook(title);
    }

    public void addBook(Book book) {
        libraryService.addBook(book);
    }
}
