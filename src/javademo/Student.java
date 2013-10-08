package javademo;

public class Student {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Stu s=new Stu("09261123","xuj",98.9f,89,99); 
		System.out.println("ѧ��:"+s.getNum());
		System.out.println("����:"+s.getName());
		System.out.println("��ѧ����:"+s.getMath());
		System.out.println("Ӣ�����:"+s.getEnglish());
		System.out.println("���������:"+s.getComputer());
		System.out.println("�ܷ���:"+s.getSum());
		System.out.println("ƽ����:"+s.getAvg());
		System.out.println("��߷�:"+s.getMax());
		System.out.println("��ͷ�:"+s.getMin());
		
		String str1="hello";
		char c[]=str1.toCharArray();
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+"\t");
		System.out.println();
		String str2=new String(c);
		String str3=new String(c,0,4);
		System.out.println(str2+"\n"+str3);
		System.out.println(str1.charAt(3));
	}

}
class Stu{
	private String num;
	private String name;
	private float math;
	private float english;
	private float computer;
	
	public Stu(){}
	public Stu(String num,String name,float math,float english,float computer){
		this.setNum(num);
		this.setName(name);
		this.setMath(math);
		this.setEnglish(english);
		this.setComputer(computer);
	}
	public void setNum(String n){
		num=n;
	}
	public void setName(String n){
		name=n;
	}
	public void setMath(float m){
		math=m;
	}
	public void setEnglish(float e){
		english=e;
	}
	public void setComputer(float c){
		computer=c;
	}
	public String getNum(){
		return num;
	}
	public String getName(){
		return name;
	}
	public float getMath(){
		return math;
	}
	public float getEnglish(){
		return english;
	}
	public float getComputer(){
		return computer;
	}
	public float getSum(){
		return math+english+computer;
	}
	public float getAvg(){
		return this.getSum()/3;
	}
	public float getMin(){
		float min=math;
		min=min<english?min:english;
		min=min<computer?min:computer;
		return min;
	}
	public float getMax(){
		float max=math;
		max=max>english?max:english;
		max=max>computer?max:computer;
		return max;
	}
}