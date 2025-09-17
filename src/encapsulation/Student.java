package encapsulation;

public class Student {

    private String stdName;
    private int stdRollNo;
    private int stdId;

    public String getStdName(){
        return stdName;
    }
    public int getStdRollNo(){
        return stdRollNo;
    }
    public int getStdId(){
        return stdId;
    }

    public void setStdName(String name){
        this.stdName = name;
    }
    public void setStdRollNo(int rollNo){
        this.stdRollNo = rollNo;
    }
    public void setStdId(int id){
        this.stdId = id;
    }

}
