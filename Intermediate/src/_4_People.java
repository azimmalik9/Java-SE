import java.util.ArrayList;

public class _4_People {

	public static void main(String[] args) {
		Person p1 = new Person("p1", 19, "job1");
		Person p2 = new Person("Name1", 22, "Job Title 1");
		Person p3 = new Person("Name2", 44, "Job Title 2");

		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		for (Person temp : people) {
			System.out.println(temp);
		}

	}

}
