package opps;
 
class Person1
{
	private int roll;
	private String name;
	private String email;
	public Person1(int roll, String name, String email) {
		this.roll = roll;
		this.name = name;
		this.email = email;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+email);
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

	 public String toString() 
	 {
		 return roll+" "+name+" "+email;
	 }
	  public boolean equals(Object obj) {
		  if(this==obj)
			  return true;
		  if( obj instanceof Person1)
		  {

		  Person1 person=(Person1)obj;
		  if(this.roll==person.roll && this.name.equals(person.name)&& this.email.equals(person.email))
		  return true;
		  else
			  return false;
		  }

		  return false; 
	  }
	  }
 
 
class Student{
	private int roll;
	private String name;
	private String email;
	public Student(int roll, String name, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
	}
}
public class OppsDemo2 { 
	public static void main(String[] args) {
		Person1 p1 = new Person1(23,"varun","varun@gmail.com");
		Person1 p2 = new Person1(2,"Shahya","shahya@gmail.com");
		Person1 p3 = new Person1(23,"varun","varun@gmail.com");
		Person1 p5 = new Person1(3,"nandhini","nandhini@gmail.com");
		Student s1 = new Student(2,"Shahya","shahya@gmail.com");
		Person1 p4=p1;
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(s1));
		System.out.println(p1.equals(null));
		System.out.println(p1.equals(p4));

	}

 
}
====================================
 
package opps;
 
class Parent 
{
	private String name;
	private String height;
	Parent()
	{
		System.out.println("im parent");
	}
 
	public String toString() {
		return "Parent [name=" + name + ", height=" + height + "]";
	}
	}
class Child extends Parent
{
}
public class OppsDemo3 { 
	public static void main(String[] args) {
		 Child c = new Child();
	}

 
}
 
==================================
 
package opps;
 
class Parent 
{
	private String name;
	private String height;
	Parent()
	{
		System.out.println("im parent");
	}
 
	public String toString() {
		return "Parent [name=" + name + ", height=" + height + "]";
	}
	}
class Child extends Parent
{
	Child()
	{
		super();
		System.out.println("im child");
	}
}
public class OppsDemo3 { 
	public static void main(String[] args) {
		 Child c = new Child();
	}

 
}
============================
package opps;
 
class Parent 
{
	private String name;
	private int height;
	Parent()
	{
		System.out.println("im parent");
	}
	Parent (String name, int height)
	{
		this.name=name;
		this.height=height;
	}
 
	public String toString() {
		return "Parent [name=" + name + ", height=" + height + "]";
	}
	}
class Child extends Parent
{
//	Child()
//	{
//		super();
//		System.out.println("im child");
//		
//	}
}
public class OppsDemo3 { 
	public static void main(String[] args) {
		 Child c = new Child();
	}

 
}
 
==============================
 
package opps;
 
class Parent 
{
	private String name;
	private int height;
//	Parent()
//	{
//		System.out.println("hello");
//	}
	Parent (String name, int height)
	{
		this.name=name;
		this.height=height;
	}
 
	public String toString() {
		return "Parent [name=" + name + ", height=" + height + "]";
	}
	}
class Child extends Parent
{

	Child(String name, int height)
	{
		 super(name,height);
	}
}
public class OppsDemo3 { 
	public static void main(String[] args) {
		 Child c = new Child("nandhini",5);
		System.out.println(c);
	}

 
}
 
 
===================================
 
package opps;
class Gp
{
	void display()
	{
		System.out.println("hi im GP");
	}
}
class Parent  extends Gp
{
	private String name;
	private int height;
//	Parent()
//	{
//		System.out.println("hello");
//	}
	Parent (String name, int height)
	{
		this.name=name;
		this.height=height;
	}
 
	public String toString() {
		return "Parent [name=" + name + ", height=" + height + "]";
	}
	}
class Child extends Parent
{
int weight;
	Child(String name, int height)
	{
		 super(name,height);
	}
	Child(String name, int height,int weight)
	{
		 super(name,height);
		 this.weight=weight;
	}
 
	@Override
	public String toString() {
		return super.toString()+ "Child [weight=" + weight + "]";
	}

}
public class OppsDemo3 { 
	public static void main(String[] args) {
		 Child c = new Child("nandhini",5,70);
		System.out.println(c);
		c.display();
	}

 
}
 
 
==============================
 
package opps;
class Parent  
{
	private String name;
	private int height;
	Parent (String name, int height)
	{
		this.name=name;
		this.height=height;
	}
 
	public String toString() {
		return "Parent [name=" + name + ", height=" + height + "]";
	}
}
class Child1 extends Parent
{
int weight;
	Child1(String name, int height)
	{
		 super(name,height);
	}
	Child1(String name, int height,int weight)
	{
		 super(name,height);
		 this.weight=weight;
	}
 
	@Override
	public String toString() {
		return super.toString()+ "Child [weight=" + weight + "]";
	}
}
	class Child2 extends Parent
	{
	 int weight;
		Child2(String name, int height)
		{
			 super(name,height);
		}
		Child2(String name, int height,int weight)
		{
			 super(name,height);
			 this.weight=weight;
		}
 
		@Override
		public String toString() {
			return super.toString()+ "Child2 [weight=" + weight + "]";
		}

}
public class OppsDemo3 { 
	public static void main(String[] args) {
		 Child1 c1 = new Child1("nandhini",5,70);
		 Child2 c2 = new Child2("devi",5,70);
		System.out.println(c1);
		System.out.println(c2);
	}

 
}