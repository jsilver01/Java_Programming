package example04;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEventAllEx extends JFrame {
	JLabel la = new JLabel(" Move Me");

	MouseEventAllEx() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);

		c.setLayout(null);

		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la); // 레이블 컴포넌트 삽입

		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseReleased(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseReleased(" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseClicked(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.CYAN);
		}

		public void mouseExited(MouseEvent e) {
			Component comp = (Component) e.getSource();
			comp.setBackground(Color.YELLOW);
		}

		public void mouseDragged(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")");
		}

		public void mouseMoved(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseMoved (" + e.getX() + "," + e.getY() + ")");
		}
	}

	public static void main(String[] args) {
		new MouseEventAllEx();
	}
}
