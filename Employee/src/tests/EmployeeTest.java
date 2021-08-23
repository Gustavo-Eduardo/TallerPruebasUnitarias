package tests;

import org.junit.Test;

import junit.framework.TestCase;
import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest extends TestCase {
	
	private Employee employee;
	

	@Test
	public void testWorkerCS() {
		employee = new Employee(360.0F , "USD", 0.05F, EmployeeType.Worker);
		float cs = employee.cs();		
		assertEquals(360.0F, cs);
	}	
	
	@Test
	public void testWorkerYearBonus() {
		employee = new Employee(360.0F , "USD", 0.05F, EmployeeType.Worker);
		float yearBonus = employee.CalculateYearBonus();
		assertEquals(386.0F, yearBonus);
	}
	
	@Test
	public void testNotUSDCurrency() {
		employee = new Employee(360.0F , "EUR", 0.05F, EmployeeType.Worker);
		float cs = employee.cs();
		assertEquals(342.0F, cs);
	}
	@Test
	public void testSupervisorYearBonus() {
        final float salario = 500;
        final float expectedValue = salario + 386/2;
		employee = new Employee(salario , "USD", 0.05F, EmployeeType.Worker);
		float yearBonus = employee.CalculateYearBonus();
		assertEquals(expectedValue, yearBonus);
	}
	@Test
	public void testManagerYearBonus() {
        final float salario = 800;
        final float expectedValue = salario + 386;
		employee = new Employee(salario , "USD", 0.05F, EmployeeType.Worker);
		float yearBonus = employee.CalculateYearBonus();
		assertEquals(expectedValue, yearBonus);
	}
	

}
