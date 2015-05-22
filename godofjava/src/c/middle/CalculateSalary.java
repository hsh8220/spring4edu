package c.middle;

public class CalculateSalary {

	public static void main(String[] args) {
		CalculateSalary sample = new CalculateSalary();
		sample.calculateSalaries();
	}

	public long getSalaryIncrease(Employee employee) {
		
		long result = 0;
		long salary = 0;
		int type = 0;
		
		type = employee.getType();
		salary = employee.getSalary();
		
		switch (type) {
		case 1:
			result = (long)(salary * 0.05);
			break;
		case 2:
			result = (long)(salary * 1.1);
			break;
		case 3:
			result = (long)(salary * 1.2);
			break;
		case 4:
			result = (long)(salary * 1.3);
			break;
		case 5:
			result = (long)(salary * 2);
			break;
		}
		
		return result;
	}
	
	public void calculateSalaries() {
		
		Employee [] employee = new Employee [5];
		
		employee[0] = new Employee ("LeeDaeRi", 1, 1000000000);
		employee[1] = new Employee ("KimManager", 2, 100000000);
		employee[2] = new Employee ("WhangDesign", 3, 70000000);
		employee[3]	= new Employee ("ParkArchi", 4, 80000000);
		employee[4] = new Employee ("LeeDevelop", 5, 60000000);
		
		for (Employee empl : employee) {
			System.out.println(empl.getName()+"="+getSalaryIncrease(empl));
		}
		
	}
}
