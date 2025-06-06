class Parent {
    private String secret = "Hidden";

    private void showSecret() {
        System.out.println("Parent's secret: " + secret);
    }

    public void accessSecret() {
        showSecret(); // This works within the same class
    }
}

class Child extends Parent {
    public void tryAccess() {
        // System.out.println(secret);      // ❌ Error: secret has private access
        // showSecret();                   // ❌ Error: showSecret() is private

        accessSecret();                    // ✅ Indirect access via public method
    }
}
public class Inheritance2{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.accessSecret();
    }
}