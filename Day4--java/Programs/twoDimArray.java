import java.util.*;

class Main {

public static void main(String arg[]) {

Scanner s = new Scanner(System.in);
int arr[][] = new int[4][4];

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
    arr[i][j] = s.nextInt();
    }
}

for (int k = 0; k < arr.length; k++) {
    for (int l = 0; l < arr[k].length; l++) {
    System.out.print(arr[k][l] + " ");
    }
    System.out.println();
}

System.out.print("Enter number to search: ");
int num = s.nextInt();


for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr[i].length; j++) {

    if (arr[i][j] == num) {
    char col = (char) ('A' + j);  
    System.out.println("Row " + i + ", Col" + col);
        
    }

}
}

}
}