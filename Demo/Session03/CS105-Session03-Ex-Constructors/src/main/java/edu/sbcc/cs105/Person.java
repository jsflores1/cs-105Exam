package edu.sbcc.cs105;

public class Person {

private String lastName;
private String firstName;
private int age;

public Person() throws Exception{
	this("", "", 0);
}

public Person(String firstName, String lastName) {
   this.setFirstName(firstName);
   this.setLastName(lastName);
}

public Person(String firstName, String lastName, int age) throws Exception {
	this(firstName,lastName);
	setAge(age);

}

private void setAge(int age) throws Exception {

	if (age < 0){
		throw new Exception("Age must be at least zero");
	}
	
	this.age = age;
}

public int getAge(){
	return age;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {

   this.lastName = lastName;

}

public String getFirstName() {
   return firstName;
}

public void setFirstName(String firstName) {
   this.firstName = firstName;
}
}