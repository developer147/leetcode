package com.jh.practice.leetcode.recursion;

import java.util.Arrays;

public class MergeSort {
	public static int[] sort(int[] array) {
		if (array.length <= 1) {
			return array;
		}
		
		int mid = array.length / 2;
		int[] left = sort(Arrays.copyOfRange(array, 0, mid));
		int[] right = sort(Arrays.copyOfRange(array, mid, array.length));
		
		return merge(left, right);
	}
	
	private static int[] merge(int[] left, int[] right) {
		int leftCursor = 0, rightCursor = 0;
		
		int[] output = new int[left.length + right.length];
		int index = 0;
		while (leftCursor < left.length && rightCursor < right.length) {
			output[index++] =  left[leftCursor] < right[rightCursor] ?
				left[leftCursor++] : right[rightCursor++];
		}
		
		while (leftCursor < left.length) {
			output[index++] = left[leftCursor++]; 
		}
		while (rightCursor < right.length) {
			output[index++] = right[rightCursor++];
		}
		
		return output;
	}

}
