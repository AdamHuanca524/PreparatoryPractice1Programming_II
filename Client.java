public class Client {
    public String name;
    public int CI;
    public int NIT;

    public Client(String name, int cI, int nIT) {
        this.name = name;
        this.CI = cI;
        this.NIT = nIT;
    }

    public void setName(String x){
        this.name = x;
    }

    public void setCI(int x){
        this.CI = x;
    }

    public void setNIT(int x){
        this.NIT = x;
    }

    public String getName(){
        return name;
    }

    public int getCI(){
        return CI;
    }

    public int getNIT(){
        return NIT;
    }    
}
