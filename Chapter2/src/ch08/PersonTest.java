package ch08;

public class PersonTest {

	public static void main(String[] args) {
			
		Person person = new Person();
		person.height = 180;
		person.weight = 78;
		person.sex = "³²¼º";
		person.name = "Tomas";
		person.age = 37;
		
		System.out.println(person.PersonInfo());
	}

}
