package Array.Assignment;

public class TrappingRainwater {

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;  // two pointers
        int leftMax = 0, rightMax = 0;            // track max heights
        int water = 0;                            // result

        while (left < right) {
            if (height[left] < height[right]) {
                // if left bar is smaller
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // update leftMax
                } else {
                    water += leftMax - height[left]; // trap water
                }
                left++;
            } else {
                // if right bar is smaller
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // update rightMax
                } else {
                    water += rightMax - height[right]; // trap water
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] heights = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(heights));
    }
}
