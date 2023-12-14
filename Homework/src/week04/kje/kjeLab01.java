package week04.kje;

public class kjeLab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202114219 김정은");
		
		String[] name = {"홍길동","고길동","김길동","이길동"};
		int[][] score  = {{10,20,30,0,0},
				{20, 30, 40,0,0},
				{10,25,30,0,0},
				{30,30,40,0,0}};
		
		getTotalScore(score);
		getRank(score);
		printScore(name,score);
	}
	
	public static void getTotalScore(int[][] score) {
		for(int[] arr : score) {
			for(int i=0;i<score[0].length-2 ;i++) {
				arr[score[0].length-2] += arr[i];
			}
		}
	}
	
	public static void getRank(int[][] score) {
		for(int i=0 ; i<score.length;i++) {
			int rank = 1;
			for(int j = 0; j<score.length;j++) {
				if(score[j][score[0].length-2]>score[i][score[0].length-2]) {
					rank++;
				}
			}
			score[i][score[0].length-1] = rank;
		}
			
	}


	
	public static void printScore(String[] name, int[][] score) {
		 for (int i = 0; i < name.length; i++) {
		        System.out.print(name[i] + " >> ");
		        
		        for(int j=0;j< score.length-1;j++) {
					System.out.print(score[i][j]+" ");
				}
		        System.out.print(" : " + score[i][score.length-1]);
		        System.out.println(" : "+ score[i][score.length]);
		    }
	}
}
	
	