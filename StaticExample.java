public class StaticExample {

    String sname;
    static String tname = "Vasanth";

    StaticExample(String s) {
        this.sname = s;
    }

    void display() {
        System.out.println("Student Name : " + sname);
        System.out.println("Trainer Name : " + tname);
        System.out.println();
    }

    public static void main(String[] args) {

        StaticExample s1 = new StaticExample("Kalaivani");
        StaticExample s2 = new StaticExample("Kaviya");
        StaticExample s3 = new StaticExample("Priya");

        s1.display();
        s2.display();
        s3.display();
    }
}