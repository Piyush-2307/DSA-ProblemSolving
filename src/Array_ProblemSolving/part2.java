package Array_ProblemSolving;

import java.util.HashMap;

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

//    static void shiftByK(int[] arr, int k){
//        int n = arr.length;
//        int[] temp = new int[k];
//        int tempIndex = 0;
//        for (int i = n - k; i < n; i++){
//            temp[tempIndex] = arr[i];
//            tempIndex++;
//        }
//        for (int i = n - k - 1; i >= 0; i--){
//            arr[i + k] = arr[i];
//        }
//        tempIndex = 0;
//        for (int i = 0; i <= n - k; i++){
//            arr[i] = temp[tempIndex];
//            tempIndex++;
//        }
//        printArr(arr);
//    }

//    static int mode(int[] arr){
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        for (int num : arr){
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }
//
//        for (int i : freq.keySet()){
//            System.out.println(i + " -> " + freq.get(i));
//        }
//
//        int maxFreq = 0;
//        int maxFreqKey = 0;
//        for (int key : freq.keySet()){
//            int currentKey = key;
//            int currentKeyFreq = freq.get(key);
//            if (currentKeyFreq > maxFreq){
//                maxFreq = currentKeyFreq;
//                maxFreqKey = currentKey;
//            }
//        }
//        return maxFreqKey;
//    }

    static int[] findHFreqAndLowestFreq(int[] arr){
        HashMap<Integer,  Integer> freq = new HashMap<>();
        for (int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : freq.keySet()){
            System.out.println(i + " -> " + freq.get(i));
        }
        int maxFreq = 0;
        int maxFreqsKey = 0;
        for (int key : freq.keySet()){
            int currentFreq = freq.get(key);
            if (currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqsKey = key;
            }
        }
        int lowFreq = Integer.MAX_VALUE;
        int lowFreqsKey = 0;
        for (int key : freq.keySet()){
            int currentFreq = freq.get(key);
            if (currentFreq < lowFreq){
                lowFreq = currentFreq;
                lowFreqsKey = key;
            }
        }
        return new int[] {maxFreqsKey, lowFreqsKey};
    }

    public static void main(String[] args){
        int[] arr = {5,2,3,2,3,9,2,5};
        printArr(findHFreqAndLowestFreq(arr));
//        System.out.print(mode(arr));
//        int[] arr = {2,4,6,8,9};
//        shiftByK(arr, 3);
//        printAlternate(arr);
//        shiftBy1(arr);
//        reversArr(arr);
    }
}
