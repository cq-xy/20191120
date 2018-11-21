package test1;

import java.util.Scanner;

public class Client {
	private static Manager a = new Manager();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\t\t**************************");
		System.out.println("\t\t**\t员工档案系统\t**");
		System.out.println("\t\t**************************");
		System.out.println();
		System.out.println("1.显示所有员工信息（分页）");
		System.out.println("2.添加员工 ");
		System.out.println("3.根据工号查询员工信息");
		System.out.println("4.统计男和女的人数分别是多少");
		System.out.println("5.根据工号删除信息");
		System.out.println("6.退出");
		System.out.println();
		while(true){
			System.out.println("请选择");
			int num = input.nextInt();
			switch(num){
				case	1:
					fenye();
					break;
				case	2:
					add();
					break;
				case	3:
					gonghao();
					break;
				case	4:
					chaxun();
					break;
				case	5:
					shanchu();
					break;
				default:
					System.out.println("谢谢使用！再见！");
					System.exit(0);
			}
		}

	}
	private static void fenye(){
		System.out.println("请输入页数");
		int no = input.nextInt();
		Staff[] s = a.fenye(no);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}
	private static void add(){
		System.out.println("请输入工号");
		String no = input.next();
		Staff s = a.star(no);
		if(s != null){
			System.out.println("工号重复");
			return;
		}
		System.out.println("请输入姓名");
		String name = input.next();
		System.out.println("请输入性别");
		char sex = input.next().charAt(0);
		System.out.println("请输入Email");
		String email = input.next();
		System.out.println("请输入电话");
		String phone = input.next();
		System.out.println("请输入QQ");
		String qq = input.next();
		Staff f = new Staff(no, name, sex, email, phone, qq);
		boolean b = a.add(f);
		System.out.println(b ? "添加成功" : "添加失败");
	}
	private static void gonghao(){
		System.out.println("请输入工号");
		String no = input.next();
		Staff s = a.star(no);
		if(s == null){
			System.out.println("没有此人");
		}else{
			System.out.println(s.toString());
		}
	}
	private static void chaxun(){
		String s = a.nannv();
		System.out.println(s);
	}
	private static void shanchu(){
		System.out.println("请输入要删除的员工的工号");
		String no = input.next();
		boolean f = a.shanchu(no);
		System.out.println(f ? "删除成功" : "删除失败");
	}

}
