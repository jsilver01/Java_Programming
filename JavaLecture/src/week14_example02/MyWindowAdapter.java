package week14_example02;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class MyWindowAdapter extends WindowAdapter {
	MyFrame frame;
	
	public MyWindowAdapter(MyFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		String name = JOptionPane.showInputDialog("닉네임을 입력하세요");
		this.frame.setTitle(name+" 환영합니다.");
	}
	
}
