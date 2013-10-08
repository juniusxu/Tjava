package javademo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login {

	public static void main(String[] args){
		new ActionHandle();
	}
}
class ActionHandle{
	private JFrame f=new JFrame("Welcome To Xhome");
	private JButton submit=new JButton("��¼");
	private JButton reset=new JButton("����");
	private JTextField nameText=new JTextField();
	private JPasswordField passText=new JPasswordField();
	private JLabel nameLab=new JLabel("�û�����");
	private JLabel passLab=new JLabel("��    �룺");
	private JLabel infoLab=new JLabel("�û���¼ϵͳ");
	
	
	public ActionHandle(){
		Font font=new Font("����",Font.ITALIC+Font.BOLD,12);
		infoLab.setFont(font);
		
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(arg0.getSource()==submit){
					String tname=nameText.getText();
					String tpass=new String(passText.getPassword());
					LoginCheck log=new LoginCheck(tname,tpass);
					if(log.validate()){
						infoLab.setText("��¼�ɹ�");
					}else{
						infoLab.setText("��¼ʧ�ܣ�������û���������");
						infoLab.setForeground(Color.RED);
					}
				}
				
			}
		});
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(arg0.getSource()==reset){
					nameText.setText("");
					passText.setText("");
					infoLab.setText("�û���¼ϵͳ");
				}
			}
		});
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
		f.setLayout(null);
		nameLab.setBounds(5,5,60,20);
		passLab.setBounds(5,30,60,20);
		infoLab.setBounds(5,65,220,30);
		nameText.setBounds(65,5,100,20);
		passText.setBounds(65,30,100,20);
		submit.setBounds(165,5,60,20);
		reset.setBounds(165,30,60,20);
		
		f.add(nameLab);
		f.add(passLab);
		f.add(infoLab);
		f.add(nameLab);
		f.add(nameText);
		f.add(passText);
		f.add(submit);
		f.add(reset);
		f.setSize(280,130);
		f.setVisible(true);
	}
	
}
class LoginCheck{
	private String name;
	private String pass;
	public LoginCheck(String n,String p){
		this.name=n;
		this.pass=p;
	}
	public boolean validate(){
		if("xj".equals(name)&&"123".equals(pass)){
			return true;
		}else{
			return false;
		}
	}

}
