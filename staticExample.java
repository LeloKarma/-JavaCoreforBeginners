/*
*created by Lelokarma
*-static methods
*-static class
*how to access static
*/
public class staticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreCardDemo obj1 = new ScoreCardDemo();
		ScoreCardDemo obj2 = new ScoreCardDemo();
		obj1.get(23);
		obj2.get(11);
		
		obj1.put();
		obj2.put();
		
		//calling the static method classname.method
		ScoreCardDemo.put_totalScore();
	}

}
class ScoreCardDemo{
	int score;
	
	//global variable
	static int total;
	
	void get(int s) {
		score = s;
		total = total+s;
	}
	void put()
{
		System.out.println(score);
}
	static void put_totalScore() {
		System.out.println(total);
		
	}

}
