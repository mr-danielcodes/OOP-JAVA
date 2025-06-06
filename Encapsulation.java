// Class that follows encapsulation
public class Encapsulation {
    // Private fields (cannot be accessed directly from outside)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with basic validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Daniel");
        person.setAge(22);

        System.out.println("My Name is "+ person.getName());
        System.out.println("I am  "+person.getAge()+" Year Old");

    }
}
