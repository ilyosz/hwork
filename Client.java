public class Client {
    private String fullName;
    private int cash;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
    public void setCash(int cash, int a){
        this.cash=cash+a;
    }

    public int getCash() {
        return cash;
    }

    public void setCash1(int cash1){
        cash=cash + cash1;
    }
    public int getCash1(){
        return cash;
    }
    public void setCash12(int cash1){
        cash=cash - cash1;
    }
    public int getCash12(){
        return cash;
    }


//    public void clear(){
//
//        this.id=-1;
//
//
//    }
    public void clear1() {
        System.out.println(fullName);
        System.out.println(cash);
    }

    @Override
    public String toString() {
        return
                "fullName=" + fullName + '\'' +
                        ", cash=" + cash +
                        ", id=" + id
                ;
    }
}