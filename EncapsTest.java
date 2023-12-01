/*
*Created by Lelokarma
*-Encapsulation
*-getters and setters
*/

public class EncapsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Encaps obj = new Encaps();
        obj.setId(2346563);
       int res =  obj.getId();
       System.out.println(res);
	}

}
class Encaps{
  private int id = 1234;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}
