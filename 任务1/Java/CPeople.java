package ��У��Ա��Ϣ;

import java.util.Scanner;
public class CPeople{
	Scanner sc=new Scanner(System.in);
	protected String name;
	protected String sex;
	protected int age;
	public void get(){
		System.out.println("��������Ա���������Ա����䣺");
		name=sc.next();
		sex=sc.next();
		age=sc.nextInt();
	}
	public void show(){
		System.out.println("��Ա�������ǣ�"+name);
		System.out.println("��Ա���Ա��ǣ�"+sex);
		System.out.println("��Ա�������ǣ�"+age);
	}
}
