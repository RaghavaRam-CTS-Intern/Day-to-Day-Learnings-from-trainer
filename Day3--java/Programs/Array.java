package ctsintern.demo;
 
import java.util.Arrays;
 
 
import java.util.Scanner;
 
public class Check {
	
	public static void main(String[] args) {
 
		int a[][]= new int[3][4];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nos");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("the values are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print( a[i][j]);
			}
			System.out.println();
		}
		
 
System.out.println(Arrays.deepToString(a));
	
	}
}
;
 
package ctsintern.demo;
 
import java.util.Arrays;
 
 
import java.util.Scanner;
 
public class Check {
	
	public static void main(String[] args) {
 
		int a[][]= new int[3][];
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the nos");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter no of col? "+ i);
			int col= s.nextInt();//12
			//int c[]= new int[4];
			
			a[i]=new int[col];
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("the values are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print( a[i][j]);
			}
			System.out.println();
		}
		
 
System.out.println(Arrays.deepToString(a));
	
	}
}
;
 