/*
*Lelokarma
*-interface
*-abstract class
*-concrete class
*-instantiate classes
*-inheritance
*/


//create an interface
public interface Vehicle {
  public static final int i=10; //any variable in an interface is automatically constant(static final)

  //abstart methods i.e do not have a body
  void start(); //it is public & abstract by default
  void stop();
  
  //when a method is static in an interface you have to provide its body
 static void resume() {
	   System.out.println("static method resume inside an interface");
 }
}
  //create a class which implements the interface
  class carA implements Vehicle {

      //once we are implementing an interface we must override its methods
      @Override
      public  void start(){
          System.out.println("start method inside carA");
      }
      
      static void help() {
      	System.out.println("This is a static method");
      }
      @Override
      public void stop(){
          System.out.println("stop method inside car");
          System.out.println(i);
      //calling the static method no need to create an obj      
          Vehicle.resume();
          carA.help();
      }
  }
  //when creating an abstract class to implement an interface no need for overriding the methods
 abstract class carB implements Vehicle{
  void suspend() {
  	 System.out.println("suspend method inside car");
  }
  }

  //extending carB which is an abstract class so we need to override methods(concrete class)
  class carC extends  carB{
      @Override
      public  void start(){
          System.out.println("start method inside carA");
      }
      @Override
      public void stop(){
          System.out.println("stop method inside car");
      }

  public class Engine{
      public static void main(String[] args) {
      
      	//create an object of carA,CarC and call the methods
          carA obj = new carA();
          obj.start();
          obj.stop();
          
          carC obj1 = new carC();
          obj1.start();
          obj1.stop();
      }
  }
  }
