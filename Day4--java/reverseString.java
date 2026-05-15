import java.util.Arrays;
class main{

public static void main(String arg[]){

String s = "hello";
char ch[] = new char[s.length()];
int i=0;
while(i<s.length()){

ch[i]=s.charAt(i);
i++;

}


int l=0;
int r = ch.length-1;

while(l<r){

char temp = ch[l];
ch[l] = ch[r];
ch[r] = temp;

l++;
r--;

}

System.out.print(Arrays.toString(ch));

}

}