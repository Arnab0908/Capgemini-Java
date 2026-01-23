package exception_handling;


public class Student {

    private String name;
    private int age;

    // checked exception
    public void setName(String name) throws InvalidNameException {
        if (name == null || name.length() < 3) {
            throw new InvalidNameException("Invalid Name");
        }
        this.name = name;
    }

    // unchecked exception
    public void setAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException("Invalid Age");
        }
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}