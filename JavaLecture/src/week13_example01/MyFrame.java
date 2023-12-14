package week13_example01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	Container frame = getContentPane();
	JPanel panel1, panel2;
	List<JButton> btnlist = new ArrayList<>();
	List<String> strlist = List.of("RED", "GREEN" ,"BLUE"); //이렇게 생성된 리스트는 변경불가능
	List<Color> colorlist = List.of(Color.RED , Color.GREEN , Color.BLUE);

	public MyFrame() throws HeadlessException {
		this("202114219 김정은");
	}

	public MyFrame(String title) throws HeadlessException {
		super(title);
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		this.setSize(500,500);
		//this.setSize(tool.getScreenSize().width, tool.getScreenSize().height);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //이거 안정해주면 나가기 버튼 눌러도 종료 안되는데 이거 설정하면 종료됨
		
		//icon 변경
		Image img = tool.getImage("img/char.png");
		this.setIconImage(img);
		
		//this.setLocation(300,250);
		//화면 중앙 배치
		this.setLocationRelativeTo(null);
		
		init(); //각종 컨퍼넌트 생성 및 부착
		
		this.setVisible(true);
	}

	private void init() {
		initPanel1();
		initPanel2();
	}

	private void initPanel2() {
		this.panel2 = new JPanel();
		this.panel2.setBackground(Color.GREEN);
		
		frame.add(panel2);
	}

	private void initPanel1() {
		this.panel1 = new JPanel(); //패널객체 생성
		this.panel1.setBackground(Color.ORANGE);
		for(int i = 0; i<strlist.size(); i++) {
			final int index = i; //i 가 변수라서 쓸 수 없어서 상수 선언해서 사용
			JButton btn = new JButton(strlist.get(i));
//			btn.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					//여기서의 디스는 엑션리스너 객체를 의미하는거지 프레임이 아니라는거 주의
//					panel2.setBackground(colorlist.get(index));
//					
//				}});
			btn.addActionListener(e -> panel2.setBackground(colorlist.get(index)));
			this.panel1.add(btn);
		}
		frame.add(panel1, BorderLayout.NORTH);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
		
	}


}
