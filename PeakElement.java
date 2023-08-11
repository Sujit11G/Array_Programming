package com.jsp.Array;

public class PeakElement {

	public static void main(String[] args) {
        int[] array = {18, 3, 5, 2, 6,10,1,15,1};
        int peak = findPeakElement(array);
        System.out.println("Peak element: " + peak);  // Output: Peak element: 5
    }
    
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right-left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
               // return nums[left];
            } else {
                right = mid;
               // return nums[right];
            }
        }
        
        return nums[right];
    }
}
