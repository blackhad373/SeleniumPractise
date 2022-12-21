package oops;

public class Employee {
	int empid;
	String empname;
	int salary;
	int deptno;
 void display()                            
 {
	 System.out.println(empid);
	 System.out.println(empname);
	 System.out.println(salary);
	 System.out.println(deptno);
	 
 }
 
 /* Employee(int id,String name,int sal,int dno)                   
{
	 empid=id;
	 empname=name;
	 salary=sal;
	 deptno=dno;
 } */
 
 void setdata(int id,String name,int sal,int dno)
 {
	 empid=id;
	 empname=name;
	 salary=sal;
	 deptno=dno;
 }
 public static void main(String args[]) {
	//Assigning values to class variables using object--First method
	 /* Employee emp1=new Employee();
	 emp1.empid=101;
	 emp1.empname="Kavein";
	 emp1.salary=10000;
	 emp1.deptno=10;
	 emp1.display(); */
	 
/*	 //Assigning values to class variable using constructor
	 Employee emp1=new Employee(101,"RAJ",200000,12);
	 emp1.display();
	*/
	 
	 //Assigning values to class variables using method
	 Employee emp2=new Employee();
	 emp2.setdata(10, "Roman", 1000000000, 13);
	 emp2.display();
 }
}
