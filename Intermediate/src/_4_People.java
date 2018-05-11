import java.util.ArrayList;

public class _4_People {

	public static void main(String[] args) {
		_4_Person p1 = new _4_Person("p1", 19, "job1");
		_4_Person p2 = new _4_Person("Name1", 22, "Job Title 1");
		_4_Person p3 = new _4_Person("Name2", 44, "Job Title 2");

		ArrayList<_4_Person> people = new ArrayList<_4_Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);

		for (_4_Person temp : people) {
			System.out.println(temp);
		}

	}

}
