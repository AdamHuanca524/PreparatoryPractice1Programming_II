public class Manager extends Employee{
    public String assignedBranch;

    public String getAssignedBranch() {
        return assignedBranch;
    }
    public void setAssignedBranch(String assignedBranch) {
        this.assignedBranch = assignedBranch;
    }
    public Manager(String name, String CI, float salary, String assignedBranch) {
        super(name, CI, salary);
        this.assignedBranch = assignedBranch;
    }
}
