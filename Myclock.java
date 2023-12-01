/*
*Lelokarma
*-How to create a class
*-initialized variable
*-create method with/without parameters
*-how to call methods and pass arguments
  */
public class Myclock {

	public static void main(String[] args) {
	
//create an object of the class
		ClockDemo obj = new ClockDemo();
		
		//ini... our variables
		obj.hours = 10;
		obj.minutes = 20;
		System.out.println(obj.hours);
		System.out.println(obj.minutes);
		
		//call method and passing the args
		obj.addNumbers(2,1);
	}

}
//creating a class
class ClockDemo{
	
	//attributes initialized to 0 by default
	int hours;
	int minutes;
	
	//create method taking args/params num1&num2
	public void addNumbers(int num1, int num2) {
		
		//store the value of results in a local variable
		int results = num1+num2;
		System.out.println("addition " +results);
	}
}
