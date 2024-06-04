package practice;
	import java.util.*;

	public class Employee {
	    String name;
	    int rank;
	    int score;

	    public Employee(String name, int rank, int score) {
	        this.name = name;
	        this.rank = rank;
	        this.score = score;
	    }

	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("A", 2, 300));
	        employees.add(new Employee("C", 1, 500));
	        employees.add(new Employee("D", 1, 450));
	        employees.add(new Employee("M", 7, 200));

	        Map<Integer, Employee> rankToEmployee = new HashMap<>();

	        for (Employee emp : employees) {
	            if (!rankToEmployee.containsKey(emp.rank) || 
	                rankToEmployee.get(emp.rank).score < emp.score) {
	                rankToEmployee.put(emp.rank, emp);
	            }
	        }

	        System.out.println("Name based on Rank and highest Score:");

	        for (int i = 1; i <= Collections.max(rankToEmployee.keySet()); i++) {
	            if (rankToEmployee.containsKey(i)) {
	                System.out.println("Rank " + i + ": " + rankToEmployee.get(i).name);
	                break;
	            }
	        }
	    }
	
}
