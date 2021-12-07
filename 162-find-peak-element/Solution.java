
//Approach 1 - Linear Approach
class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}

// Approach 2 - Binary Search - Iterative Approach
/*
 * class Solution {
 * public int findPeakElement(int[] nums) {
 * int start = 0, end = nums.length - 1;
 * while (start < end) {
 * int mid = (start + end)/2;
 * System.out.println("mid"+ mid);
 * if(nums[mid] > nums[mid + 1]) { //if its decending, move towards left
 * end = mid;
 * } else {
 * start = mid + 1; //if its in ascending, move towards right
 * }
 * }
 * return start;
 * }
 * }
 */

// Possible other questions
// What if they request to find last peak?
// What if they request to find first peak?
// What if they request to find if peak is there are not?
// What if they request to find peak count?
// What if they request second largest peak?