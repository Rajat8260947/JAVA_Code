package java_pratice.MidTerm;
class Employee {
    private String ename;
    private int id;
     private int basic_salary;
    private String gender;
    private int allowance;

    Employee(String name, int id, int salary, String gender ){
        this.ename = name;
        this.id = id;
        this.basic_salary = salary;
        this.gender = gender;
    }
    public int allowance(){

        if(gender == "male" || gender == "Male"){
            allowance = (10 * basic_salary)/100;
        }
        if(gender == "female" || gender == "Female"){
            allowance = (11 * basic_salary)/100;
        }
        return allowance;
    }

    void show(){
        System.out.println("Name:-" + ename);
        System.out.println("ID: -" + id);
        System.out.println("Salary:-" + basic_salary);
        System.out.println("Gender:-" + gender);
        System.out.println("Allowance:-" + allowance());
    }
}

public class Employee1 {

    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        System.out.println("Employee 1:");
        emp[0] = new Employee("Tapas", 2104061, 10000, "male");
        emp[0].show();
        System.out.println();
        System.out.println("Employee 2:");
        emp[1] = new Employee("X", 2104058, 10000, "Female");
        emp[1].show();
    }
}
