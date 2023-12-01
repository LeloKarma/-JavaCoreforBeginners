/*
*Lelokarma
*-default constructor
*-parametrized constructor
*-overloading
*/

public class ConstDemo {
 public static void main(String[] args){
	 
	 ConstructorOne obj = new ConstructorOne();
	//ConstructorOne obj = new ConstructorOne(2, 4); passing args to the parametrized constructor
	 ConstructorOne obj2 = new ConstructorOne(2, 4, 5);
	 ConstructorOne obj3 = new ConstructorOne("Sharon", 4);
	 
	 System.out.println("Area is " +obj.calculateArea());
 }
	
}

 class ConstructorOne{
	
	int width;
	int height;
	
/*parametrized constructor
 * Constructortwo(int a, int b){
		
	 System.out.println("printing a value");
 
		
	}
	*/
	
	//creating a param... constructor
	ConstructorOne(){
		
		//ini... variables in the constructor
		width = 10;
		height = 20;
		
	}
	
	//constructor overloading
ConstructorOne(int a, int b, int c){
	//logic	
	
	}

ConstructorOne(String str, int b){
	
	//logic
	
}
	
	//method with int return type to calco the area
	public int calculateArea() {
		return width*height;
	}
}
