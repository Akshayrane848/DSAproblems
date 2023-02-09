package collection;

public class Main {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		
		em.setName("Akshay");
		em.setSalary(3498.00);
		em.setAddress(new Address(12, "mh"));
		
		
		System.out.println(em);
			
		
	}

}
