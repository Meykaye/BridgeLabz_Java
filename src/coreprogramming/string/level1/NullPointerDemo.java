package coreprogramming.string.level1;
public class NullPointerDemo {

    static void generateException() {
        String text = null;
        text.length();
    }

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

