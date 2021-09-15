package member;

public class MemberVoEnv {
	private int num;
	private int gender;
	private int age;
	private int house;
	private int school;
	private int marry;
	
	public MemberVoEnv() {}

	public MemberVoEnv(int num, int gender, int age, int house, int school, int marry) {
		super();
		this.num = num;
		this.gender = gender;
		this.age = age;
		this.house = house;
		this.school = school;
		this.marry = marry;
	}
	
	public MemberVoEnv(int gender, int age, int house, int school, int marry) {
		super();
		this.gender = gender;
		this.age = age;
		this.house = house;
		this.school = school;
		this.marry = marry;
	}
	public MemberVoEnv(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public int getSchool() {
		return school;
	}

	public void setSchool(int school) {
		this.school = school;
	}

	public int getMarry() {
		return marry;
	}

	public void setMarry(int marry) {
		this.marry = marry;
	}

	@Override
	public String toString() {
		return "MemberVoEnv [num=" + num + ", gender=" + gender + ", age=" + age + ", house=" + house + ", school="
				+ school + ", marry=" + marry + "]";
	}
	
	
}
