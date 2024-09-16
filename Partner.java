import java.time.LocalDate;

public class Partner extends Client {
    public String ID;
    public float bonus;
    public String registerDate;

    public Partner(String name, int cI, int nIT, String iD, float bonus, String registerDate) {
        super(name, cI, nIT);
        this.ID = iD;
        this.bonus = bonus;
        this.registerDate = registerDate;
    }

    public void setID(String x){
        this.ID = x;
    }

    public void setBonus(float x){
        this.bonus = x;
    }

    public void setRegisterDate(String x){
        this.registerDate = x;
    }

    public String getID(){
        return ID;
    }

    public float getBonus(){
        return bonus;
    }

    public String getRegisterDate(){
        return registerDate;
    }

    private int Days(String date){
        //This function gives days amount since 01-01-2015
        int day, month, year;
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(5, 7)) - 1;
        day = Integer.parseInt(date.substring(8, 10)) - 1;

        return ((year - 2015) * 365) + month * 30 + day;
    }

    public void bono(){
        LocalDate timeNow = LocalDate.now();
        int dayRegist = Days(registerDate), daynow = Days(timeNow.toString());
        if(daynow - dayRegist > 365){
            System.out.println("The Partner has discount");
        }else{
            System.out.println("The Partner no has discount");
        }
    }
}
