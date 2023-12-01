/*
*Lelokarma
*-return type methods
*-non return type methods
  */

public class BankApp {
public static void main(String[] args) {
	BankProcess obj = new BankProcess();
	obj.processApplication();
	obj.printDetails(500, 3);
	//passing the verif code and printing it
	int finalverCode = obj.verificationCode(4444);
	System.out.println(finalverCode);
}
}
class BankProcess{
	
	int loanAccNumber;
	int customerID;
	int verificationCode;
	
	//when a method has void it doesnt returns anything
	void processApplication() {
		System.out.println("proccessing Application");
	}
	
	void printDetails(int loanNumber, int cID) {
		
		//storing the variable values inside the parameters
		loanAccNumber = loanNumber;
		customerID = cID;
		System.out.println("Printing the details " +loanAccNumber);
		System.out.println("Printing the details " +cID);
	}
	
	int verificationCode(int verCode) {
		verificationCode= verCode;
		return verificationCode;
	}
}
