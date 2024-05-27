package country;
import country.State.*;
import country.country.*;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c1=new Country("india");
		State s2 =new State("gujrat");
		Person p =new Person("MEGH",c1,s2,70000,21);
		System.out.println(p);


	}

}
