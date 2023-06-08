package Arrayassign;

public class Min {
    public static void main(String[] args) {
        int[] arr=new int[]{10,280,30,40};
        int max=arr[0];
        //int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=max){
                max=arr[i];
            }
        }
        System.out.println("maximum value in array "+max);
    }
}
