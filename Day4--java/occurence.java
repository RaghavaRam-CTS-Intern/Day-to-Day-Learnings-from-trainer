class occurence{

public static void main(String args[]){

int arr[] = new int[100];

int nums[] = {1,2,12,4,3,6,12,7,8,9,4,11,3,4,12};

for(int i=0; i<nums.length; i++){

arr[nums[i]] += 1;

}

//System.out.print(arr[12]);



for(int i=0; i<arr.length; i++ ){
if(arr[i]>0){

System.out.print(i+"-->"+arr[i]);
System.out.println();

}
}

}

}


