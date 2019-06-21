package 高校人员信息;

import java.util.Scanner;
public class CStudent extends CPeople {
	Scanner sc=new Scanner(System.in);
	void identifier(String name,String sex,int age){}
	//identifier是标识符，声明变量名，一般以字母或下划线开头，包含字母、数字、下划线
	protected int num;//受保护类型变量学号
	protected String enrolldate;//受保护类型变量入学时间
	protected int grade;//受保护类型变量入学成绩
	public CStudent(){}
	public void get(){
		System.out.println("请输入学生的姓名，性别，年龄，学号，入学时间，入学成绩：");
		name=sc.next();
		sex=sc.next();
		age=sc.nextInt();
		num=sc.nextInt();
		enrolldate=sc.next();
		grade=sc.nextInt();
	}
	public void show(){
		System.out.println("学生的姓名是："+name);
		System.out.println("学生的性别是："+sex);
		System.out.println("学生的年龄是："+age);
		System.out.println("学生的学号是："+num);
		System.out.println("学生的入学时间是："+enrolldate);
		System.out.println("学生的入学成绩是："+grade);
	}
}