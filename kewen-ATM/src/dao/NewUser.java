package dao;

import javax.swing.*;

import model.*;

import java.awt.*;
public class NewUser extends JFrame{
    private JPanel contentPane;//底层面板
    private JPasswordField firstMimaField;//第一次输入的密码
    private JLabel secondMimaLabel;//第二次输入密码的标签
    private JPasswordField SecondMimaField;//第二次输入密码
    private JLabel infoJLabel;// 提示第二次密码输入是否正确
    private JButton cancelButton;//取消按钮
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
