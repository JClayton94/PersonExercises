package exercises;

public class Person {

	String name;
	
	int age;
	
	String jobTitle;
	
	public String allVars() {
		
		return "Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle;
	}
	
	//Constructor
	public Person(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}
