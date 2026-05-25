class Person

{

	int roll;

	String name;

	String email;

}

public class OppsDemo1 {
 
	public static void main(String[] args) {

		 Person p1 = new Person();

		 Person p2 = new Person();

		 p1.roll=2;

		 p1.name="Varun";

		 p1.email="varun@gmail.com";

		 p2.roll=2;

		 p2.name="Shahya";

		 p2.email="Shahya@gmail.com";

		 System.out.println(p1.roll+" "+p1.name+p1.email);

		 System.out.println(p2.roll+" "+p2.name+p2.email);
 
 
	}
 
}

// ==============================================

// package opps;
 
class Person

{

	private int roll;

	private String name;

	private String email;



	public Person(int roll, String name, String email) {

		this.roll = roll;

		this.name = name;

		this.email = email;

	}

	public int getRoll() {

		return roll;

	}

	public void setRoll(int roll) {

		this.roll = roll;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}



}

public class OppsDemo1 {
 
	public static void main(String[] args) {

//		 Person p1 = new Person();

//		 Person p2 = new Person();

//		 p1.setRoll(12);

//		 p1.setName("varun");

//		 p1.setEmail("varun@gmail.com");

//		 

//		 

//		 p2.setRoll(2);

//		 p2.setEmail("shahya@gamil.com");

//		 p2.setName("shahya");


		Person p1 = new Person(23,"varun","varun@gmail.com");

		Person p2 = new Person(2,"Shahya","shahya@gmail.com");


//		 p1.roll=2;

//		 p1.name="Varun";

//		 p1.email="varun@gmail.com";

//		 

//		 p2.roll=2;

//		 p2.name="Shahya";

//		 p2.email="Shahya@gmail.com";

//		 

		 System.out.println(p1.getRoll()+" "+p1.getName()+p1.getEmail());

		 System.out.println(p2.getRoll()+" "+p2.getName()+p2.getEmail());
 
 
	}
 
}

// =====================================
 
// package opps;
 
class Person

{

	private int roll;

	private String name;

	private String email;



	public Person(int r, String n, String e) {

		 //p1.roll=67

		this.roll = r;

		this.name = n;

		this.email = e;

	}

	String display()

	{

		return roll+name+" "+email;

	}

//	void display()

//	{

//		System.out.println(roll+" "+name+" "+email);

//	}

	public int getRoll() {

		return roll;

	}

	public void setRoll(int roll) {

		this.roll = roll;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}



}

public class OppsDemo1 {
 
	public static void main(String[] args) {

//		 Person p1 = new Person();

//		 Person p2 = new Person();

//		 p1.setRoll(12);

//		 p1.setName("varun");

//		 p1.setEmail("varun@gmail.com");

//		 

//		 

//		 p2.setRoll(2);

//		 p2.setEmail("shahya@gamil.com");

//		 p2.setName("shahya");


		Person p1 = new Person(23,"varun","varun@gmail.com");

		Person p2 = new Person(2,"Shahya","shahya@gmail.com");


//		 p1.roll=2;

//		 p1.name="Varun";

//		 p1.email="varun@gmail.com";

//		 

//		 p2.roll=2;

//		 p2.name="Shahya";

//		 p2.email="Shahya@gmail.com";

//		 

//		 System.out.println(p1.getRoll()+" "+p1.getName()+p1.getEmail());

//		 System.out.println(p2.getRoll()+" "+p2.getName()+p2.getEmail());
 
		

//		p1.display();

//		p2.display();
 
		System.out.println(p1.display());

		System.out.println(p2.display());

	}
 
}

// ==================================
 