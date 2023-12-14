package example04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame {
	JLabel la = new JLabel("Hello"); // "Hello" 출력용 레이블

	MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//c.addMouseListener(new MyMouseListener());
		c.addMouseListener(new MyMouseAdapter());
			
		c.setLayout(null); //우리 마음대로 위치 지정하고싶어서 null 로 설정,배치관리자 삭제
		la.setSize(50, 20); // 레이블의 크기 50x20 설정
		la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
		c.add(la); 

		setSize(200, 200);
		setVisible(true);
	}
	
	//이렇게 어뎁터 사용하면 됨
	class MyMouseAdapter extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스의 클릭 좌표 x
			int y = e.getY(); // 마우스의 클릭 좌표 y
			la.setLocation(x, y); // (x,y) 위치로 레이블 이동
		}
		
	}
	
	//내부 클래스로 선언
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); // 마우스의 클릭 좌표 x
			int y = e.getY(); // 마우스의 클릭 좌표 y
			la.setLocation(x, y); // (x,y) 위치로 레이블 이동
		}

		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}

	public static void main(String [] args) {
		new MouseListenerEx();
	}
} 


