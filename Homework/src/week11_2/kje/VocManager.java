package week11_2.kje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class VocManager {
    String userName;
    HashMap<String, String> map = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public VocManager(String userName) {
        this.userName = userName;
    }

    void addWord(Word w) {
        if (map.size() < 100)
            map.put(w.eng, w.kor);
        else
            System.out.println("더이상 단어를 저장할 수 없습니다.");
    }

    void makeVoc(String filename) {
        try (Scanner file = new Scanner(new File(filename))) {
            while (file.hasNextLine()) {
                String str = file.nextLine();
                String[] result = str.split("\t");
                this.addWord(new Word(result[0].trim(), result[1].trim()));
            }
            System.out.println(this.userName + "의 단어장이 생성되었습니다.");
            System.out.println();
            menu();
        } catch (FileNotFoundException e) {
            System.out.println("파일이름을 확인해 주세요.");
        }
    }

    private void menu() {
        int choice = 0;
        while (true) {
            System.out.println("------ " + this.userName + "의 단어장 ------");
            System.out.println("1)단어검색 2)단어검색2 3)종료");
            System.out.print("메뉴를 선택하세요 : ");
            choice = scan.nextInt();
            scan.nextLine();
            System.out.println();
            switch (choice) {
                case 1 -> searchVoc();
                case 2 -> searchVoc2();
                case 3 -> {
                    System.out.println(this.userName + "의 단어장 프로그램을 종료합니다.");
                    return;
                }
            }

        }
    }

    private void searchVoc2() {
        System.out.println("------ 단어 검색 ------");
        System.out.print("검색할 부분 단어를 입력하세요 (영단어) : ");
        String word = scan.nextLine().trim();
        for (String eng : map.keySet()) {
            if (eng.contains(word)) {
                System.out.println( eng + " : " + map.get(eng));
            }
        }
        System.out.println();
    }

    private void searchVoc() {
        System.out.println("------ 단어 검색 ------");
        System.out.print("검색할 단어를 입력하세요 (영단어) : ");
        String word = scan.nextLine().trim();
        boolean found = false;

        for (String eng : map.keySet()) {
            if (eng.equals(word)) {
                System.out.println("단어의 뜻 : " + map.get(eng) + "\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("단어장에 등록되지 않은 단어입니다.\n");
        }
    }
}
