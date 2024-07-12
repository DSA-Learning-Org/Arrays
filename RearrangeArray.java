import java.util.ArrayList;

public class RearrangeArray {

    public static int[] rearrangeArr(int[] arr, int pivot) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < pivot) {
                al.add(arr[i]);
            } else if (arr[i] == pivot) {
                al1.add(arr[i]);
            } else {
                al2.add(arr[i]);
            }
        }

        int[] newArr = new int[arr.length];

        int l = 0;
        for (int i : al) {
            newArr[l] = i;
            l++;
        }

        for (int k : al1) {
            newArr[l] = k;
            l++;
        }

        for (int m : al2) {
            newArr[l] = m;
            l++;
        }
        return newArr;
    }

    public static int[] optimized(int[] arr, int pivot) {
        int[] newArr = new int[arr.length];
        int pointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pivot) {
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > pivot) {
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = { -3, 4, 3, 2 };

        int pivot = 2;
        // int[] ans = rearrangeArr(arr, pivot); // My ans => TC :- O(n) SC :- O(n)
        int[] optAns = optimized(arr, pivot); // Optimized ans => TC :- O(n) SC :- O(1)

        for (int k : optAns) {
            System.out.print(k + " ");
        }
    }
}