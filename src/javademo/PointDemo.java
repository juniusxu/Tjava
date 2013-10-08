package javademo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.AbstractTableModel;


public class PointDemo {

	public static void main(String[] args){
		/*new MyRadio();ʵ�ֵ�ѡ*/
		
		/*new MyComboBox();ʵ�������б�*/
		
		/*ʵ�ֲ˵�ѡ��
		 * JFrame f=new JFrame("Hello");
		final JTextArea text=new JTextArea();
		text.setVisible(true);
		f.getContentPane().add(new JScrollPane(text));
		JMenu menuFile=new JMenu("�ļ�");
		
		JMenuBar menuBar=new JMenuBar();
		JMenuItem newItem=new JMenuItem("�½�");
		JMenuItem openItem=new JMenuItem("��");
		JMenuItem closeItem=new JMenuItem("�ر�");
		JMenuItem exitItem=new JMenuItem("�˳�");
		newItem.setMnemonic('N');
		openItem.setMnemonic('O');
		closeItem.setMnemonic('C');
		exitItem.setMnemonic('E');
		newItem.setAccelerator(KeyStroke.getKeyStroke('N',java.awt.Event.CTRL_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke('O',java.awt.Event.CTRL_MASK));
		closeItem.setAccelerator(KeyStroke.getKeyStroke('C',java.awt.Event.ALT_MASK));
		exitItem.setAccelerator(KeyStroke.getKeyStroke('E',java.awt.Event.ALT_MASK));
		menuFile.add(newItem);
		menuFile.add(openItem);
		menuFile.add(closeItem);
		menuFile.addSeparator();//���ӷָ���
		menuFile.add(exitItem);
		menuBar.add(menuFile);
		
		newItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("ѡ����\"�½�\"�˵���\n");
			}
		});
		openItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("ѡ����\"��\"�˵���\n");
			}
		});
		closeItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("ѡ����\"�ر�\"�˵���\n");
			}
		});
		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				text.append("ѡ����\"�˳�\"�˵���\n");
			}
		});
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
		f.setJMenuBar(menuBar);
		f.setVisible(true);
		f.setSize(200,300);*/
		
		
		/*new Note();�򿪻�洢�ļ�*/
		
		/*new TableColumnModel();�����ʾ*/
	}

}
class DefaultTable extends AbstractTableModel{
	private String[] titles={"����","����","�Ա�","��ѧ�ɼ�","Ӣ��ɼ�","�ܷ�","�Ƿ񼰸�"};
	private Object[][] userInfo={{"����",23,"Ů",78,89,167,true},{"��걸�",12,"��",12,21,33,false}};
	public int getColumnCount(){
		return this.titles.length;
	}
	public int getRowCount(){
		return this.userInfo.length;
	}
	public Object getValueAt(int row,int col){
		return this.userInfo[row][col];
	}
	public String getColumnName(int col){
		return this.titles[col];
	}
	
	public Class<?> getColumnClass(int col){
		return this.getValueAt(0, col).getClass();
	}
	public boolean isCellEditable(int row,int col){
		return true;
	}
	public void setValueAt(Object newValue,int row,int col){
		this.userInfo[row][col]=newValue;
	}
}
class TableColumnModel{
	private JFrame f=new JFrame("Welcome To Xhome");
	private JTable table=null;
	private DefaultTable defaultTable=new DefaultTable();
	private JComboBox sexList=new JComboBox();
	public TableColumnModel(){
		this.table=new JTable(this.defaultTable);
		this.sexList.addItem("��");
		this.sexList.addItem("Ů");
		this.table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(this.sexList));
		JScrollPane scr=new JScrollPane(this.table);
		JPanel toolBar=new JPanel();
		this.f.add(toolBar,BorderLayout.NORTH);
		this.f.add(scr,BorderLayout.CENTER);
		this.f.setSize(370,160);
		this.f.setVisible(true);
		this.f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
		
	}
}
class Note implements ActionListener{
	private JTextArea text=new JTextArea(8,10);
	private JFrame f=new JFrame("Welcome To Xhome");
	private JButton open=new JButton("���ļ�");
	private JButton save =new JButton("�洢�ļ�");
	private JLabel label=new JLabel("����û�д򿪵��ļ�");
	private JPanel butPan=new JPanel();
	
	public Note(){
		this.butPan.add(open);
		this.butPan.add(save);
		f.setLayout(new GridLayout(3,3));
		f.add(this.label,BorderLayout.NORTH);
		f.add(this.butPan,BorderLayout.SOUTH);
		f.add(new JScrollPane(this.text),BorderLayout.CENTER);
		this.f.setSize(330,180);
		this.f.setVisible(true);
		this.f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
		this.open.addActionListener(this);
		this.save.addActionListener(this);
		f.setSize(300,200);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		File file=null;
		int result=0;
		JFileChooser fileChooser=new JFileChooser();
		if(e.getSource()==this.open){
			this.text.setText("");
			fileChooser.setApproveButtonText("ȷ��");
			fileChooser.setDialogTitle("���ļ�");
			result=fileChooser.showOpenDialog(this.f);
			if(result==JFileChooser.APPROVE_OPTION){
				file=fileChooser.getSelectedFile();
				this.label.setText("�� ���ļ�������:"+file.getName());
			}else if(result==JFileChooser.CANCEL_OPTION){
				this.label.setText("û�д��κ��ļ�");
			}else{
				this.label.setText("�������ִ���");
			}
			if(file!=null){
			try{
				Scanner scan=new Scanner(new FileInputStream(file));
				scan.useDelimiter("\n");
				while(scan.hasNext()){
					this.text.append(scan.next());
					this.text.append("\n");
				}
				scan.close();
			}catch(Exception ex){
				this.label.setText("�ļ���ȡ����");
			}
		}
		}
		
		if(e.getSource()==this.save){
			result=fileChooser.showSaveDialog(this.f);
			if(result==JFileChooser.APPROVE_OPTION){
				file=fileChooser.getSelectedFile();
				this.label.setText("ѡ��Ĵ洢�ļ�����Ϊ:"+file.getName());
			}else if(result==JFileChooser.CANCEL_OPTION){
				this.label.setText("û��ѡ���κ��ļ�");
			}else{
				this.label.setText("��������");
			}
			if(file!=null){
				try{
					PrintStream out = new PrintStream(new FileOutputStream(file));
					out.print(this.text.getText());
					out.close();
				}catch(Exception ex){
					this.label.setText("�ļ�����ʧ��");
				}
			}
		}
	}
}
class MyRadio{
	private JFrame f=new JFrame("Welcome To Xhome");
	private Container cont=f.getContentPane();
	private JRadioButton jrb1=new JRadioButton("ѡ��һ");
	private JRadioButton jrb2=new JRadioButton("ѡ���");
	private JRadioButton jrb3=new JRadioButton("ѡ����");
	private JPanel pan=new JPanel();
	private ButtonGroup group=new ButtonGroup();
	public MyRadio(){
		pan.setBorder(BorderFactory.createTitledBorder("��ѡ��"));
		pan.setLayout(new GridLayout(1,3));
		pan.add(jrb1);
		pan.add(jrb2);
		pan.add(jrb3);
		group.add(jrb1);
		group.add(jrb2);
		group.add(jrb3);
		cont.add(pan);
		this.f.setSize(330,180);
		this.f.setVisible(true);
		this.f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
	}
}
class MyComboBox{
	private JFrame f=new JFrame("Welcome To Xhome");
	private Container cont=f.getContentPane();
	private JComboBox jcb1=null;
	private JComboBox jcb2=null;
	public MyComboBox(){
		this.f.setLayout(new GridLayout(2,2));
		String nations[]={"�й�","����","ӡ��","����˹","�Ű�","����"};
		Vector<String> v=new Vector<String>();
		v.add("x");
		v.add("j");
		v.add("c");
		this.jcb1=new JComboBox(nations);
		this.jcb2=new JComboBox(v);
		jcb1.setBorder(BorderFactory.createTitledBorder("��ϲ��ȥ�ĸ����ң�"));
		jcb2.setBorder(BorderFactory.createTitledBorder("ѡһ��Ӵ"));
		jcb1.setMaximumRowCount(30);
		jcb2.setMaximumRowCount(3);
		cont.add(this.jcb1);
		cont.add(this.jcb2);
		cont.add(new JLabel("�����б��"));
		jcb1.setSelectedIndex(0);
		this.f.setSize(300,150);
		this.f.setVisible(true);
		this.f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				System.exit(1);
			}
		});
	}
}
