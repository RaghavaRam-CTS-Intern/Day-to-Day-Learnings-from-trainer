
class Parent {

    public static void main(String[] a) {
        System.out.println("hello im parent");
    }

    public void add() {
        System.out.println("im from parent add");
    }

    public static void sum() {
        System.out.println("im from parent sum");
    }

    public void show() {
        System.out.println("im from parent show");
    }
}

/* ---------------- Child class ---------------- */
class Nandhini extends Parent {

    // Static method → method hiding
    public static void sum() {
        System.out.println("im from child sum");
    }

    // Instance method → method overriding
    @Override
    public void show() {
        System.out.println("im from child show");
    }

    public static void main(String[] a) {
        System.out.println("hello im nandhini");
    }
}

/* ---------------- Test / Driver class ---------------- */
public class Check {

    public static void main(String[] args) {

        String data[] = { "one", "two" };
        System.out.println("im the check class");

         t n = new Nandhini();

        n.add();          // Parent method
        n.show();         // Child method (overridden)
        n.sum();          // Parent method (static → no polymorphism)

        Parent.main(data);    // calls Parent main
        Nandhini.main(data);  // calls Child main
    }
}
