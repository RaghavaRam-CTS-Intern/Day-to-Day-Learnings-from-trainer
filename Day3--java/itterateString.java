class main{

public static void main(String arg[]){
//String s1 = "hai3bye5hello12";
String s1 = "hello3hi15bye7";
int i=0;
String word = "";
int num = 0;

while(i<=s1.length()-1){
char ch = s1.charAt(i);
if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) ){
if(num>0){
int j =0;
while(j<num){
System.out.print(word+" ");
j++;
}
word="";
num=0;
}
word = word + ch;
}
else if (ch>=48 && ch<=57){
num = (num*10)+(ch-'0');
}
i++;
}
if(num>0){
int j=0;
while(j<num){
System.out.print(word+" ");
j++;
}
}
}

}