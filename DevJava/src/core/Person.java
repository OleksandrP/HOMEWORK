package core;
// DTO Data transfer object
public class Person {

	int age;

	String name;

	Person(int age, String name){
		//Person p = this;
		this.age = age;
		this.name = name;
	}
	void run(){
		System.out.println(name+": go-go-go!!!"); // this.name
	}
	
	
	
}
