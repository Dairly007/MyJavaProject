package school.lesson3;


public class Employee
{
	private String name;
	private String position;
	private String email;
	private String phoneNumber;
	private int pay;
	private int age;

	public Employee(String name, String position, String email, String phoneNumber,
	                int pay, int age)
	{
		this.name = name;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.pay = pay;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public String getPosition()
	{
		return position;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPay(int pay)
	{
		if (age > 0)
			this.pay = pay;
		else
			throw new IllegalStateException("Payment can't be less then 0");
	}

	public int getPay()
	{
		return pay;
	}

	public void setAge(int age)
	{
			this.age = age;
	}

	public int getAge()
	{
		if (age>= 18)
			return age;
		if else 
		
		else
			throw new IllegalStateException("Age can't be less then 18");
	}
		
	@Override
	public String toString()
{
	return "Employee{" +
			"name='" + name + '\'' +
			", position='" + position + '\'' +
			", email='" + email + '\'' +
			", phoneNumber='" + phoneNumber + '\'' +
			", pay=" + pay +
			", age=" + age +
			'}';
}
	public static void main(String[] args)
	{
		Employee[] employeeArr = new Employee[5];
		employeeArr[0] = new Employee("Ivan Ivanov Ivanovich", "Engineer",
				"ivanovivan@mail.ru", "911", 500, 18);
		employeeArr[1] = new Employee("Brat Ivanov Ivanovich", "Engineer",
				"brativan@mail.ru", "912", 500, 25);
		employeeArr[2] = new Employee("Nabiev Ranis Renatovich", "Director",
				"Nabiev@mail.ru", "913", 100000, 38);
		employeeArr[3] = new Employee("Nabiullina Miliausha Kamalovna", "Ex-Director",
				"Nabiullina@mail.ru", "914", 10000, 20);
		employeeArr[4] = new Employee("Nesmelov Aleksandr Aleksandrovich", "Builder",
				"Nesmelov@mail.ru", "915", 500, 18);
		employeeArr[4].getAge();
		System.out.println(employeeArr[4].toString());
	}
}
