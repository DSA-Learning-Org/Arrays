public class ContainerWithWater {
    public static int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int maxArea = 0;

        while (left < right) {
            int currArea = (right - left) * Math.min(arr[left], arr[right]);
            maxArea = Math.max(maxArea, currArea);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(maxArea(arr));
    }
}
