public class Monster 
{
   
    private int health;
    private int speed;
    private int xPos;
    private int yPos;
    private Weapon claw;
    public Monster()
    {
        claw = new Weapon();
        health = 100;
        speed = 4;
        
    }
    public int getClawDamage() {
    	claw.setDamage((int)(Math.random()*10 + 10));
    	return claw.getDamage();
    }
    public void setHealth(int a) {
    	health = a;
    }
    public int getHealth() {
    	return health;
    }
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int a){
        speed = a;
    }
    public void setXPos(int a){
        xPos = a;
    }
    public void setYPos(int a){
        yPos = a;
    }
            
    
}
