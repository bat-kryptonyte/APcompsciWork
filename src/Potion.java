public class Potion
{
  
    private int recovery;
    private int xPos;
    private int yPos;
    public Potion()
    {
        recovery = 0;
        xPos = 0;
        yPos = 0;
    }
    public int recov(){
        return recovery;
    }
    public int getxPos() {
    	return xPos;
    }
    public int getyPos() {
    	return yPos;
    }
    public void setxPos(int a) {
    	xPos = a;
    }
    public void setyPos(int a) {
    	yPos = a;
    }
    public void setRecov(int a) {
    	recovery = a;
    }
}
