package topic6;
//  The new class should have the following attributes: Name, mindset , isTesterByChance?, long toenails.
public class Tester {
    public String name;
    public String mindset;
    public boolean isTesterByChance;
    public int longToenails;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }

    public void setMindset(String mindset){
        this.mindset = mindset;
    }
    public String getMindset(){
        return mindset;
    }

    public void setTesterByChance(boolean testerByChance) {
        this.isTesterByChance = testerByChance;
    }

    public boolean getTesterByChance(){
        return  isTesterByChance;
    }

    public void setLongToenails(int longToenails){
        this.longToenails = longToenails;
    }
    public int getLongToenails(){
        return longToenails;
    }
    public void testerLongNails(int longToenails){

    }
}
