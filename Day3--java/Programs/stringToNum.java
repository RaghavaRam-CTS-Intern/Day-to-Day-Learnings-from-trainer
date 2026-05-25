
import java.util.Arrays;
import java.util.Scanner;

 class Check {
 
	public static void main(String[] args) {
	String s1="23";
	
  /*0   1   2  3   4   5   6  
   *
   *48 49   50 51
   *
   */
		//int num=2;
		//ans=s1+num;// 25
	int i=0;
	int res=0;
	while(i<=s1.length()-1 )// 1
	{
		int data = s1.charAt(i)-'0';
		           // 52 - 48
		res=res*10+data;
		System.out.println("data: "+data+" res: "+(data+100));
		i++;
	}
 
 
	}
 
}