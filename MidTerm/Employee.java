
public class Employee {
    private int employee_id = 853;
    private String employee_name = "baggens,billbow";
    private int employee_salary = 1000;
    
    public Employee(int employee_id, String employee_name,  int employee_salary){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
          
         }
         public int getemployee_salary() {
            return employee_salary;
        }
        public String getemployee_name() {
            return employee_name;
        }
        public int getemployee_id() {
            return employee_id;
        }
        public void setemployee_id(int employee_id) {
            this.employee_id = employee_id;
        }
        public void setemployee_name(String employee_name) {
            this.employee_name = employee_name;
        }
       
 public void setemployee_salary(int employee_salary) {
            this.employee_salary = employee_salary;
           
            System.out.println(employee_salary);
            System.out.println(employee_name);
            System.out.println(employee_id);
 }
}
