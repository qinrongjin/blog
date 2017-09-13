package cn.tiny77.dpi.test;

public class TestBean {

	private String name;
	
	private String greet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	@Override
	public String toString() {
		return "TestBean [name=" + name + ", greet=" + greet + "]";
	}
	
}
