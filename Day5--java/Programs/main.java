package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		 System.out.println("Enter the nos");
		try {
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException x)
		{
			//System.out.println(x);
			//System.out.println(x.getMessage());
			x.printStackTrace();
		}
		catch(InputMismatchException x)
		{
			System.out.println(x);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("see you");	 
	}
}
=================================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		 System.out.println("Enter the nos");
		try {
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("see you");	 
	}
}
===============================
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		 System.out.println("Enter the nos");
		try {
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException | InputMismatchException  e)
		{
			 System.out.println(e);
			//System.out.println(x.getMessage());
			//x.printStackTrace();
		}

		System.out.println("see you");	 
	}
}
======================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		 System.out.println("Enter the nos");
		try {
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException x)
		{
			System.out.println(x);
			System.out.println("Enter the nos");
			a=s.nextInt();
			b=s.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch(InputMismatchException x)
		{
			System.out.println(x);

		}

		System.out.println("see you");	 
	}
}
=================================================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		 System.out.println("Enter the nos");
		try {
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println(c);
		}
		finally{
			System.out.println("i will always execute.......");
		}
		System.out.println("see you");	 
	}
}
==============================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a,b;
		int c;
		 System.out.println("Enter the nos");
		try {
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println(c);
		}
		 catch(ArithmeticException e)
		{
			 System.out.println(e);
		}
		finally{
			System.out.println("i will always execute.......");
		}
		System.out.println("see you");	 
	}
}
====================================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) throws ClassNotFoundException{
		try {
  Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
//		Scanner s = new Scanner(System.in);
//		int a,b;
//		int c;
//		 System.out.println("Enter the nos");
//		try {
//		a=s.nextInt();
//		b=s.nextInt();
//		c=a/b;
//		System.out.println(c);
//		}
//		 catch(ArithmeticException e)
//		{
//			 System.out.println(e);
//		}
//		finally{
//			System.out.println("i will always execute.......");
//		}
//		 
		System.out.println("see you");	 
	}
}

 
===================================
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class Test
{
	public static void validate(int age)
	{
		if(age>=18)
			System.out.println("eligible");
		else
			throw new ArithmeticException();
	}
}
public class Check {
	public static void main(String[] args) {
		try {
		Test.validate(2);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("see you");	 
	}
}
=================================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class Test
{
	static void shahya() throws ArithmeticException
	 {
		System.out.println("im shahya");
	throw	new ArithmeticException();

	 }
	 static void sowmiya() {
		 System.out.println("im sowmiya");
		 try {
		 shahya();
		 }
		 catch (ArithmeticException e) {
			System.out.println("i can handle sowmi"); 
		}
	 }
	static void varma()
	 {
		 System.out.println("im varma");
		 sowmiya();
	 }
}
public class Check {
	public static void main(String[] args) {
		Test.varma();
		System.out.println("see you");	 
	}
}
======================
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class Test
{
	static void shahya() throws ArithmeticException
	 {
		System.out.println("im shahya");
	throw	new ArithmeticException();

	 }
	 static void sowmiya() throws ArithmeticException{
		 System.out.println("im sowmiya");
		 shahya();
	 }
	static void varma()throws ArithmeticException
	 {
		 System.out.println("im varma");
		 sowmiya();
	 }
}
public class Check {
	public static void main(String[] args) {
		try{
		Test.varma();
		}
		catch(ArithmeticException e)
		{
			System.out.println("hai");
		}
		System.out.println("see you");	 
	}
}
==========================================
 
package ctsintern.demo;
 
public class InvalidAgeException extends Exception{
	public InvalidAgeException(String err) {
		super(err);
	}
 
}
 
 
========================================
 
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class Test
{
	static void shahya(int age) throws InvalidAgeException
	 {
		if(age>=18)
		System.out.println("im shahya");
		else
	throw	new InvalidAgeException("Invalid age!!!! shud be greater than 18");

	 }
	 static void sowmiya(int age)throws InvalidAgeException  {
		 System.out.println("im sowmiya");
		 shahya(age);
	 }
	static void varma(int age) throws InvalidAgeException
	 {
		 System.out.println("im varma");
		 sowmiya(age);
	 }
}
public class Check {
	public static void main(String[] args)  {
		try {
		Test.varma(100);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("see you");	 
	}
}
