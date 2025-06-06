abstract class Abstraction{
    public abstract void turnOn();
    public abstract void turnOff();
}
class tvRemote extends Abstraction{
      public void turnOn(){
          System.out.println("Tv is On");
      }
      public void turnOff(){
          System.out.println("Tv is Off");
      }
}

public class Abstract {
    public static void main(String[] args) {
        tvRemote t1  = new tvRemote();
        t1.turnOn();
        t1.turnOff();
    }
}
