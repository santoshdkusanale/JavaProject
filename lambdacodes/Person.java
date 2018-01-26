public class Person{

  public enum Sex{
  	MALE,FEMALE
  }
  
  String name;
  int age;
  
  Person(name,age,Sex){
  	this.name = name;
    this.age = age;
    this.Sex = Sex;
  }
  public int getAge(){
	return this.age;
  }
  
  public void printPerson(){
  	System.out.println("Person matching this criteria:"+this.name+" with age:"+this.age);
    
  }

}