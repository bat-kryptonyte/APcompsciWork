public class Farmer1
{
    private int xPos;
    private int yPos;
    private int attackBuff;
    public Farmer1(){
        xPos = 0;
        yPos = 0;
        attackBuff = 0;
    }
    public int getBuff() {
    	return attackBuff;
    }
    public int getxPos() {
    	return xPos;
    }
    public int getyPos() {
    	return yPos;
    }
    public void setBuff(int a) {
    	a = (int)(Math.random()*(50-20) + 20);
    	attackBuff = a;
    }
    public void setxPos(int a) {
    	xPos = a;
    }
    public void setyPos(int a) {
    	yPos = a;
    }
   
}
