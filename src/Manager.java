public class Manager extends BorrowHandler {
    @Override
    public void handleRequest(String bookTitle, User user) {
        System.out.println("Manager approved: " + bookTitle + " for premium user " + user.getName());
    }
}
