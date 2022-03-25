package school.lesson12;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleInstTest
{

	@Before
	public void setUp(){}

	@After
	public void tearDown(){}

	@Test
	public void randomize()
	{
		var triangle1 = new TriangleInst(66,67,2);
		Assertions.assertEquals(57, triangle1.randomize(triangle1));
	}


	@Test
	void main()
	{

		TriangleInst triangle1 = new TriangleInst(1,2,3);
		TriangleInst triangle2 = new TriangleInst(1,2,3);

	}
}