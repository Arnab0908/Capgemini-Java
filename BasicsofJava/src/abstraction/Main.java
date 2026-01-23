package abstraction;

public class Main {
    public static void main(String[] args) {

        Course c = new OnlinePaidCourse(
                "Java Full Stack",
                "Udemy",
                4999
        );

        c.courseInfo();
        ((OnlineCourse)c).coursePrice();
        System.out.println("Course Price: ₹" + c.countPrice());
    }
}

