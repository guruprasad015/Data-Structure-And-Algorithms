package com.guru.algorithms;

/*Median = Dividing a set into two equal length subsets, that one subset is always greater than the other.*/

public class MedianOfSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;

		if (m > n) {// make sure m<=n
			return findMedianSortedArrays(nums2, nums1);
		}

		int imin = 0, imax = m, halfLen = (m + n + 1) / 2;

		while (imin <= imax) {
			int i = (imin + imax) / 2;
			int j = halfLen - i;

			int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
			int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

			int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
			int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

			if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
				if ((m + n) % 2 == 0)
					return (double)(Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
				else
					return (double)Math.max(maxLeft1, maxLeft2);
			} else if (maxLeft1 > minRight2)
				imax = i - 1;
			else
				imin = i + 1;
		}
		return 0.0;
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		
		double median = findMedianSortedArrays(nums1, nums2);
		
		System.out.println("Median = " + median);
		
	}

}
