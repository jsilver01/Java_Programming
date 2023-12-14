package week12.kje;

import java.util.Stack;

public class TestMain {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		String exp1 = "3 20 6 * +";
		int result1 = getResult(exp1);
		System.out.println("result1 = " + result1);
		String exp2 = "3 20 6 * 2 * + 20 +";
		int result2 = getResult(exp2);
		System.out.println("result2 = " + result2);
	}

}
