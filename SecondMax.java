package a1;

public class SecondMax {
    public  static void main(String args[]){
        int  arr[]={20,89,67,45,78,30};
        System.out.println("the length of array:"+arr.length);
        int max=0;
        int second_max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];

            }
            else if(arr[i]>second_max){
                second_max=arr[i];
            }

        }
        System.out.println("max value:"+ max);
        System.out.println("Second max value :"+second_max);
    }
}
