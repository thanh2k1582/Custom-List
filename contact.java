package model;

public class contact {
    private String mColor;
    private String mName;
    private String mNumber;
    public contact(String mColor,String mName,String mNumber){
        this.mColor=mColor;
        this.mName=mName;
        this.mNumber=mNumber;
    }
    public String getmColor(){
        return mColor;
    }
    public void setmName(String mName){
        this.mName=mName;
    }
    public String getmName(){
        return mName;
    }
    public void setmNumber(String mNumber){
        this.mColor=mColor;
    }
    public String getmNumber(){
        return mNumber;
    }
    public void setmColor(String mColor){
        this.mColor=mColor;
    }
}
