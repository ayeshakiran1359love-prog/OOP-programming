class PassByValue {

    void changeNumber(int x) {
        x = 99;
        System.out.println("Inside: " + x);
    }

    void changeStudent(Student st) {
        st.completedCredits = 99;
    }

    void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
        System.out.println("Inside: " + st.name);
    }

    public static void main(String[] args) {

        PassByValueDemo demo = new PassByValueDemo();

        // Experiment A
        int number = 10;
        System.out.println("Before: " + number);
        demo.changeNumber(number);
        System.out.println("After: " + number);

        // Experiment B
        Student s1 = new Student();
        s1.completedCredits = 15;

        System.out.println("\nBefore: " + s1.completedCredits);
        demo.changeStudent(s1);
        System.out.println("After: " + s1.completedCredits);

        // Experiment C
        Student s2 = new Student();
        s2.name = "Ali";

        System.out.println("\nBefore: " + s2.name);
        demo.replaceStudent(s2);
        System.out.println("After: " + s2.name);
    }
}