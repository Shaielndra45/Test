package com.shailendra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxSumOfProductfSameArray {
public static void main(String[] args) {
	int sum=0,k;
	List<Integer> list = new ArrayList<Integer>();
	System.out.println("Enter The Range Of Array:");
	Scanner s = new Scanner(System.in);
	int n =s.nextInt();
	System.out.println("Enter The Element Of Array:");
	int a[] = new int[n];
	for(int i=0;i<=n-1;i++) {
	a[i] = s.nextInt();
	}
	for(int j=0;j<=n-1;j++) {
		for(k=j+1;k<=n-1;k++) {
		int p=a[j]*a[k];
		sum=sum+p;
		}
		list.add(sum);
		sum=0;
	}
	System.out.println(list);
	Integer max = Collections.max(list);
	System.out.println(max);
	s.close();
}
}