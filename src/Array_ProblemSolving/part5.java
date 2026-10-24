package Array_ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class part5 {

    static void printAr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    static void printAr(List<Integer> arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

//    static int missingNum(int[] arr){
//        int n = arr.length;
//        int missingNum = 1;
 //        int[] checkArr = new int[n];
//        for (int i = 0; i < n; i++){
//            checkArr[i] = i + 1;
//        }
//        for (int i = 0; i < n; i++){
//            missingNum = checkArr[i] ^ arr[i];
//            if (checkArr[i] != arr[i]){
//                missingNum = checkArr[i];
//            }
//        }
//        return missingNum;
//    }

//    static boolean linear(int[] arr, int target){
//        int n = arr.length;
//        for (int num : arr){
//            if (num == target){
//                return true;
//            }
//        }
//        return false;
//    }

//    static void missingNum(int[] arr){
//        int n = arr.length;
//        List<Integer> missingNums = new ArrayList<>();
//        int count = 0;
//        int[] checkArr = new int[n];
//        for (int i = 1; i <= n; i++){
//            checkArr[count++] = i;
//        }
//        for (int i = 0; i < n; i++){
//            int val = checkArr[i];
//            boolean isPresent = linear(arr, val);
//                if(!isPresent){
//                    missingNums.add(val);
//                }
//            }
//        for(int num:missingNums){
//            System.out.print(num + " ");
//        }
//    }

//        static ArrayList<Integer> missingNumSup(int[] arr){
//            ArrayList<Integer> ans = new ArrayList<>();
//            for (int i=0;i<arr.length;i++){
//                int index = Math.abs(arr[i])- 1;
//                int val = index;
//                int valOfIndex = arr[val];
//
//                if(valOfIndex > 0){
//                    arr[val] *= -1;
//                }
//            }
//
//            for(int i=0;i<arr.length;i++){
//                if(arr[i]>0){
//                    ans.add(i+1);
//                }
//            }
//            return ans;
//        }


    public static void main(String[] args) {
        int[] arr = {1,4,4,5,2,2};
//        printAr(missingNumSup(arr));

    }
}
