package leetcode;

public class QuickSort {
    public static void main(String[] args) {

    }

    static void quickSort(int arr[], int start, int end) {
        if (start >= end) return;
        int pivot = arr[end];
        int left = start;
        int right = end;
        boolean rightIsNull = true;
        while (left < right) {
            if (rightIsNull) {
                // 移动左指针
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    right--;
                    rightIsNull = !rightIsNull;
                } else {
                    left++;
                }
            } else {
                // 移动右指针
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    left++;
                    rightIsNull = !rightIsNull;
                } else {
                    right--;
                }
            }
        }
        // pivot放置到空的位置 left right都行
        arr[left] = pivot;
        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }
}
