package javademo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowEventHandle implements WindowListener {


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowOpened-->���ڱ���");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowClosing-->���ڹر�");
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowClosed-->���ڱ��ر�");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowIconified->������С��");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowDeiconfied->���ڴ���С���ָ�");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowActivated->���ڱ�ѡ��");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("windowDeactivated->ȡ������ѡ��");
	}

}
