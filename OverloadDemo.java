class OverloadDemo {

    // Signature: enroll(String)
         void enroll(String courseCode) {
        System.out.println("Course: " + courseCode);
    }
    int enroll(String courseCode) {
        return 1;
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in course: " + courseCode
                + ", Section: " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled in numeric course code: "
                + numericCourseCode);
    }

    public static void main(String[] args) {

        OverloadDemo obj = new OverloadDemo();

        // Valid calls
        obj.enroll("CSC241");
        obj.enroll("CSC241", 2);
        obj.enroll(241);

        // Invalid calls
        // obj.enroll();
        // obj.enroll("241", "2");
    }
}