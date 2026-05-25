import java.util.Scanner;

class main{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int num1 = s.nextInt();
int num2 = s.nextInt();

for(int i=num1; i<=num2; i++){
int num = i;
int arr[] = new int[10];
boolean isDuplicate = false;
while(num>0){
int digit = num%10;
if(arr[digit]==1){
isDuplicate=true;
break;
}
arr[digit] =1;
num = num/10;

}
if(!isDuplicate){
System.out.print(i+" ");
}
}
}
}