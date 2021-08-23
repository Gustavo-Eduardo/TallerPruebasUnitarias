package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
    @Test
    public void test2()
    {
        Employee e = new Employee(450,"EUR",10,EmployeeType.Worker);
        final float paga = e.cs();
        assertTrue(450== paga);
    }

    

}
