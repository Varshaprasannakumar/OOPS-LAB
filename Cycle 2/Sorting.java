import java.util.Scanner;
import java.util.Arrays;

public class Sorting{
   public static void main(String arg[]){
     System.out.println("VARSHA P NAIR\n ROLL NO:60\n DATE:18/03/2024\n PROGRAM TITLE: STRING SORTING\n");
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the no.of Strings: ");
     int n = scan.nextInt();
     System.out.println("Enter the strings: ");
     String[] str = new String[n];
     scan.nextLine();
     for(int i=0; i<n; i++){
       str[i] = scan.nextLine();
     }
     System.out.println("Array before sorting :" + Arrays.toString(str));
     for(int i=0; i<n-1; i++){
      for(int j=0; j<n-i-1; j++){
        if(str[j].compareTo(str[j+1]) > 0){
           String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting : " + Arrays.toString(str));

        scan.close();
    }
}
