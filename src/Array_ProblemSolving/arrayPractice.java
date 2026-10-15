package Array_ProblemSolving;

public class arrayPractice {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i + 1] + " ");
        }
    }

    static void threeSum(int[] arr){
        int i = 0;
        while (i < arr.length - 2){
            int ans = arr[i] + arr[i + 1] + arr[i + 2];
            i++;
            System.out.println(ans);
        }
    }

    static void multiplyByIndex(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int ans = arr[i] * i;
            System.out.println(ans);
        }
    }

    static void diagonalFuckUp(int[] arr){
        int n = arr.length;
        int j = n - 1;
        for (int i = 0; i < arr.length; i++){
            int ans = j * arr[i];
            j--;
            System.out.println(ans);
        }
    }

    static void fourSum(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n -1;
        while (i < arr.length && j >= 0){
            int ans = i + arr[i] + j + arr[j];
            i++;
            j--;
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,9,12,15};
        fourSum(arr);
//        diagonalFuckUp(arr);
//        multiplyByIndex(arr);
//        threeSum(arr);
//        printArray(arr);

    }

}
