/*
*Lelokarma
*-inheritance
*-How to access inherited methods from parent-to-child
*/
public class Employee{
	
	public void getdetails() {
		System.out.println("getDetails");
	}
public void getAdress() {
	System.out.println("geAddress");
	}
	
}


//inheritance extends
public class Manaager extends Employee{

	public void getdMgetails() {
		System.out.println("getMgDetails");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee obj = new Employee();
Manaager obj1 = new Manaager();
obj.getAdress();
obj.getdetails();

obj1.getAdress();
obj1.getdetails();
obj1.getdMgetails();


	}

}

