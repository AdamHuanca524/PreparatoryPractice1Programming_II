public class Product {
    public String name;
    public String category;
    public int code;

    public Product(){

    }

    public Product(String name, String category, int code){
        this.setName(name);
        this.setCategory(category);
        this.setCode(code);
    }

    public void setCode(int x){
        this.code = x;
    }

    public void setName(String x){
        this.name = x;
    }

    public void setCategory(String x){
        this.category = x;
    }

    public int getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }
}
