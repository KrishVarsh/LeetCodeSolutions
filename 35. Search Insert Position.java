class Solution {
    public int searchInsert(int[] arr, int m) {
        int low = 0, high = arr.length - 1, mid = 0, answer = arr.length;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == m) {
                return mid;
            } else if (arr[mid] > m) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }
}
