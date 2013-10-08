package javademo;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Computer.plugin(new Flash());
		Computer.plugin(new Print());
	}
	

}
interface USB{
	public void start();
	public void stop();
};
class Computer{
	public static void plugin(USB usb){
		usb.start();
		System.out.println("-----------USB�豸����------------");
		usb.stop();
	}
};
class Flash implements USB{
	public void start(){
		System.out.println("U�̿�ʼ����");
	}
	public void stop(){
		System.out.println("U��ֹͣ����");
	}
};
class Print implements USB{
	public void start(){
		System.out.println("��ӡ����ʼ����");
	}
	public void stop(){
		System.out.println("��ӡ��ֹ����");
	}
};