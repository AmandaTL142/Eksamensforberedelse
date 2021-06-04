package Interfaces2;

public class Hat implements Clothes{
    String size;
    String style;

    //Constructor
    public Hat(String size, String style){
        this.size = size;
        this.style = style;
    }

    @Override
    public String getInfo() {
        return "This hat is a " + style + " with size " + size;
    }
}
