package a1;

public class demo4 {
    public static void main(String args[]){
        int arr[][]={
                {5,4,7},
                {6,7,8},
                {7,8,9}
        };
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
