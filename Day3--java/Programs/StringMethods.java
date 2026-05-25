package ctsintern.demo;
 
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in)	;
	String name;
	char gender;
	String data;
	 System.out.println("Enter the name: ");
	 name=s.nextLine();
	 System.out.println("Enter the gender M or F");
//	 data= s.next();// female
//	 gender = data.charAt(0);
	 gender=s.next().charAt(0);
	 System.out.println(name );
	 System.out.println(gender );
	}
 
}
=======================
 
package ctsintern.demo;
 
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
	 String s1="cts";
	 String s2="cts";
//	 String s3= new String("cts");
	 System.out.println(s1==s2 );
	 System.out.println(s1.equals(s2) );
	}
 
}
 
========================
package ctsintern.demo;
 
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {

  String s1= new String("cts");
  String s2= new String("cts");
	 System.out.println(s1==s2 );//f
	 System.out.println(s1.equals(s2) );//t
	}
 
}
==========================
 
package ctsintern.demo;
 
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {

  String s1= new String("cts");
  String s2= new String("cts");
  String s3=s1;
  String s4="cts";
	 System.out.println(s1==s2 );//f
	 System.out.println(s1.equals(s2) );//t
	 System.out.println(s1==s3 );// 
	 System.out.println(s4==s3 );// 
	}
 
}
 
===========================
 
package ctsintern.demo;
 
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
  String s1="cts";//100
  System.out.println(s1.hashCode());//100
//    s1= s1.concat("hello ");
  String s2= s1.concat("hello ");
	 System.out.println(s2 +" "+s2.hashCode());//1000000 
	}
 
}
 
=============================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {

 
String s1= "hai hel, lo how a,re you i li ,ke java";
//String[] words= s1.split("\\s");
 
//String[] words= s1.split("o");
//String[] words= s1.split(",");
String[] words= s1.split("[\\s,]+");
System.out.println(Arrays.toString(words) +" "+words.length);
	}
 
}
============================
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
	String s1=" nandhini ";
//String[] words= {"one","two","three"};
 
//String ans= String.join("", words);
String ans=String.join(s1, " hello ","how are you", "see u");
System.out.println(ans);
	}
 
}
 
===============================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
	String s1="hai how are you i love java programming ";
//String ans= s1.substring(16);
String ans= s1.substring(16,27);
System.out.println(ans);

 
 
	}
 
}