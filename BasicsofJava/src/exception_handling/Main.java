package exception_handling;


public class Main {

    public static void main(String[] args) {

        Student s = new Student();

        try {
            s.setName("Ab");
            s.setAge(-5);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        s.show();
    }
}