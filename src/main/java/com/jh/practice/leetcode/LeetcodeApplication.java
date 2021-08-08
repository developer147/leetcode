package com.jh.practice.leetcode;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jh.practice.leetcode.recursion.MergeSort;

@SpringBootApplication
public class LeetcodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeetcodeApplication.class, args);
		int[] mergeSort = MergeSort.sort(new int[]{1,5,3,2, 8,7,6,4});
		System.out.println(Arrays.toString(mergeSort));		
	}
	
//	void selectTopic() {
//		switch()
//	}
//	
//	void selectSubtopic() {
//		
//	}
	
}
