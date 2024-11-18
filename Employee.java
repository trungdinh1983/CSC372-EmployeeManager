public class Employee {
  protected String firstName;
  protected String lastName;
  protected int employeeID;
  protected double salary;

  public Employee() {
    this.salary = 0;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public void employeeSummary() {
    System.out.println("Name: " + firstName + " " + lastName);
    System.out.println("Employee ID: " + employeeID);
    System.out.println("Salary: $" + salary);
  }
}