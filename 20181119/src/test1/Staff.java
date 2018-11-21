package test1;

public class Staff {
	private String no;
	private String name;
	private char sex;
	private String Email;
	private String phone;
	private String QQ;
	
	public Staff() {
		super();
		
	}

	public Staff(String no, String name, char sex, String email, String phone,
			String qQ) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		Email = email;
		this.phone = phone;
		QQ = qQ;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQQ() {
		return QQ;
	}

	public void setQQ(String qQ) {
		QQ = qQ;
	}

	@Override
	public String toString() {
		return "员工工号" + no + ", 姓名" + name + ", 性别" + sex
				+ ", Email" + Email + ", 电话" + phone + ", QQ" + QQ;
	}
}
