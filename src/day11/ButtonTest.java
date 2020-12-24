package day11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest extends JFrame{
	public static void main(String[] args) {
		new ButtonTest();
		
	}
	public ButtonTest() {
		super("버트테스트");
		setBounds(300,300,400,400);
		JButton btn1=new JButton("눌러주세요");
		add(btn1);
		btn1.addActionListener(new ActionListener() {//익명클래스열림
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("눌렸어요~~");
				
			}
		});
		setVisible(true);
	}
}
