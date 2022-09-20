class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String str){
        name = str;
    }
}
public class employeeClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ravi");
        String s = emp.getName();
        System.out.println(s);
    }
}
