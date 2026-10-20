package Array_ProblemSolving;

import java.util.*;

public class part3 {

//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    static void printArr(int[] arr){
//        for (int i : arr){
//            System.out.print(i + " ");
//        }
//    }

//    static void sortBy0and1(int[] arr){
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        for (int j : arr){
//            if (arr[j] == 1){
//                System.out.print(arr[j] + " ");
//            }
//        }
//        List<Integer> sort = new ArrayList<>();
//        for (int i : arr){
//            sort.add(i);
//        }
//        Collections.sort(sort);
//        return sort;
//        int i = 0;
//        int j = arr.length - 1;
//        while (i < j){
//            if (arr[i] == 1 && arr[j] == 0){
//                arr[i] = 0;
//                arr[j] = 1;
//                swap(arr, i, j);
//            }
//            if (arr[i] == 0) {
//                i++;
//            }
//            if (arr[j] == 1) {
//                j--;
//            }
//        }
//        printArr(arr);
    }

//    static void missingNum(int[] arr){
//        int arrSum = 0;
//        int n = arr.length;
//        for (int i : arr){
//            n += arr[i];
//            arrSum += arr[i];
//        }
//        System.out.print(n - arrSum);
//    }

//    static void findUniqueNum(int[] arr){
//        int uniqueEle = 0;
//        for (int i = 0; i < arr.length; i++){
//            uniqueEle = uniqueEle ^ arr[i];
//        }
//        for (int i : arr){
//            uniqueEle ^= i;
//        }
//        System.out.print(uniqueEle);
//    }

//    static List<Integer> union(int[] arr, int[] arr2){
//        List<Integer> unionArr = new ArrayList<>();
//        for (int i : arr){
//            unionArr.add(i);
//        }
//        for (int j : arr2){
//            if (!unionArr.contains(j)){
//                unionArr.add(j);
//            }
//        }
//        for (int i = 0; i < arr2.length; i++){
//           if (!unionArr.contains(arr2[i])){
//                unionArr.add(arr2[i]);
//           }
//        }
//        return unionArr;
//    }

//    static void sortBy0s1s2s(int[] arr){
//
//    }

//    public static void main(String[] args) {
//        int[] arr = {0,1,2,0,1,2,0};
//        int[] arr = {1,2,3,4,5};
//        int[] arr2 = {2,5,6,7};
//        System.out.print(union(arr, arr2));
//        int[] arr = {2,3,5,4,5,3,4};
//        findUniqueNum(arr);
//        int[] arr = {2, 1, 0, 4, 3};
//        missingNum(arr);
//        int[] arr = {0,1,2,0,1,2,0,1,2};
//        int[] arr = {0,1,0,1,0,1};
//        sortBy0and1(arr);
//    }
//}
