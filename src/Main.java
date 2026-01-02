
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7};

        int k = 3;

        RotateArray(arr,k);

        System.out.println(Arrays.toString(arr));
    }

    public static void RotateArray(int[] arr,int k){
        int n = arr.length-1;
        reverse(arr,0,k);
        reverse(arr,k+1,n);
        reverse(arr,0,n);
    }

    public static void reverse(int[] arr,int l,int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}



//
//BRUTE Force Solution
//
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//
//        int k = 3;
//
//        RotateArray(arr,k);
//
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void RotateArray(int[] arr,int k){
//        int n = arr.length;
//        int[] ans = new int[n];
//
//        for(int i=0;i<n;i++){
//            ans[i] = arr[(i+k+1)%n];
//        }
//
//        for(int i=0;i<n;i++){
//            arr[i] = ans[i];
//        }
//
//    }
//}