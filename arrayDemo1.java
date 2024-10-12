package a1;
import java.util.Scanner;
public class arrayDemo1 {
    public static void main(String args[]){
        int arr[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
           System.out.println(" enter the element");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
