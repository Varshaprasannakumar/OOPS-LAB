import java.util.Scanner;
import java.util.Arrays;

class SearchArray{
    public static void main(String arg[]){
	System.out.println(" VARSHA P NAIR\n ROLL NO: 60\n DATE:18-03-2024\n PROGRAM TITLE:SEARCH AN ELEMENT IN AN ARRAY.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.print("Enter the value to search : ");
        int value = scanner.nextInt();
        int flag = 0;
        for(int i=0; i<n; i++){
            if(value == arr[i]){
                flag = 1;
                break;
            }
        }
        if(flag == 0) 
        System.out.println("Element " + value + " not found in the array.");
        else System.out.println("Element " + value + " found in the array.");

        scanner.close();
    }
}
