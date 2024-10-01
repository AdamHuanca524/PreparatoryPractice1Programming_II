import java.time.LocalDate;
 
public class Food extends Product{
    public String expirationDate;

    public Food(){

    }

    public Food(String name, String category, int code, String expirationDate) {
        super(name, category, code);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(String x){
        this.expirationDate = x;
    }

    private int Days(String date){
        //This function gives days amount since 01-01-2015
        int day, month, year;
        year = Integer.parseInt(date.substring(0, 4));
        month = Integer.parseInt(date.substring(5, 7)) - 1;
        day = Integer.parseInt(date.substring(8, 10)) - 1;
        //System.out.println(year + "/" + month + "/" + day);

        return ((year - 2015) * 365) + month * 30 + day;
    }

    public void alert(){
        LocalDate timenow = LocalDate.now();
        int due = Days(this.getExpirationDate()), daynow = Days(timenow.toString());
        if(due - daynow > 30){
            System.out.println("The food is in good condition");
            //System.out.println(due + " now: " + daynow);
        }else{
            System.out.println("ALERT:  The food is about to expire!!!!!");
            //System.out.println(due + " now: " + daynow);
        }
    }
}
