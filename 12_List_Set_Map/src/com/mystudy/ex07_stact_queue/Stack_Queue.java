package com.mystudy.ex07_stact_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//큐(Queue) 인터페이스 - LinkedList 클래스
//  형태상 파이프 모양(선입선출 : FIFO - First In First Out)
//----------
//스택(Stack) 클래스
//  형태상으로 바닥이 막힌 통의 형태(후입선출 : LIFO - Last In First Out) 
public class Stack_Queue {

	public static void main(String[] args) {
		//큐(Queue) - 선입선출
		System.out.println("----- 큐(Queue) : 선입선출 -----");
		Queue que = new LinkedList();
		que.offer("1.첫째");
		que.add("2.둘째");
		que.offer("3.셋째");
		que.offer("4.넷째");
		que.offer("5.다섯째");
		System.out.println(que);
		
		System.out.println("--- peek() ---");
		//peek() : 데이타를 확인만, 꺼내지는 않음
		System.out.println("que.peek() : " + que.peek());
		System.out.println("que.peek() : " + que.peek());

		System.out.println("\n--- poll() ---");
		//poll() : 데이타를 꺼내기, 데이타 없으면 null 리턴 
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
		
		System.out.println("---- 큐의 전체 데이타 추출 ---");
		while (!que.isEmpty()) {//비어있지 않으면
			System.out.println(que.poll());
		}
		System.out.println("que.size() : " + que.size());
		
		////////////////////////////////////////////
		System.out.println("==== 스택(Stack : LIFO - 후입선출) ====");
		Stack st = new Stack();
		st.push("1.첫째");
		st.push("2.둘째");
		st.add("3.셋째");
		st.add("4.넷째");
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.size());
		
		//peek() : 데이타 확인만(현재 사용할 수 있는)
		//pop() : 꺼내서 사용하기 - 현재 사용할 수 있는 데이타
		//  pop은 데이타가 없는데 pop() 하면 EmptyStackException 발생
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());//EmptyStackException
//		System.out.println("st.pop() : " + st.pop());//EmptyStackException
		System.out.println(st);
		
		System.out.println("--- 스택 전체 데이타 조회 ----");
		while (!st.empty()) { //비어있지 않으면
			System.out.println(st.pop());
		}
		System.out.println(st.size());
		
	}

}







