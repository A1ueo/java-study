package homework.homework09.model.vo;

public class Student {
	private final int stdNum;
	private String name;
	private String className;
	private static int stdCount = 1;

	public Student() {
		stdNum = stdCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getStdNum() {
		return stdNum;
	}

}
