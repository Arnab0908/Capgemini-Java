package abstraction;
class OnlinePaidCourse extends OnlineCourse {
    double courseFee;

    OnlinePaidCourse(String name, String platform, double courseFee) {
        super(name, platform);
        this.courseFee = courseFee;
    }

    @Override
    double countPrice() {
        return courseFee;
    }
}
