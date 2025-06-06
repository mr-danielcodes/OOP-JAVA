class Animal{
    public  void myVoice(){
        System.out.println("I just Eat--A dd Your Own Voice");
    };
}
class Dog extends Animal{
    public void myVoice(){
        System.out.println("woh woh,woh");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        //Parent Class
        Animal a1 = new Animal();
        a1.myVoice();
        //Child Class
        Dog g1 = new Dog();
        g1.myVoice();
    }
}
