package coreprogramming.string.level1;

// Program to demonstrate NullPointerException when calling methods on null reference
public class NullPointerDemo {

    // Attempt to call method on null reference to trigger exception
    static void generateException() {
        String text = null;
        text.length();
    }

    // Handle NullPointerException by catching it
    static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            handleException();
        }
    }
}

