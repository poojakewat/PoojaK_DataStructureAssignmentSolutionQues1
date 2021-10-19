package com.greatlearning.service;

public class StackImplGL {
	static final int Size_of_stack = 1000;
	public int current_pointer ;
	public int a[]=new int[Size_of_stack];
	//new int[Size_of_stack]; // Maximum size of Stack
	public StackImplGL()
	{
		current_pointer = -1;
	}
	public boolean push(int x)
	{
		if (current_pointer >= (Size_of_stack - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++current_pointer ] = x;
			//System.out.println(x + " pushed into stack");
			return true;
		}
	}
	public int pop()
	{
		if (current_pointer < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[current_pointer --];
			return x;
		}
	}
	public int topStack() {
		return a[current_pointer];
	}
	public boolean isEmpty() {
		if (current_pointer < 0) {
			//System.out.println("Stack Underflow");
			return true;
		}else
			return false;
	}
	public void printStack(){
		for(int i = current_pointer ;i>-1;i--){
			System.out.print(" "+ a[i]);
		}
	}
}