public class EmployeeTest {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setFirstName("John");
    employee.setLastName("Doe");
    employee.setEmployeeID(1001);
    employee.employeeSummary();

    System.out.println();

    Manager manager = new Manager();
    manager.setFirstName("Jane");
    manager.setLastName("Smith");
    manager.setEmployeeID(1002);
    manager.setDepartment("Engineering");
    manager.employeeSummary();
  }
}