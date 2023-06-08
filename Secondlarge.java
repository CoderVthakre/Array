package Arrayassign;

public class Secondlarge {
    public static void main(String[] args) {
        int[] arr=new int[]{10,23,4,777,664};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[j]=arr[i];


                }
            }

        }
        int l=arr.length-2;
        System.out.println(arr[l]);
    }
}
