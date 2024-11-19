package Interfaces;
import java.util.Arrays;
public interface Sortable
{
    public int[] sort(int[] arr);

}
class BubbleSort implements Sortable
{
    @Override
    public int[] sort(int[] arr) {
        
        int n = arr.length;
        boolean swapped; 
        for (int i = 0; i < n - 1; i++) 
        { swapped = false; 
            for (int j = 0; j < n - i - 1; j++) 
            { if (arr[j] > arr[j + 1]) 
                { // Swap arr[j] and arr[j+1] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } // If no two elements were swapped in the inner loop, then break 
            if (!swapped) break;
        }
        return arr;
    }

}
class MergeSort implements Sortable
{
    @Override
    public int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr.clone();
        }
        int middle = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, middle));
        int[] right = sort(Arrays.copyOfRange(arr, middle, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }

}
class QuickSort implements Sortable
{
    @Override
    public int[] sort(int[] arr) {
        int[] sortedArr = arr.clone();
        quickSortHelper(sortedArr, 0, sortedArr.length - 1);
        return sortedArr;
    }

    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class Main
{
    public static void main(String[] args) {
        Sortable s1=new BubbleSort();
        System.out.println(Arrays.toString(s1.sort(new int[]{5,1,4,2,3})));

        
        Sortable s2=new MergeSort();
        System.out.println(Arrays.toString(s2.sort(new int[]{5,1,4,2,3})));

        
        Sortable s3=new QuickSort();
        System.out.println(Arrays.toString(s3.sort(new int[]{5,1,4,2,3})));
        
    }
}


