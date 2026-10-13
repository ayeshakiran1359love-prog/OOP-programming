public class DateDemo {

    public static void main(String[] args) {

        Date d1 = new Date();
        d1.displayDate();

        Date d2 = new Date(15, 8, 2025);
        d2.displayDate();

        Date d3 = new Date(12, 2024);
        d3.displayDate();

        Date d4 = new Date(2023);
        d4.displayDate();
    }
}
