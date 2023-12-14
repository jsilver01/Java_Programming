package example03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener3 extends JFrame {
	IndepClassListener3() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) 
					b.setText("액션");
				else 
					b.setText("Action");
					// AnonymousClassListener나 
					// JFrame의 멤버를 호출 가능
					setTitle(b.getText());
			}
		});

		setSize(250, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}
