package com.UsingArray;

public class Tester {
	public static void main(String[] args) {
		MyQueue mq=new MyQueue(5);
		System.out.println(mq.isEmpty()); //true
		System.out.println(mq.peek()); //Queue is empty!, -1
		mq.enque(1);
		mq.enque(2);
		mq.enque(3);
		mq.enque(4);
//		mq.enque(5);
//		mq.enque(6); //Queue is full!
		System.out.println("Initial peek: " + mq.peek()); //1
		mq.print(); //1 2 3 4
		System.out.println(mq.isFull()); //false
		mq.deque(); //Removes front element from the array
		System.out.println("Modified peek: " + mq.peek()); //2
		mq.print(); //2 3 4
	}
}
