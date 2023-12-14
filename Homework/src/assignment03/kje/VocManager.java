package assignment03.kje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class VocManager {
    String username;
    Map<String, String> wordmap = new HashMap<>(); //단어 저장
    int count = 0;
    int counttime = 0;
    int wrongnum = 0; // 오답횟수
    String[] words; // key 값만 저장
    Set<String> usedWords = new HashSet<>(); // 이미 출제한 단어를 기록하는 집합
    Map<String, Integer> showmap = new HashMap<>();
    Map<String, Integer> wrongmap = new HashMap<>();
    boolean flag = false;
    
    Scanner scan = new Scanner(System.in);

    public VocManager(String username) {
        super();
        this.username = username;
    }

    void addWord(Word w) {
        wordmap.put(w.eng, w.kor);
        words = wordmap.keySet().toArray(new String[0]);
        showmap.putIfAbsent(w.eng, 0);
        wrongmap.putIfAbsent(w.eng, 0);
    }

    public void makeVoc(String filename) {
        try (Scanner file = new Scanner(new File(filename))) {

            while (file.hasNextLine()) {
                String str = file.nextLine();
                String[] result = str.split("\t");
                this.addWord(new Word(result[0].trim(), result[1].trim()));
            }
            System.out.println(this.username + "의 단어장이 생성되었습니다.");
            System.out.println();
            menu();

        } catch (FileNotFoundException e) {
            System.out.println("파일이름을 확인해 주세요.");
        }
    }

    private void menu() {
        int choice = 0;
        while (true) {
            System.out.println("------ " + this.username + "의 영단어 퀴즈 ------");
            System.out.println("1) 주관식 퀴즈 2) 객관식 퀴즈 3) 오답노트 4) 단어검색 5) 종료");
            try {
            	System.out.print("메뉴를 선택하세요 : ");
            	choice = scan.nextInt();
                scan.nextLine();
                System.out.println();
                switch (choice) {
                    case 1 -> shortAnswerQuiz();
                    case 2 -> multipleChoiceQuiz();
                    case 3 -> showWrongNote();
                    case 4 -> searchVoc();
                    case 5 -> {
                        System.out.println(this.username + "의 단어장 프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("메뉴를 다시 확인해주세요.\n");
                }
            }catch(InputMismatchException e) {
            	System.out.println("\n메뉴를 다시 확인해주세요.\n");
            	scan.nextLine();
            }
            
        }
    }

    public void shortAnswerQuiz() {
        int correctnum = 0; //맞은개수
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 10; i++) {
            System.out.println("------ 주관식 퀴즈 " + i + "번------");

            String korMeaning;
            String randomKey;
            do {
                randomKey = words[new Random().nextInt(words.length)];
                korMeaning = wordmap.get(randomKey).trim();
            } while (usedWords.contains(wordmap.get(randomKey).trim())); // 이미 출제한 문제면 다시 선택

            usedWords.add(korMeaning); // 출제한 한글 뜻 문제 기록

            System.out.println("\"" + korMeaning + "\"의 뜻을 가진 영어 단어는 무엇일까요?");
            System.out.print("답을 입력하세요 : ");
            String eword = scan.nextLine().trim();
            
            String[] correctAnswers = getCorrectAnswers(korMeaning);
            for(String w : correctAnswers) {
            	if(w.equals(eword)) {
            		System.out.println("정답입니다.");
            		this.flag = true;
                    correctnum++;
                    break;
            	}
            }
            
            if(flag) {
            	for (String correct : correctAnswers) {
                    showmap.put(correct, showmap.getOrDefault(correct, 0) + 1);
                }
            }else {
            	System.out.print("틀렸습니다. 정답은 ");
                for (int j = 0; j < correctAnswers.length; j++) {
                    System.out.print(correctAnswers[j]);
                    if (j < correctAnswers.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("입니다.");
                for (String correct : correctAnswers) {
                    wrongmap.put(correct, wrongmap.getOrDefault(correct, 0) + 1);
                    showmap.put(correct, showmap.getOrDefault(correct, 0) + 1);
                }

            }
           flag = false;
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        System.out.println(this.username + "님 10문제 중 " + correctnum + "개 맞추셨고, 총 " + totalTime + "초 소요되었습니다.\n");
        usedWords.clear();
    }
    

    public String[] getCorrectAnswers(String korMeaning) {
        List<String> correctAnswers = new ArrayList<>();
        for (Map.Entry<String, String> entry : wordmap.entrySet()) {
            if (entry.getValue().trim().equalsIgnoreCase(korMeaning)) {
                correctAnswers.add(entry.getKey());
            }
        }
        return correctAnswers.toArray(new String[0]);
    }
    
    
    private void multipleChoiceQuiz() {
		int correctnum = 0; //맞은개수
		Set<String> usedOptions = new HashSet<>();
		long startTime = System.currentTimeMillis();
		
		for(int i = 1; i < 11; i++) {
			String randomKey;
            do {
                randomKey = words[new Random().nextInt(words.length)];
            } while (usedWords.contains(randomKey)); // 이미 출제한 문제면 다시 선택

            usedWords.add(randomKey); // 출제한 문제 기록
            
            showmap.put(randomKey, showmap.getOrDefault(randomKey, 0) + 1);
            
            String correctAnswer = wordmap.get(randomKey); //정답보기
			usedOptions.add(correctAnswer); // 정답을 사용된 옵션에 추가
            
            List<String> options = new ArrayList<>();
            for(String word : wordmap.values()) {
            	if(!usedOptions.contains(word)) {
            		options.add(word);
            	}
            }
            options.remove(correctAnswer); // 정답 제거
            Collections.shuffle(options); // 무작위로 섞기
            options = options.subList(0, 3); // 잘못된 답변 3개 선택
            options.add(correctAnswer); // 정답 추가
            Collections.shuffle(options); // 다시 섞어서 정답의 위치를 무작위로 함

			System.out.println("------ 객관식 퀴즈 " + i + "번------");
			System.out.println(randomKey + "의 뜻은 무엇일까요?");
			
			int answerIndex = 1;
	        for (String option : options) {
	            System.out.println(answerIndex + ") " + option);
	            answerIndex++;
	        }
	        try {
	        	 System.out.print("답을 입력하세요: ");
	 	        int userAnswer = scan.nextInt();
	 	        
	 	        boolean validInput = userAnswer >= 1 && userAnswer <= options.size() ;
	 	        if(validInput) {
	 	        	if (options.get(userAnswer - 1).equals(correctAnswer)) {
	 		            System.out.println("정답입니다.");
	 		            correctnum++;
	 		        }else {
	 		        	System.out.println("틀렸습니다. 정답은 " + (options.indexOf(correctAnswer) + 1) + "번입니다.");
	 		        	wrongmap.put(randomKey, wrongmap.getOrDefault(randomKey, 0) + 1);
	 		        }
	 	        }else {
	 	            System.out.println("틀렸습니다. 정답은 " + (options.indexOf(correctAnswer) + 1) + "번입니다.");
	 	            wrongmap.put(randomKey, wrongmap.getOrDefault(randomKey, 0) + 1);
	 	        }
	        }catch(InputMismatchException e) {
	        	System.out.println("틀렸습니다. 정답은 " + (options.indexOf(correctAnswer) + 1) + "번입니다.");
 	            wrongmap.put(randomKey, wrongmap.getOrDefault(randomKey, 0) + 1);
 	            scan.nextLine();
	        }
		}
		
		long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
		System.out.println(this.username + "님 10문제 중 " + correctnum +"개 맞추셨고, 총"+totalTime+"초 소요되었습니다.\n");
		usedWords.clear();
	}
    
    
    private void showWrongNote() {
        // 오답 노트를 틀린 횟수가 많은 순으로 정렬하여 출력
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wrongmap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        // 틀린 횟수가 있는지 확인하기 위한 플래그
        boolean hasWrong = false;

        for (Map.Entry<String, Integer> entry : sortedList) {
            if (entry.getValue() > 0) {
                hasWrong = true;
                break;
            }
        }

        if (!hasWrong) {
            System.out.println("틀린 문제가 없습니다.");
        } else {
            for (Map.Entry<String, Integer> entry : sortedList) {
                String word = entry.getKey();
                int wrongCount = entry.getValue();
                if (wrongCount > 0) { // 한 번 이상 틀린 단어만 출력
                    int showCount = showmap.getOrDefault(word, 0);
                    String meaning = wordmap.get(word);

                    System.out.println(word + " 뜻: " + meaning);
                    System.out.println("출제회수: " + showCount + "\t오답회수: " + wrongCount);
                    System.out.println("-".repeat(20));
                }
            }
        }
    }
    
    private void searchVoc() {
		System.out.println("------ 단어 검색 ------");
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine().trim();
		for(String a : words) {
			if(a.equals(word)) {
				System.out.println(word + " 뜻 : "+ wordmap.get(a));
				System.out.println("출제회수 : " + showmap.get(word)+ "\t오답회수 : "+ wrongmap.get(word));
				System.out.println("-".repeat(20)+"\n");
				return;
			}
		}
		System.out.println("단어장에 등록된 단어가 아닙니다.");
		System.out.println("-".repeat(20)+"\n");
    }
}
