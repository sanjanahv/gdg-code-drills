class Solution {

    public int search(int[] arr, int target) {
        int n = arr.length;

        int pivot = findPivot(arr);

        // If array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, n - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, n - 1);
        }
    }

    private int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: left half sorted 
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // Case 4: right half sorted
            else {
                end = mid - 1;
            }
        }

        // Array not rotated
        return -1;
    }
    private int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
