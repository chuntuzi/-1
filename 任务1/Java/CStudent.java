package ��У��Ա��Ϣ;

import java.util.Scanner;
public class CStudent extends CPeople {
	Scanner sc=new Scanner(System.in);
	void identifier(String name,String sex,int age){}
	//identifier�Ǳ�ʶ����������������һ������ĸ���»��߿�ͷ��������ĸ�����֡��»���
	protected int num;//�ܱ������ͱ���ѧ��
	protected String enrolldate;//�ܱ������ͱ�����ѧʱ��
	protected int grade;//�ܱ������ͱ�����ѧ�ɼ�
	public CStudent(){}
	public void get(){
		System.out.println("������ѧ�����������Ա����䣬ѧ�ţ���ѧʱ�䣬��ѧ�ɼ���");
		name=sc.next();
		sex=sc.next();
		age=sc.nextInt();
		num=sc.nextInt();
		enrolldate=sc.next();
		grade=sc.nextInt();
	}
	public void show(){
		System.out.println("ѧ���������ǣ�"+name);
		System.out.println("ѧ�����Ա��ǣ�"+sex);
		System.out.println("ѧ���������ǣ�"+age);
		System.out.println("ѧ����ѧ���ǣ�"+num);
		System.out.println("ѧ������ѧʱ���ǣ�"+enrolldate);
		System.out.println("ѧ������ѧ�ɼ��ǣ�"+grade);
	}
}