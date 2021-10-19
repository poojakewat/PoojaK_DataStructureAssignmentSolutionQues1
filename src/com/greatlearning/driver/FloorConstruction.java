package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.StackImplGL;

public class FloorConstruction {

	public FloorConstruction() {
	}
	static Scanner sc = new Scanner(System.in);

	static void floorConstructionEvaluation(int arr[],int size) {
		StackImplGL stack=new StackImplGL();

		for(int i = 0 ; i<size;i++) {
			int temp = i;
			++temp;
			System.out.println("enter the floor size given on day : "+temp);
			arr[i]=sc.nextInt();
		}

		int[] temp=new int[size];
		for (int i = 0; i < arr.length; i++)
			temp[i] = arr[i];

		MergeSort.sort(temp,0,temp.length-1);

		for(int i = 0 ; i<size;i++) {
			stack.push(temp[i]);
		}

		int k =0;
		try {
			for(int i = 0 ; i<size;i++) {
				int l=0;
				int m=i;
				++m;
				System.out.println("Day: "+m+"  ");
				l=k;

				while(l>=0 && stack.topStack()<=arr[l]&& !stack.isEmpty()) {
					int tempp=stack.pop();
					System.out.print(tempp+" ");
					l--;
				}
				System.out.println();
				k++;
			}
		}
		catch(ArrayIndexOutOfBoundsException ignored) {}

	}
	public static void main(String[] args){
		int ch;
		do {
			System.out.println("enter the total no of floors in the building");
			int noOfFloors = sc.nextInt();
			int[] floorSize = new int[noOfFloors];
			floorConstructionEvaluation(floorSize,noOfFloors);
			System.out.println("\nIf you want to evaluate another order of floor consutruction Please enter 1 and for exit enter 0");
			ch=sc.nextInt();
		}while(ch==1);

	}

}


