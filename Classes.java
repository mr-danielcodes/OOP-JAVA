public class Classes {
    private String name;
    private int age;
    /* "This" Keyword
 A constructor using this to resolve naming conflicts.
A method that uses this to call another method.
A method that returns this to allow method chaining.*/

    // Constructor using 'this' to differentiate between instance variables and parameters
    public Classes(String name, int age) {
        this.name = name;  // 'this.name' refers to the instance variable
        this.age = age;
    }
    // Instance method that uses 'this' to call another method
    public void introduce() {
        this.displayDetails();  // Explicitly calling another method using 'this'
    }
    // Method to display Classes details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    // Method that returns 'this' for method chaining
    public Classes setName(String name) {
        this.name = name;
        return this;
    }
    public Classes setAge(int age) {
        this.age = age;
        return this;
    }

    public static void main(String[] args) {
        // Creating a Classes object
        Classes s1 = new Classes("Alice", 20);

        // Using methods with 'this'
        s1.introduce();

        // Method chaining example
        s1.setName("Bob").setAge(22);
        System.out.println("\nAfter updating:");
        s1.introduce();
    }
}
