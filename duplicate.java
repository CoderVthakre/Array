package Arrayassign;

public class duplicate {
    public static void main(String[] args) {
        int [] arr=new int[]{10,20,34,44,44,34,23,33};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }

            }
        }
    }
}
