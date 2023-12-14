package week03.kje;

import java.util.Random;

public class kjeLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		sorting();
	}
	
	public static void sorting() {
		int[] lotto = makeLotto();
		
		for(int i = 0; i < lotto.length-1; i++) {
			int minIdx = i;
			for(int j=i+1 ; j<lotto.length; j++) {
				if(lotto[minIdx]>lotto[j])
					minIdx = j;
			}
			if(i!=minIdx) {
				int temp = lotto[i];
				lotto[i]=lotto[minIdx];
				lotto[minIdx] = temp;
			}
		}
		System.out.printf("로또 번호 : ");
		for(int j :lotto)
			System.out.print(j+" ");
		System.out.println();
	}
	
	
	public static int[] makeLotto() {
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i = 0 ; i<lotto.length;i++) {
			lotto[i]=rand.nextInt(46); //1~45
			//중복 제거
			for(int j =0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
}
