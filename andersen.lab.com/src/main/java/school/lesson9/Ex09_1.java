package school.lesson9;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex09_1
{
	public static void main(String[] args)
	{
		Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
		Stream<String> a = collection.stream();
		System.out.println(collection.stream().filter("a1"::equals).count());
		System.out.println(collection.stream().findFirst().orElse("0"));
		System.out.println(collection.stream().skip(collection.size() - 1).findAny().orElse("Empty"));
		System.out.println(collection.stream().filter("a3"::equals).findAny().get());
		System.out.println(collection.stream().skip(2).findFirst().get());
		System.out.println(Arrays.toString(collection.stream().skip(1).limit(2).toArray()));
		System.out.println(collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList()));
		Collection<People> peoples = Arrays.asList(
				new People("Вася", 16, Sex.MAN),
				new People("Петя", 23, Sex.MAN),
				new People("Елена", 42, Sex.WOMEN),
				new People("Иван Иванович", 69, Sex.MAN));
		System.out.println(peoples.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
				&& p.getSex() == Sex.MAN).collect(Collectors.toList()));
		System.out.println(peoples.stream().filter((p) -> p.getSex() == Sex.MAN).
				mapToInt(People::getAge).average().getAsDouble());
		System.out.println(peoples.stream().filter((p) -> p.getAge() >= 18).filter(
				(p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55)
						|| (p.getSex() == Sex.MAN && p.getAge() < 60)).count());
	}

	private enum Sex
	{
		MAN,
		WOMEN
	}

	private static class People
	{
		private final String name;
		private final Integer age;
		private final Sex sex;

		public People(String name, Integer age, Sex sex)
		{
			this.name = name;
			this.age = age;
			this.sex = sex;
		}

		public String getName()
		{
			return name;
		}

		public Integer getAge()
		{
			return age;
		}

		public Sex getSex()
		{
			return sex;
		}

		@Override
		public String toString()
		{
			return "{" +
					"name='" + name + '\'' +
					", age=" + age +
					", sex=" + sex +
					'}';
		}
	}
}
