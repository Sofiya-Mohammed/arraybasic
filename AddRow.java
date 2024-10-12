package a1;

import java.util.Scanner;

public class AddRow {
    public static void main(String args[]) {


        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(  int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter the element :  ");

                arr[i][j] = sc.nextInt();

            }
        }
        int total=0;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] +" ");
                total=total+arr[i][j];


            }
            System.out.println( "row value"+total);
            System.out.println(" ");
        }
    }
}