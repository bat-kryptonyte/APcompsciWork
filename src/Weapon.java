
public class Weapon
{
    public int damage;
    public int range;
    public int cost;
    public Weapon() {
    	damage = 0;
    	range = 0;
    	cost = 0;
    }
    public void setDamage(int a) {
    	damage = a;
    }
    public int getDamage() {
    	return damage;
    }
    public void setRange(int a) {
    	range = a;
    }
    public int getRange() {
    	return range;
    }
    public void setCost(int a) {
    	cost = a;
    }
    public int getCost() {
    	return cost;
    }
    
}
