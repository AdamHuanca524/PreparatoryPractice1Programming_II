public class Clothe extends Product{
    public String color;
    public String size;

    public Clothe(String name, String category, int code, String color, String size) {
        super(name, category, code);
        this.color = color;
        this.size = size;
    }

    public String getColor(){
        return color;
    }

    public String getSize(){
        return size;
    }

    public void setColor(String x){
        this.color = x;
    }

    public void setSize(String x){
        this.size = x;
    }
}
