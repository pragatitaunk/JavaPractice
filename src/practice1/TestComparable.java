package practice1;

public class TestComparable implements Comparable<TestComparable>{

	private int age;
	private String name;
	public TestComparable(int age,String name){
		this.setAge(age);
		this.setName(name);
	}
	
	@Override
	public int compareTo(TestComparable t) {
		if(getAge()==t.getAge()){
			return 0;
		}
		else if(getAge()>t.getAge()){
			return 1;
		}
		else
		return -1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
