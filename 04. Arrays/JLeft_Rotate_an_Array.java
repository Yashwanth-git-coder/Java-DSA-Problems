public class JLeft_Rotate_an_Array {

    static void leftRotate(int a[], int n) {
        int temp = a[0];

        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 8, 9, 8, 6, 7, 6 };
        int n = a.length;

        System.out.println("Before Modification :");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println(" ");

        // Perform left rotation by one
        leftRotate(a, n);

        System.out.println("After Modification :");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
    }
}
