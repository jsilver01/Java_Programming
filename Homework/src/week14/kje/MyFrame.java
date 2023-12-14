package week14.kje;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements KeyListener{
	Container frame = getContentPane();
	JPanel panel1, panel2;
	JLabel charIcon = new JLabel();
	ImageIcon imgicon = new ImageIcon("img/char.png");
	int x_position = 200;
	int y_position = 200;

	public MyFrame(){
		this.setTitle("202114219 김정은");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		this.setVisible(true);
		panel2.requestFocus();
		panel2.addKeyListener(this);
	}

	
	private void init() {
		initpanel1();
		initpanel2();
	}


	private void initpanel2() {
		this.panel2 = new JPanel();
		this.panel2.setLayout(null);
		this.charIcon.setIcon(imgicon);
		this.charIcon.setBounds(x_position, y_position, imgicon.getIconWidth(), imgicon.getIconHeight());
		
		this.panel2.add(charIcon);
		frame.add(panel2, BorderLayout.CENTER);
	}


	private void initpanel1() {
		this.panel1 = new JPanel(new GridLayout(4,1));
		
		JButton btn1 = new JButton("▲");
		btn1.addActionListener(e ->{
			if(y_position >= 10)
				y_position -= 10;
			this.charIcon.setBounds(x_position, y_position, imgicon.getIconWidth(), imgicon.getIconHeight());
		});
		
		JButton btn2 = new JButton("▼");
		btn2.addActionListener(e ->{
			if(y_position <= panel2.getHeight()-charIcon.getHeight())
				y_position += 10;
			this.charIcon.setBounds(x_position, y_position, imgicon.getIconWidth(), imgicon.getIconHeight());
		});
		
		JButton btn3 = new JButton("◀︎");
		btn3.addActionListener(e ->{
			if(x_position >= 10)
				x_position -= 10;
			this.charIcon.setBounds(x_position, y_position, imgicon.getIconWidth(), imgicon.getIconHeight());
		});
		
		JButton btn4 = new JButton("▶︎︎︎");
		btn4.addActionListener(e ->{
			if(x_position <= panel2.getWidth() - charIcon.getWidth())
				x_position += 10;
			this.charIcon.setBounds(x_position, y_position, imgicon.getIconWidth(), imgicon.getIconHeight());
		});
		
		this.panel1.add(btn1);
		this.panel1.add(btn2);
		this.panel1.add(btn3);
		this.panel1.add(btn4);
		
		frame.add(this.panel1, BorderLayout.WEST);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT -> {x_position -= 10;}
		case KeyEvent.VK_RIGHT -> {x_position +=10;}
		case KeyEvent.VK_UP -> {y_position -= 10;}
		case KeyEvent.VK_DOWN -> {y_position +=10;}
		}
		charIcon.setLocation(x_position, y_position);
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
