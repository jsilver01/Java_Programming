package week12_example01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TestMain {

	public static void stack() {
		// TODO Auto-generated method stub
		Stack<Word> stack = new Stack<>();
		stack.push(new Word("red1","빨강1"));
		stack.push(new Word("red2","빨강2"));
		stack.push(new Word("red3","빨강3"));
		stack.push(new Word("red4","빨강4"));
		
		Iterator<Word> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-".repeat(20));
		
		//LIFO - stack
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	
	private static int getResult(String exp) {
		Stack<Integer> stack = new Stack<>();
		String[] str = exp.split(" ");
		
		for(String s:str) {
			switch(s) {
			case "+" ->{
				stack.push(stack.pop() + stack.pop());
			}
			case "-" ->{
				int num1 = stack.pop();
				int num2 = stack.pop();
				int result = num1 - num2;
				stack.push(result);
			}
			case "*" ->{
				int num1 = stack.pop();
				int num2 = stack.pop();
				int result = num1 * num2;
				stack.push(result);
			}
			case "/" ->{
				int num1 = stack.pop();
				int num2 = stack.pop();
				int result = num1 / num2;
				stack.push(result);
			}
			default -> {
				int num = Integer.parseInt(s);
				stack.push(num);
				}
			}
		}
		return stack.pop();
	}

	public static void stackExample() {
		// TODO Auto-generated method stub
		String exp = "3 20 6 * +";
		int result = getResult(exp);
		System.out.println(result);
	}

	
	
	public static void queue() {
		// TODO Auto-generated method stub
		Queue<Word> queue = new LinkedList<>();
		queue.offer(new Word("red1","빨강1"));
		queue.offer(new Word("red2","빨강2"));
		queue.offer(new Word("red3","빨강3"));
		queue.offer(new Word("red4","빨강4"));
		
		Iterator<Word> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-".repeat(20));
		
		//FIFO - queue
		while(!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
	

	public static void deque() {
		// TODO Auto-generated method stub
		Deque<Word> deque = new ArrayDeque<>();
		deque.offer(new Word("red1","빨강1"));
		deque.offer(new Word("red2","빨강2"));
		deque.offer(new Word("red3","빨강3"));
		deque.offer(new Word("red4","빨강4"));
		
		Iterator<Word> it = deque.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-".repeat(20));
		
		while(!deque.isEmpty()){
			System.out.println(deque.pollLast());
		}
	}

	public static void sort() {
		Integer[] arr = {1,2,3,4,5,6};
		Integer[] arr2 = {1,5,6,7,9,4,3};
		Arrays.sort(arr2);
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	
	public static void list(){
		Integer[] arr = {1,2,3,4,5,6};
		List<Integer> listarr = Arrays.asList(arr);
		LinkedList<Integer> list = new LinkedList<>(listarr);
		
		Collections.shuffle(list);
		printList(list);
		
		Collections.sort(list);
		printList(list);
		
		Collections.reverse(list);
		printList(list);
	}
	
	private static void printList(LinkedList<Integer> list) {
		for(int num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	
	public static void ArrayList() {
		List<Word> list = new ArrayList<>();
		list.add(new Word("red","빨강"));
		list.add(new Word("green","초록"));
		list.add(new Word("blue","파랑"));
		
		Collections.sort(list);
		System.out.println(list); 
		
	}
	
	
	public static void main(String[] args) {
		stack();
		queue();
		stackExample();
		deque();
		sort();
		list();
		ArrayList();
	}
}
