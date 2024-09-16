public class Atm extends Employee { //ATM = cajero
    public String turn;

    public Atm(String name, String CI, float salary, String turn) {
        super(name, CI, salary);
        this.setTurn(turn);
    }
    public void setTurn(String x){
        this.turn = x;
    }
    public String getTurn(){
        return turn;
    }    
}