package lecture2.example02;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	ButtonImageEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("images/toggle_off.png");
		ImageIcon rolloverIcon = new ImageIcon("images/toggle_on.png");
		ImageIcon pressedIcon = new ImageIcon("images/toggle_on.png");

		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon); // pressedIcon용 이미지 등록
		btn.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록

		c.add(btn);
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();
	}
}
