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
		super("��Ʈ�׽�Ʈ");
		setBounds(300,300,400,400);
		JButton btn1=new JButton("�����ּ���");
		add(btn1);
		btn1.addActionListener(new ActionListener() {//�͸�Ŭ��������
			
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println("���Ⱦ��~~");
				
			}
		});
		setVisible(true);
	}
}
