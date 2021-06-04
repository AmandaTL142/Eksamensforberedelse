package Interfaces2;

public class Pants implements Clothes{
    String mærke;
    String fabric;

    //Constructor
    Pants(String mærke, String fabric){
        this.mærke = mærke;
        this.fabric = fabric;
    }

    @Override
    public String getInfo(){
        return "Bukserne er produceret af " + mærke + " og lavet af " + fabric;
    }

}