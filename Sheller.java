public class Sheller extends Employee {
    public String turn;
    public int shellGoal;
    
    public String getTurn() {
        return turn;
    }
    public void setTurn(String turn) {
        this.turn = turn;
    }
    public int getShellGoal() {
        return shellGoal;
    }
    public void setShellGoal(int shellGoal) {
        this.shellGoal = shellGoal;
    }

    public Sheller(String name, String CI, float salary, String turn, int shellGoal) {
        super(name, CI, salary);
        this.turn = turn;
        this.shellGoal = shellGoal;
    }
    
    
}
