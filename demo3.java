package a1;
import java.util.Scanner;
public class demo3 {
    public static void main(String args[]) {
     int arr[][]=new int[3][3];
     Scanner sc= new Scanner(System.in);

     for(int i=0;i<3;i++){
         for(int j=0;j<4;j++){
             System.out.println("enter the element :  " );

             arr[i][j]=sc.nextInt();

         }
     }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(" ");
        }


    }
}
