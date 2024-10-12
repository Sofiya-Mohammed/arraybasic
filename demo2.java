package a1;

import java.util.Scanner;

public class demo2 {
    public static void main(String args[]){
        int arr[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println(" enter the element");
            arr[i]=sc.nextInt();
        }
        int total =0;
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("total"+total);
    }
}
