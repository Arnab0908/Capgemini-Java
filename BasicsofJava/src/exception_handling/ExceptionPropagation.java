package exception_handling;


public class ExceptionPropagation {

    public static int getNameLength(String s) {
        return s.length(); // Exception occurs here
    }

    public static void main(String[] args) {

        System.out.println("Program Started");

        String s = null;

        try {
            System.out.println(getNameLength(s));
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }

        System.out.println("Program Stopped");
    }
}
