class main{

public static void main(String args[]){
String s = "im from chennai";
String arr[] = s.split(" ");
int ln = 0;
int maxln =0;
String s2 = "";
for(String x: arr){
ln = x.length();
	
if(ln>maxln){
	s2 = x;
	maxln = ln;
}
}
System.out.print(s2);

}
}