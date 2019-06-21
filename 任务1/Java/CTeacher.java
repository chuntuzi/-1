package 高校人员信息;
import java.util.Scanner;
public class CTeacher extends CPeople{
	Scanner sc=new Scanner(System.in);
	void identifier(String name,String sex,int age){}
	protected String job;
	protected String dept;
	protected int workhour;
	public void get(){
		System.out.println("请输入教师的姓名，性别，年龄，职位，部门，工作时间：");
		name=sc.next();
		sex=sc.next();
		age=sc.nextInt();
		job=sc.next();
		dept=sc.next();
		workhour=sc.nextInt();
	}
	public void show(){
		System.out.println("教师的姓名是："+name);
		System.out.println("教师的性别是："+sex);
		System.out.println("教师的年龄是："+age);
		System.out.println("教师的职位是："+job);
		System.out.println("教师的部门是："+dept);
		System.out.println("教师的工作时间是："+workhour);
	}
}