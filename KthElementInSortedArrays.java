public class KthElementInSortedArrays {
    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        int kthElement = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                kthElement = arr1[i];
                i++;
            } else {
                kthElement = arr2[j];
                j++;
            }
            k--;
            if (k == 0) {
                return kthElement;
            }
        }

        while (i < m) {
            kthElement = arr1[i];
            i++;
            k--;
            if (k == 0) {
                return kthElement;
            }
        }

        while (j < n) {
            kthElement = arr2[j];
            j++;
            k--;
            if (k == 0) {
                return kthElement;
            }
        }

        return kthElement;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int kthElement = findKthElement(arr1, arr2, k);
        System.out.println("Kth element in the sorted array: " + kthElement);
    }
}

