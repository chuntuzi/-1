package ��У��Ա��Ϣ;
import java.util.Scanner;
public class CTeacher extends CPeople{
	Scanner sc=new Scanner(System.in);
	void identifier(String name,String sex,int age){}
	protected String job;
	protected String dept;
	protected int workhour;
	public void get(){
		System.out.println("�������ʦ���������Ա����䣬ְλ�����ţ�����ʱ�䣺");
		name=sc.next();
		sex=sc.next();
		age=sc.nextInt();
		job=sc.next();
		dept=sc.next();
		workhour=sc.nextInt();
	}
	public void show(){
		System.out.println("��ʦ�������ǣ�"+name);
		System.out.println("��ʦ���Ա��ǣ�"+sex);
		System.out.println("��ʦ�������ǣ�"+age);
		System.out.println("��ʦ��ְλ�ǣ�"+job);
		System.out.println("��ʦ�Ĳ����ǣ�"+dept);
		System.out.println("��ʦ�Ĺ���ʱ���ǣ�"+workhour);
	}
}