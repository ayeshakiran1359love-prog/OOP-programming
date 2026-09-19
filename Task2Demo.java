class Task2Demo {
    public static void main(String[] args) {

        RevisedStudent s1 = new RevisedStudent();
        RevisedStudent s2 = new RevisedStudent();

        s1.studentId = "001";
        s1.name = "Ayesha";
        s1.completedCredits = 15;

        s2.studentId = "002";
        s2.name = "Ghania";
        s2.completedCredits = 18;

        System.out.println("Initial Details:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println("Adding Credits:");
        s1.addCredits(3);
        s2.addCredits(6);

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println("Remaining Credits:");
        System.out.println(s1.name + ": " + s1.remainingCredits(130));
        System.out.println(s2.name + ": " + s2.remainingCredits(130));
    }
}