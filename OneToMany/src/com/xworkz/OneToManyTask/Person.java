package com.xworkz.OneToManyTask;

public class Person {

	public String name;
	public Email[] email;
	public Job job;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void setEmail(Email[] email) {
		this.email = email;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.job);
		if(email!=null) {
			for(int i=0;i<email.length;i++) {
				Email element=this.email[i];
				System.out.println(element);
				if(element!=null) {
					element.showOff();
				}
				else {
					System.out.println("element is null");
				}
			}
		}
	}

}
