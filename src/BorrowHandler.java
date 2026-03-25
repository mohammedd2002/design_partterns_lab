public abstract class BorrowHandler {
    protected BorrowHandler nextHandler;

    public void setNext(BorrowHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(String bookTitle, User user);
}
