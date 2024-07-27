public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 7, 2, 8, 1 };

        int si = 0, ei = arr.length - 1;
        MergeSortFun(arr, si, ei);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void MergeSortFun(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // or (si + ei) / 2;

        MergeSortFun(arr, si, mid);
        MergeSortFun(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];

    int i = si; // index for 1st sorted part
    int j = mid + 1; // index for 2nd sorted part
    int k = 0; // index for temp

    while (i <= mid && j <= ei) {
        if (arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= ei) {
        temp[k++] = arr[j++];
    }

    for (k = 0, i = si; k < temp.length; k++, i++) {
        arr[i] = temp[k];
    }
}
}
