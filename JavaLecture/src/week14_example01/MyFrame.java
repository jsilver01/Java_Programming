package week14_example01;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//지난 시간 예제에다가 위에 좌,홈,우 버튼 gridlayout으로 생성하고 아래는 cardlayout으로 생성해서 색깔카드 하나씩 옮기는 작업 수행
public class MyFrame extends JFrame{
	Container frame = getContentPane();
	JPanel panel1, panel2;
	CardLayout cl = new CardLayout();
	List<JPanel> cards = new ArrayList<>();
	List<Color> colorlist = List.of(Color.RED , Color.GREEN , Color.BLUE, Color.CYAN, Color.ORANGE);
	
	JLabel charIcon = new JLabel();
	ImageIcon imgicon = new ImageIcon("img/char.png");
	int x_position = 100;

	public MyFrame() {
		this.setTitle("2000 홍길동");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		init();
		//init2();
		this.setVisible(true);
	}


	private void init2() {
		// TODO Auto-generated method stub
		initpanel3();
		initpanel4();
	}


	private void initpanel4() {
		// TODO Auto-generated method stub
		this.panel2 = new JPanel();
		this.panel2.setLayout(null);
		this.charIcon.setIcon(imgicon);
		this.charIcon.setBounds(x_position, 200, imgicon.getIconWidth(), imgicon.getIconHeight());
		
		this.panel2.add(charIcon);
		frame.add(panel2, BorderLayout.CENTER);
	}


	private void initpanel3() {
		// TODO Auto-generated method stub
		this.panel1 = new JPanel(new GridLayout(1,3));
		
		JButton btn1 = new JButton("<<");
		btn1.addActionListener(e -> {
			if(x_position>=10) 
				x_position -= 10;
				this.charIcon.setBounds(x_position, 200, imgicon.getIconWidth(), imgicon.getIconHeight());
			});
		
		JButton btn2 = new JButton("HOME");
		btn2.addActionListener(e -> {
			x_position = 100;
			this.charIcon.setBounds(x_position, 200, imgicon.getIconWidth(), imgicon.getIconHeight());
		});
		
		
		JButton btn3 = new JButton(">>");
		btn3.addActionListener(e -> {
			if(x_position<= panel2.getWidth()-imgicon.getIconWidth()) {
				x_position += 10;
				this.charIcon.setBounds(x_position, 200, imgicon.getIconWidth(), imgicon.getIconHeight());
			}
		});
		
		this.panel1.add(btn1);
		this.panel1.add(btn2);
		this.panel1.add(btn3);
		
		frame.add(this.panel1, BorderLayout.NORTH);		
	}


	private void init() {
		// TODO Auto-generated method stub
		initpanel1();
		initpanel2();
	}
	
	private void initpanel2() {
		// TODO Auto-generated method stub
		this.panel2 = new JPanel(cl);
		for(int i = 0; i < colorlist.size() ; i++) {
			JPanel panel = new JPanel();
			panel.setBackground(colorlist.get(i));
			cards.add(panel);
			this.panel2.add(panel,String.valueOf(i)); //i에 해당하는 값을 name으로 줌 
		}
		cl.show(this.panel2, "1");
		frame.add(panel2, BorderLayout.CENTER);
	}


	private void initpanel1() {
		// TODO Auto-generated method stub
		this.panel1 = new JPanel(new GridLayout(1,3));
		
		JButton btn1 = new JButton("<<");
		btn1.addActionListener(e -> cl.previous(panel2));
		
		JButton btn2 = new JButton("HOME");
		btn2.addActionListener(e -> cl.show(panel2, "1"));
		
		JButton btn3 = new JButton(">>");
		btn3.addActionListener(e -> cl.next(panel2));
		
		this.panel1.add(btn1);
		this.panel1.add(btn2);
		this.panel1.add(btn3);
		
		frame.add(this.panel1, BorderLayout.NORTH);
	}


	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
