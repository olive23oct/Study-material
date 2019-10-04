package com.mystudy.ex07_stact_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//ť(Queue) �������̽� - LinkedList Ŭ����
//  ���»� ������ ���(���Լ��� : FIFO - First In First Out)
//----------
//����(Stack) Ŭ����
//  ���»����� �ٴ��� ���� ���� ����(���Լ��� : LIFO - Last In First Out) 
public class Stack_Queue {

	public static void main(String[] args) {
		//ť(Queue) - ���Լ���
		System.out.println("----- ť(Queue) : ���Լ��� -----");
		Queue que = new LinkedList();
		que.offer("1.ù°");
		que.add("2.��°");
		que.offer("3.��°");
		que.offer("4.��°");
		que.offer("5.�ټ�°");
		System.out.println(que);
		
		System.out.println("--- peek() ---");
		//peek() : ����Ÿ�� Ȯ�θ�, �������� ����
		System.out.println("que.peek() : " + que.peek());
		System.out.println("que.peek() : " + que.peek());

		System.out.println("\n--- poll() ---");
		//poll() : ����Ÿ�� ������, ����Ÿ ������ null ���� 
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.size() : " + que.size());
		
		System.out.println("---- ť�� ��ü ����Ÿ ���� ---");
		while (!que.isEmpty()) {//������� ������
			System.out.println(que.poll());
		}
		System.out.println("que.size() : " + que.size());
		
		////////////////////////////////////////////
		System.out.println("==== ����(Stack : LIFO - ���Լ���) ====");
		Stack st = new Stack();
		st.push("1.ù°");
		st.push("2.��°");
		st.add("3.��°");
		st.add("4.��°");
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.size());
		
		//peek() : ����Ÿ Ȯ�θ�(���� ����� �� �ִ�)
		//pop() : ������ ����ϱ� - ���� ����� �� �ִ� ����Ÿ
		//  pop�� ����Ÿ�� ���µ� pop() �ϸ� EmptyStackException �߻�
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());//EmptyStackException
//		System.out.println("st.pop() : " + st.pop());//EmptyStackException
		System.out.println(st);
		
		System.out.println("--- ���� ��ü ����Ÿ ��ȸ ----");
		while (!st.empty()) { //������� ������
			System.out.println(st.pop());
		}
		System.out.println(st.size());
		
	}

}







