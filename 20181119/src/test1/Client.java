package test1;

import java.util.Scanner;

public class Client {
	private static Manager a = new Manager();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\t\t**************************");
		System.out.println("\t\t**\tԱ������ϵͳ\t**");
		System.out.println("\t\t**************************");
		System.out.println();
		System.out.println("1.��ʾ����Ա����Ϣ����ҳ��");
		System.out.println("2.���Ա�� ");
		System.out.println("3.���ݹ��Ų�ѯԱ����Ϣ");
		System.out.println("4.ͳ���к�Ů�������ֱ��Ƕ���");
		System.out.println("5.���ݹ���ɾ����Ϣ");
		System.out.println("6.�˳�");
		System.out.println();
		while(true){
			System.out.println("��ѡ��");
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
					System.out.println("ллʹ�ã��ټ���");
					System.exit(0);
			}
		}

	}
	private static void fenye(){
		System.out.println("������ҳ��");
		int no = input.nextInt();
		Staff[] s = a.fenye(no);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}
	private static void add(){
		System.out.println("�����빤��");
		String no = input.next();
		Staff s = a.star(no);
		if(s != null){
			System.out.println("�����ظ�");
			return;
		}
		System.out.println("����������");
		String name = input.next();
		System.out.println("�������Ա�");
		char sex = input.next().charAt(0);
		System.out.println("������Email");
		String email = input.next();
		System.out.println("������绰");
		String phone = input.next();
		System.out.println("������QQ");
		String qq = input.next();
		Staff f = new Staff(no, name, sex, email, phone, qq);
		boolean b = a.add(f);
		System.out.println(b ? "��ӳɹ�" : "���ʧ��");
	}
	private static void gonghao(){
		System.out.println("�����빤��");
		String no = input.next();
		Staff s = a.star(no);
		if(s == null){
			System.out.println("û�д���");
		}else{
			System.out.println(s.toString());
		}
	}
	private static void chaxun(){
		String s = a.nannv();
		System.out.println(s);
	}
	private static void shanchu(){
		System.out.println("������Ҫɾ����Ա���Ĺ���");
		String no = input.next();
		boolean f = a.shanchu(no);
		System.out.println(f ? "ɾ���ɹ�" : "ɾ��ʧ��");
	}

}
