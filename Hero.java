public class Hero
{
  
    private int money;
    private int health;
    private int speed;
    private boolean ArmorStatus;
    private int xPos;
    private int yPos;
    private Weapon Dag;
    private int killCount;
    public Hero()
    {
        Dag = new Weapon();
        
        health = 1000;
        money = 0;
        speed = 10;
        ArmorStatus = false;
        killCount = 0;
    }
    public boolean checkArmor() {
    	return ArmorStatus;
    }
    public void setHealth(int a) {
    	health = a;
    }
    public int getDagDamage() {
    	Dag.setDamage((int)(Math.random()*(30-10)+ 10));
    	return Dag.getDamage();
    }
    public void setDagDamage(int a) {
    	Dag.setDamage(a);
    }
    public void setXPos(int a){
        xPos = a;
    }
    public void setYPos(int a){
        yPos = a;
    }
    public void setSpeed(int a){
    	speed = a;
    }
    public int getXPos(){
        return xPos;
        
    }
    public int getYPos(){
        return yPos;
    }
    public int getKillcount() {
    	return killCount;
    }
    public int getNorthPos(){
        return (xPos - 1);
    }
    public int getSouthPos(){
        return (xPos + 1);
    }
    public int getEastPos(){
        return (yPos + 1);
    }
    public int getWestPos(){
        return (yPos - 1);
    }
    public int getMoney(){
        return money;
    }
    public void wornArmor(){
        ArmorStatus = true;
        
    }
    public int getSpeed() {
    	return speed;
    }
    public int getHealth(){
        return (int)health;
    }
    public void addKillCount() {
    	killCount += 1;
    }
   
}
