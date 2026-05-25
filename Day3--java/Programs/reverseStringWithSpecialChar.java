class reverseStringWithSpecialChar{
public static void main(String args[]){
	String s = "H@E#LL&O";
	char s1[] = s.toCharArray();
	int l=0;
	int r=s1.length -1;
	while(l<r){
		if(!((s1[l]>='A'&& s1[l]<='Z')||(s1[l]>='A'&& s1[l]<='Z'))){
			l++;
	}
		if(!((s1[r]>='A'&& s1[r]<='Z')||(s1[r]>='A'&& s1[r]<='Z'))){
			r--;
	}
		else{
		char temp = s1[l];
		s1[l] = s1[r];
		s1[r] = temp;
		l++;
		r--;
}
	}
	System.out.print(s1);
	
}
}