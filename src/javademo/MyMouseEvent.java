package javademo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyMouseEvent {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		new MyMouseHandle();
	}

}
class MyMouseHandle extends JFrame implements MouseListener{
	private JTextArea text=new JTextArea();
	public MyMouseHandle(){
		super.setTitle("Welcome To Xhome");
		JScrollPane scr=new JScrollPane(text);//���������
		scr.setBounds(5,5,300,200);
		super.add(scr);
		text.addMouseListener(this);
		super.setSize(310,210);
		super.setVisible(true);
		super.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
	}
	public void mouseClicked(MouseEvent e){
		int c=e.getButton();
		String mouseInfo=null;
		if(c==MouseEvent.BUTTON1){
			mouseInfo="���";
		}else if(c==MouseEvent.BUTTON3){
			mouseInfo="�Ҽ�";
		}else{
			mouseInfo="����";
		}
		text.append("��굥��:"+mouseInfo+"\n.");
	}
	public void mouseEntered(MouseEvent e){
		text.append("���������\n");
	}
	public void mouseExited(MouseEvent e){
		text.append("����뿪���\n");
	}
	public void mousePressed(MouseEvent e){
		text.append("��갴��\n");
	}
	public void mouseReleased(MouseEvent e){
		text.append("����ɿ�\n");
	}
}