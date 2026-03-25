public class Librarian extends BorrowHandler {
    @Override
    public void handleRequest(String bookTitle, User user) {
        if (!user.isPremium()) {
            System.out.println("Librarian approved: " + bookTitle + " for " + user.getName());
        } else if (nextHandler != null) {
            System.out.println("Librarian forwarding to Manager...");
            nextHandler.handleRequest(bookTitle, user);
        }
    }
}
