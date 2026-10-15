package Array_ProblemSolving;

import java.util.HashMap;
import java.util.Scanner;

public class part2 {

    static void swapEle(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArr(int[] arr){
        for(int k : arr){
            System.out.print(k + " ");
        }
    }

//    static void reversArr(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n - 1;
//        while(i <= j){
//            swapEle(arr, i, j);
//            i++;
//            j--;
//        }
//        printArr(arr);
//    }

//    static void shiftBy1(int[] arr){
//        int n = arr.length;
//        int temp = arr[n - 1];
//        for(int i = n - 1; i > 0 ; i--){
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = temp;
//        printArr(arr);
//    }

//    static void printAlternate(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n - 1;
//        while (i <= j){
//            if (i == j){
//                System.out.print(arr[i]);
//                return;
//            }else {
//                System.out.print(arr[i] + " ");
//                i++;
//                System.out.print(arr[j] + " ");
//                j--;
//            }
//        }
//    }

//    static void mod(int[] arr){
//        HashMap<Integer, Integer> frequency = new HashMap<>();
//
//    }
    static void shiftByK(int[] arr, int k){
        int n = arr.length;
        int[] temp = new int[k];
        int tempIndex = 0;
        for (int i = n - k; i < n; i++){
            temp[tempIndex] = arr[i];
            tempIndex++;
        }
        for (int i = n - k - 1; i >= 0; i--){
            arr[i + k] = arr[i];
        }
        tempIndex = 0;
        for (int i = 0; i <= n - k; i++){
            arr[i] = temp[tempIndex];
            tempIndex++;
        }
        printArr(arr);
    }


    public static void main(String[] args){
        int[] arr = {2,4,6,8,9};
        shiftByK(arr, 3);
//        mod(arr);
//        printAlternate(arr);
//        shiftBy1(arr);
//        reversArr(arr);
    }
}
