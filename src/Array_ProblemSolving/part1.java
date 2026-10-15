package Array_ProblemSolving;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;

public class part1 {
//    static double getAvg(int[] arr){
//        int sum = 0;
//        for (int i : arr){
//            sum += i;
//        }
//        int size = arr.length;
//        return (double) sum/size;
//    }

//    static int[] multiplyBy10(int[] arr){
//        int size = arr.length;;
//        int arr2[] = new int[size];
//        for (int i = 0; i < size; i++){
//            int element = arr[i];
//            int newEle = element * 10;
//            arr2[i] = newEle;
//        }
//        return arr2;
//    }

//    static int findTargate(int[] arr){
//        int targate = 2;
//        for (int i = 1; i <= arr.length; i++){
//            if(i == targate){
//                System.out.println("Targate found");
//            }
//        }
//        return targate;
//    }

//    static int getMaxNum(int[] arr){
//        int maxi = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] > maxi){
//                maxi = arr[i];
//                System.out.print("Max number is: ");
//            }
//        }
//        return maxi;
//    }

//    static void sumOfEvenOdd(int[] arr){
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i : arr){
//            if (i % 2 == 0)evenSum += i;
//            else oddSum += i;
//
//        }
//        System.out.println("Total of evenSum is: " + evenSum);
//        System.out.println("Total of oddSum is: " + oddSum);
//    }

//    static int findUnsortedEle(int[] arr){
//        int naughtyEle = 0;
//        for (int i = 0; i < arr.length - 1; i++){
//            if(arr[i + 1] > arr[i]) naughtyEle = arr[i];
//        }
//        return naughtyEle;
//    }

//    static int[] swapEle(int[] arr){
//        for (int i = 0; i < arr.length - 1; i += 2){
//            int temp = arr[i];//store 2 in temp
//            arr[i] = arr[i + 1];//put the next ele in the current ele position
//            arr[i + 1] = temp;//put the stored ele in the next position
//        }
//        return arr;
//    }

//    static int[] findCommons(int[] arr, int[] arr2){
//        int[] comArr = new int[Math.min(arr.length, arr2.length)];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr2.length; j++){
//                if (arr[i] == arr2[j]){
//                    comArr[count] = arr[i];
//                    count++;
//                    break;
//                }
//            }
//        }
//        return copyOf(comArr, count);
//    }

//    static int[] towSum(int[] nums, int target) {
//        int[] total = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    total[0] = i;
//                    total[1] = j;
//                }
//            }
//        }
//        return total;
//    }





    public static void main(String[] args) {
//        int[] nums = {3,2,3};
//        int target = 6;
//        int[] ans = towSum(nums, target);
//        for(int i : ans){
//            System.out.println(i);
//        }
//        int[] arr = {2,3,9,5,13};
//        int[] arr2 = {1,2,3,4,5};
//        int[] ans = findCommons(arr, arr2);
//        for (int i : ans){
//            System.out.println(i);
//        }
//        int[] ans = swapEle(arr);
//        for (int i : ans){
//            System.out.println(i);
//        }
//        System.out.println(findUnsortedEle(arr));
//        int[] arr = {2, 4, 1, 3, 6, 7};
//        sumOfEvenOdd(arr);
//        System.out.println(getMaxNum(arr));
//        System.out.println(findTargate(arr));
//        int targate = 3;
//        int[] ans = multiplyBy10(arr);
//        System.out.println("printing an array : ");
//        for (int i : ans){
//            System.out.println(i);
//        }
        }
}
