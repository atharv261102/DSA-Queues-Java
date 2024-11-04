package com.UsingArray;

public class MyQueue implements Queue {
	int front;
	int rear;
	int size;
	int [] arr;
	
	public MyQueue(int size) {
		this.size=size;
		arr=new int[size];
		this.front=0;
		this.rear=0;
	}
	
	
	@Override
	public void enque(int x) {
		if(isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		arr[rear]=x;
		rear+=1;
	}

	@Override
	public void deque() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
			return; 
		}
		front+=1;
		return;
	}

	@Override
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
			return -1; 
		}
		return arr[front];
		
	}

	@Override
	public boolean isEmpty() {
		return (front==rear);
	}

	@Override
	public boolean isFull() {
		return rear==arr.length;
	}

	@Override
	public void print() {
		for(int i=front; i<rear; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
