package ch08;

public class Person {
	public int height;
	public int weight;
	public String sex;
	public String name;
	public int age;
	
	public Person() {
		
	}
	
	public String PersonInfo() {
		return "키가 " + height + "이고, 몸무게가 " + weight + "킬로인 " + sex + "이 있습니다. 이름은" + name + " 이고 나이는 " + age + "세입니다." ; 
	}
}
