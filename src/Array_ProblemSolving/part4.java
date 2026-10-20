package Array_ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class part4 {
    static void printArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

//    static int[] towSum(int[] arr, int target){
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[i] + arr[j] == target){
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[] {};
//    }

//    static int[] threeSum(int[] arr, int target){
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                for (int k = j + 1; k < arr.length; k++){
//                    if (arr[i] + arr[j] + arr[k] == target){
//                        return new int[] {i, j, k};
//                    }
//                }
//            }
//        }
//        return new int[] {};
//    }

//    static int removeDuplicates(int[] arr){
//        int i = 0;
//        int j = 1;
//        int unique = 0;
//        while (j < arr.length){
//            if (arr[i] != arr[j]){
//                unique = arr[j];
//                i++;
//                arr[i] = arr[j];
//                j++;
//            }else {
//                j++;
//            }
//        }
//        return unique;
//    }

//    static int find1stRepeatingNum(int[] arr){
//        int firstRepeatingNum = 0;
//        Map<Integer, Integer> freq = new HashMap<>();
//        for (int i : arr){
//            freq.put(i, freq.getOrDefault(i, 0) + 1);
//        }
//        for (int i : arr){
//            if (freq.get(i) > 1){
//                firstRepeatingNum = arr[i];
//            }
//        }
//        return firstRepeatingNum;

//        int i = 0;
//        int ans = 0;
//        for (int j = 1; j < arr.length; j++){
//            if (arr[i] == arr[j]){
//                ans = arr[i];
//            }
//            else {
//                i++;
//            }
//        }
//        return ans;

//    }
    static int pivot(int[] arr){
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++){
            leftSum[i] = leftSum[i - 1] + arr[i];
        }

        rightSum[n - 1] = arr[n - 1];
        for (int j = n - 2; j > 0; j--){
            rightSum[j] = rightSum[j + 1] + arr[j];
        }

        for (int k = 0; k < n; k++){
            if (leftSum[k] == rightSum[k]){
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.print(pivot(arr));
//        int[] arr = {1,2,2,2,2,3,3,4};
//        find1stRepeatingNum(arr);
//        System.out.print(find1stRepeatingNum(arr));
//        System.out.print(removeDuplicates(arr));
//        int[] arr = {2,1,3,5,4,6};
//        int target = 7;
//        printArr(threeSum(arr, target));
    }
}
