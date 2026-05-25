package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
 
	 StringBuffer sb = new StringBuffer("hello");
		//StringBuffer sb = new StringBuffer();
		sb.append("hai");
		System.out.println("the ans: "+sb);

 
 
	}
 
}
 
====================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
//                                      01234
	 StringBuffer sb = new StringBuffer("hello how are you");
		System.out.println("the ans: "+sb);
		 sb.insert(2, "java");
		System.out.println("after inserted the ans: "+sb);
 
 
	}
 
}
 
=====================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
//                                       01234567
	 StringBuffer sb = new StringBuffer("hello how are you");
		System.out.println("the ans: "+sb);
		 sb.delete(2, 7);
		System.out.println("after inserted the ans: "+sb);
 
 
	}
 
}
 
=======================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
//                                       01234567
	 StringBuffer sb = new StringBuffer("hello how are you");
		System.out.println("the ans: "+sb);
		 sb.replace(1,4, "fullstack");
		System.out.println("after inserted the ans: "+sb);
 
 
	}
 
}
=============================
 
package ctsintern.demo;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Check {
 
	public static void main(String[] args) {
//                                       01234567
	 StringBuilder sb = new StringBuilder("hello how are you");
		System.out.println("the ans: "+sb);
		 sb.reverse();
		System.out.println("after inserted the ans: "+sb);
 
 
	}
 
}
=========================================