package dao;

import javax.swing.*;

import model.*;

import java.awt.*;
public class NewUser extends JFrame{
    private JPanel contentPane;//�ײ����
    private JPasswordField firstMimaField;//��һ�����������
    private JLabel secondMimaLabel;//�ڶ�����������ı�ǩ
    private JPasswordField SecondMimaField;//�ڶ�����������
    private JLabel infoJLabel;// ��ʾ�ڶ������������Ƿ���ȷ
    private JButton cancelButton;//ȡ����ť
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
                try {
					NewUser frame = new NewUser();
					frame.setVisible(true);
				} catch (Exception e) {
				}				
			}
		});
   
    
    }
public NewUser() {
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(700,300,450,300);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(248,248,255));
	
}

}
