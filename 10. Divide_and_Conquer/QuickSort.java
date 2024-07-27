public class QuickSort {

    public static void Quick_Sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int PIdx = Partition(arr, si, ei);
        Quick_Sort(arr, si, PIdx - 1);
        Quick_Sort(arr, PIdx + 1, ei);
    }

    public static int Partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 8, 3 };
        Quick_Sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
