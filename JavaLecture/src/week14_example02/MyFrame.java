package week14_example02;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("2000 홍길동");
		this.setSize(500,500);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
	}
	
	private void init() {
		//his.addWindowListener(new MyWindowListener(this));
		//this.addWindowListener(new MyWindowAdapter(this));
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(MyFrame.this, "안녕히 가세요");
				System.exit(0);
			} //이거를 하면 위에 setDefaultCloseOperation 이게 필요가 없음
		});
	}

	class MyWindowAdapter2 extends WindowAdapter{
		@Override
		public void windowOpened(WindowEvent e) {
			String name = JOptionPane.showInputDialog("닉네임을 입력하세요");
			MyFrame.this.setTitle(name+" 환영합니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();
	}

}
