package 高校人员信息;

public class CGradOnWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义类型变量
		CPeople a=new CPeople();
		CStudent b=new CStudent();
		CTeacher c=new CTeacher();
		CGraduate d=new CGraduate();
		//变量对函数的调用
		a.get();
		b.get();
		c.get();
		d.get();
		a.show();
		b.show();
		c.show();
		d.show();

	}
}