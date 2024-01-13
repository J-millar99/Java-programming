import java.util.HashSet;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + "(" + age + "세)";
	}

	public int hashCode() {
		return name.hashCode() + age;
	}

	public boolean equals(Object obj) {
		String n = ((Person)obj).name; 
		int a = ((Person)obj).age; 

		if (n.equals(name) && a == age)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		HashSet<Person> _hashSet = new HashSet<>();
		_hashSet.add(new Person("001", 1));
		_hashSet.add(new Person("002", 2));
		_hashSet.add(new Person("003", 3));
		_hashSet.add(new Person("004", 4));
		_hashSet.add(new Person("005", 5));
		for (Person per : _hashSet)
			System.out.println(per.toString() + '\t');
	}
}