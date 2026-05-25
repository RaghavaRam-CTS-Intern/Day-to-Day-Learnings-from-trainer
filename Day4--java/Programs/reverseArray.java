import java.util.Arrays;
class main{

public static void main(String arg[]){

int arr[] = {1,2,3,4,5,6,7,8};

int l=0;
int r = arr.length-1;

while(l<r){

int temp = arr[l];
arr[l] = arr[r];
arr[r] = temp;

l++;
r--;

}

System.out.print(Arrays.toString(arr));

}

}