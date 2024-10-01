public class Employee {

    public String name;
    public String employeeCode;
    public String CI;
    public float salary;

    private String getInitials(String data){
        int aux = 0;
        char[] datachar = data.toCharArray();
        for(char x: datachar){
            if(x == ' '){
                break;
            }
            aux++;
        }
        String initials = "";
        return initials + data.charAt(0) + data.charAt(1) + data.charAt(aux + 1);
    }

    private void register(){
        this.employeeCode = getInitials(this.name) + CI.charAt(CI.length() - 1) + CI.charAt(CI.length() - 2) + CI.charAt(CI.length() - 3);
    }

    public Employee(){

    }

    public int discount(){
        if(this.salary >= 2650){
            return 15; 
        }else{
            return 10;
        }
    }

    public void pay(){
        double payment = this.salary * (1 - (this.discount() * 0.01));
        System.out.println("The Employee has a " + discount() + "% of discount resulting as " + payment + " of salary");
    }

    public Employee(String name, String CI, float salary){
        this.setName(name);
        this.setCI(CI);
        this.setSalary(salary);
        this.register();
    }

    public void setName(String x){
        this.name = x;
    }

    public void setemployeeCode(String x){
        this.employeeCode = x;
    }

    public void setCI(String x){
        this.CI = x;
    }

    public void setSalary(float x){
        this.salary = x;
    }

    public String getName(){
        return name;
    }

    public String getCI(){
        return CI;
    }

    public String getEmployeeCode(){
        return employeeCode;
    }

    public float getsalary(){
        return salary;
    }
}
