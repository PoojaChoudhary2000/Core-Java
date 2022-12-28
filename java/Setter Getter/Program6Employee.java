public class Program6Employee{
public static void main(String [] args){

Employee e = new Employee();

e.setEmployeeName("pooja ");
e.setEmployeeID(123456);
e.setSalary(43000);
e.setEmployeeAddress("abc");

String en = e.getEmployeeName();
int eID = e.getEmployeeID();
int s = e.getSalary();
String ea = e.getEmployeeAddress();

System.out.println("EmployeeName : "+en);
System.out.println("EmployeeID : "+eID);
System.out.println("Salary"+s);
System.out.println("EmployeeAddress : "+ea);
}
}
