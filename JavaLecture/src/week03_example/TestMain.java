package week03_example;

import java.util.Random;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선택정렬 알고리즘(selection sort)
		//example01();
		//example02();
		example03();
	}
	
	
	public static void example03() {
		int[] lotto = makeLotto();
		System.out.println("로또 번호");
		for(int j :lotto)
			System.out.print(j+" ");
		System.out.println();
	}
	
	public static int[] makeLotto() {
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rand.nextInt(46)+1;//0~46
			//중복제거
			for(int j =0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		//중복제거
		for(int j=0; j<lotto.length-1;j++) {
			for(int k = j+1; k<lotto.length; k++) {
				if(lotto[j]==lotto[k]) {
					lotto[k]=rand.nextInt(46)+1;
				}
			}
		}
		
		return lotto;
	}


	public static void example02() {
		String[] list = {"홍길동","김길동","최길동","고길동","이길동"}; 
		
		System.out.print("정렬 전 : ");
		for(String num : list)
			System.out.print(num + " ");
		System.out.println();
		
		for(int i = 0; i < list.length-1; i++) {
			int minIdx = i;
			for(int j=i+1; j<list.length; j++) {
				if(list[j].compareTo(list[minIdx])<0)
					minIdx = j;
			}
			if(i!=minIdx) {
				String temp = list[i];
				list[i]=list[minIdx];
				list[minIdx] = temp;
				
				//참조형데이터 연산에 대해서는 ^연산이 지원되지 않는다.
			}
		}
		
		System.out.print("정렬 후 : ");
		for(String num: list)
			System.out.print(num+" ");
		System.out.println();
	}
	
	public static void example01() {
//		int[] list = null;
//		list = new int[] {10, 50, 5, 60, 45, 70};
		
//		int[] list = new int[6];
//		list[0]=10;
//		list[1]=50;
		int[] list = {10, 50, 5, 60, 45, 70}; 
		System.out.print("정렬 전 : ");
		for(int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		for(int i = 0; i < list.length-1; i++) {
			int minIdx = i;
			for(int j=i+1; j<list.length; j++) {
				if(list[minIdx]>list[j])
					minIdx = j;
			}
			if(i!=minIdx) {
//				int temp = list [i];
//				list[i]=list[minIdx];
//				list[minIdx] = temp;
				
				list[i] = list[i]^list[minIdx];
				list[minIdx] = list[i]^list[minIdx];
				list[i] = list[i]^list[minIdx];
			}
		}
		
		System.out.print("정렬 후 : ");
		for(int num: list)
			System.out.print(num+" ");
		System.out.println();
	}
	
}
