package abstraction;

class OnlineCourse extends Course {
    String platform;

    OnlineCourse(String name, String platform) {
        super(name);
        this.platform = platform;
    }

    void coursePrice() {
        System.out.println("Platform: " + platform);
    }

    @Override
    double countPrice() {
        return 0; // base online course has no fee
    }
}

