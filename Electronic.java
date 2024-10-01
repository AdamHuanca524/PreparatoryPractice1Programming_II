public class Electronic extends Product {
    public String mark;

    public Electronic(String name, String category, int code, String mark) {
        super(name, category, code);
        this.mark = mark;
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String x){
        this.mark = x;
    }
}
