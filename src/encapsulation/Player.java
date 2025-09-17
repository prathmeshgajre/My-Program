package encapsulation;

public class Player {

    private String pName;
    private int pAge;
    private String gameType;

    public Player(String pName,int pAge,String gameType){
        this.pName = pName;
        this.pAge = pAge;
        this.gameType = gameType;
    }

    public String getPName(){
        return pName;
    }
    public int getPAge(){
        return pAge;
    }
    public String getGameType(){
        return gameType;
    }
}
