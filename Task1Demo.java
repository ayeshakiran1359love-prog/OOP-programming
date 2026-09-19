class Task1Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "001";
        s1.name = "Ayesha";
        s1.completedCredits = 17;

        s2.studentId = "002";
        s2.name = "Ghania";
        s2.completedCredits = 18;

        s3.studentId = "003";
        s3.name = "Manahil";
        s3.completedCredits = 12;

        System.out.println("Before Change:");

        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 3;

        System.out.println("After Change:");

        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);
    }
}