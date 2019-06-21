package 高校人员信息;

import java.util.Scanner;
public class CPeople{
	Scanner sc=new Scanner(System.in);
	protected String name;
	protected String sex;
	protected int age;
	public void get(){
		System.out.println("请输入人员的姓名，性别，年龄：");
		name=sc.next();
		sex=sc.next();
		age=sc.nextInt();
	}
	public void show(){
		System.out.println("人员的姓名是："+name);
		System.out.println("人员的性别是："+sex);
		System.out.println("人员的年龄是："+age);
	}
}
