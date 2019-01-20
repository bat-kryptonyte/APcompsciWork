 import java.util.ArrayList;
public class Map 
{
    private Object Obj[][];
    public Hero joker;
    public Farmer1 blackSmith;
    public Farmer2 shopKeeper;
    private ArrayList <Monster> Monsters;
    private ArrayList <Potion> Potions;
    private ArrayList <String> HeroXEast;
    private ArrayList <String> HeroYEast;
    private ArrayList <String> HeroXWest;
    private ArrayList <String> HeroYWest;
    private ArrayList <String> HeroXSouth;
    private ArrayList <String> HeroYSouth;
    private ArrayList <String> HeroXNorth;
    private ArrayList <String> HeroYNorth;
    private interact interactions;
    public Map(int a, int b)
    {
        Obj = new Object[a][b];
        joker = new Hero();
        blackSmith = new Farmer1();
        shopKeeper = new Farmer2();
        Monsters = new ArrayList<Monster>();
        Potions = new ArrayList<Potion>();
        HeroXEast = new ArrayList<String>();
        HeroYEast = new ArrayList<String>();
        HeroXNorth = new ArrayList<String>();
        HeroYNorth = new ArrayList<String>();
        HeroXSouth = new ArrayList<String>();
        HeroYSouth = new ArrayList<String>();
        HeroXWest = new ArrayList<String>();
        HeroYWest = new ArrayList<String>();
        interactions = new interact(Obj);
        
    }
    public void placeMonster(int num){
        
        
        for(int a = 0; a < num; a++){
           Monsters.add(new Monster());
           Monsters.get(a).setXPos((int)(Math.random()*Obj.length));
           Monsters.get(a).setYPos((int)(Math.random()*Obj[0].length));
           
           Obj[Monsters.get(a).getXPos()][Monsters.get(a).getYPos()] = Monsters.get(a);    
            
        }
       
    }
    public void placeBlackSmith() {
    	int x = (int)(Math.random()*Obj.length);
    	int y = (int)(Math.random()*Obj[0].length);
    	
    			
    	if(Obj[x][y] instanceof Monster == false && Obj[x][y] instanceof Hero == false && Obj[x][y] instanceof Potion == false) {
    		Obj[x][y] = blackSmith;
    	}
    }
    public void placeShopKeeper() {
    	int x = (int)(Math.random()*Obj.length);
    	int y = (int)(Math.random()*Obj[0].length);
    	
    			
    	if(Obj[x][y] instanceof Monster == false && Obj[x][y] instanceof Hero == false && Obj[x][y] instanceof Potion == false && Obj[x][y] instanceof Farmer1 == false) {
    		Obj[x][y] = shopKeeper;
    	}
    }
    public void placeHero(){
        
        joker.setXPos(Obj.length-1);
        joker.setYPos(0);
        
        
        Obj[joker.getXPos()][joker.getYPos()] = joker;
        HeroXWest.add(String.valueOf(joker.getXPos()));
        HeroYWest.add(String.valueOf(joker.getWestPos()));
        HeroXNorth.add(String.valueOf(joker.getNorthPos()));
        HeroYNorth.add(String.valueOf(joker.getYPos()));
        HeroXSouth.add(String.valueOf(joker.getSouthPos()));
        HeroYSouth.add(String.valueOf(joker.getYPos()));
        HeroXEast.add(String.valueOf(joker.getXPos()));
        HeroYEast.add(String.valueOf(joker.getEastPos()));
        
        
    }
    public void placeFountains(int num) {
    	for(int a = 0; a < num; a++) {
    		int x = (int)(Math.random()*Obj.length);
    		int y = (int)(Math.random()*Obj[0].length);
    		Potions.add(new Potion());
    		if(Obj[x][y]  instanceof Hero == false && Obj[x][y]  instanceof Monster == false) {
    			Obj[x][y] = Potions.get(a);
    		}
    		
    	}
    }
    public void movement(char a){
        switch(a){
            case 'w':
                joker.setXPos(joker.getXPos() - 1);
                 for(int i = 0; i < Obj.length; i ++){
                     for(int j = 0; j < Obj[0].length; j ++){
                         if(Obj[i][j] instanceof Hero){
                              Obj[i][j] = null;
                            }
                        }
                    }
                 try{
                	 
                		 
                         Obj[joker.getXPos()][joker.getYPos()] = joker;
                		 HeroXWest.add(String.valueOf(joker.getXPos()));
                		 HeroYWest.add(String.valueOf(joker.getWestPos()));
                		 HeroXNorth.add(String.valueOf(joker.getNorthPos()));
                		 HeroYNorth.add(String.valueOf(joker.getYPos()));
                		 HeroXSouth.add(String.valueOf(joker.getSouthPos()));
                		 HeroYSouth.add(String.valueOf(joker.getYPos()));
                		 HeroXEast.add(String.valueOf(joker.getXPos()));
                		 HeroYEast.add(String.valueOf(joker.getEastPos()));
                	 
                    }catch(ArrayIndexOutOfBoundsException e){
                        joker.setXPos(joker.getXPos() + 1);
                        Obj[joker.getXPos()][joker.getYPos()] = joker;
                    }
                break;
                
            case 'a':
                joker.setYPos(joker.getYPos() - 1);
                for(int i = 0; i < Obj.length; i ++){
                     for(int j = 0; j < Obj[0].length; j ++){
                         if(Obj[i][j] instanceof Hero){
                              Obj[i][j] = null;
                            }
                        }
                    }
                try{
                     Obj[joker.getXPos()][joker.getYPos()] = joker;
                     HeroXWest.add(String.valueOf(joker.getXPos()));
                     HeroYWest.add(String.valueOf(joker.getWestPos()));
                     HeroXNorth.add(String.valueOf(joker.getNorthPos()));
                     HeroYNorth.add(String.valueOf(joker.getYPos()));
                     HeroXSouth.add(String.valueOf(joker.getSouthPos()));
                     HeroYSouth.add(String.valueOf(joker.getYPos()));
                     HeroXEast.add(String.valueOf(joker.getXPos()));
                     HeroYEast.add(String.valueOf(joker.getEastPos()));
                    }catch(ArrayIndexOutOfBoundsException e){
                        joker.setYPos(joker.getYPos() + 1);
                        Obj[joker.getXPos()][joker.getYPos()] = joker;
                    }
                break;
            case 's':
                joker.setXPos(joker.getXPos() + 1);
                for(int i = 0; i < Obj.length; i ++){
                     for(int j = 0; j < Obj[0].length; j ++){
                         if(Obj[i][j] instanceof Hero){
                              Obj[i][j] = null;
                            }
                        }
                    }
                try{
                     Obj[joker.getXPos()][joker.getYPos()] = joker;
                     HeroXWest.add(String.valueOf(joker.getXPos()));
                     HeroYWest.add(String.valueOf(joker.getWestPos()));
                     HeroXNorth.add(String.valueOf(joker.getNorthPos()));
                     HeroYNorth.add(String.valueOf(joker.getYPos()));
                     HeroXSouth.add(String.valueOf(joker.getSouthPos()));
                     HeroYSouth.add(String.valueOf(joker.getYPos()));
                     HeroXEast.add(String.valueOf(joker.getXPos()));
                     HeroYEast.add(String.valueOf(joker.getEastPos()));
                    }catch(ArrayIndexOutOfBoundsException e){
                        joker.setXPos(joker.getXPos() - 1);
                        Obj[joker.getXPos()][joker.getYPos()] = joker;
                    }
                break;
            case 'd':
                joker.setYPos(joker.getYPos() + 1);
                for(int i = 0; i < Obj.length; i ++){
                     for(int j = 0; j < Obj[0].length; j ++){
                         if(Obj[i][j] instanceof Hero){
                              Obj[i][j] = null;
                            }
                        }
                    }
                try{
                     Obj[joker.getXPos()][joker.getYPos()] = joker;
                     HeroXWest.add(String.valueOf(joker.getXPos()));
                     HeroYWest.add(String.valueOf(joker.getWestPos()));
                     HeroXNorth.add(String.valueOf(joker.getNorthPos()));
                     HeroYNorth.add(String.valueOf(joker.getYPos()));
                     HeroXSouth.add(String.valueOf(joker.getSouthPos()));
                     HeroYSouth.add(String.valueOf(joker.getYPos()));
                     HeroXEast.add(String.valueOf(joker.getXPos()));
                     HeroYEast.add(String.valueOf(joker.getEastPos()));
                    }catch(ArrayIndexOutOfBoundsException e){
                        joker.setYPos(joker.getYPos() - 1);
                        Obj[joker.getXPos()][joker.getYPos()] = joker;
                    }
                break;
        }
    }
    public void setStatus(int MonsterIndex) {
    	if(joker.getHealth() > 0) {
    		if(! joker.checkArmor()) {
    			joker.setHealth((int)joker.getHealth() - (int)Monsters.get(MonsterIndex).getClawDamage() );
    		}else {
    			joker.setHealth((int)joker.getHealth() - (int)(Monsters.get(MonsterIndex).getClawDamage()* 2/3) );
    		}
    	}else {
    		joker.setHealth(0);
    	}
    	if(Monsters.get(MonsterIndex).getHealth() > 0) {
    		Monsters.get(MonsterIndex).setHealth((int)Monsters.get(MonsterIndex).getHealth() - (int)joker.getDagDamage());
    	}else {
    		Monsters.get(MonsterIndex).setHealth(0);
    	}
    }
    public boolean checkObjectsNorth(int a, int b) {
    	boolean vaf = false;
    	if(interactions.checkNorth(a, b)||interactions.checkNorthM(a, b)||interactions.checkNorthS(a, b)||interactions.checkNorthSh(a, b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    	
    }
    public boolean checkObjectsSouth(int a, int b) {
    	boolean vaf = false;
    	if(interactions.checkSouth(a, b)||interactions.checkSouthM(a, b)||interactions.checkSouthS(a, b)||interactions.checkSouthSh(a, b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public boolean checkObjectsEast(int a, int b) {
    	boolean vaf = false;
    	if(interactions.checkEast(a, b)||interactions.checkEastM(a, b)||interactions.checkEastS(a, b)||interactions.checkEastSh(a, b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public boolean checkObjectsWest(int a, int b) {
    	boolean vaf = false;
    	if(interactions.checkWest(a, b)||interactions.checkWestM(a, b)||interactions.checkWestS(a, b)||interactions.checkWestSh(a, b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public void removeMonster(int a) {
    	Obj[Monsters.get(a).getXPos()][Monsters.get(a).getYPos()] = null;
    	Monsters.remove(a);
    }
    
    public boolean checkMonsterDeath(int a) {
    	boolean vaf = false;
    	if(Monsters.get(a).getHealth() < 0) {
    		vaf = true;
    	}
    	return vaf;
    }
    public void heroSlow() {
    	joker.setSpeed(joker.getSpeed() - 1);
    }
    public boolean checkMonsters() {
    	int a = joker.getXPos();
    	int b  = joker.getYPos();
    	boolean vaf = false;
    	if(interactions.checkNorthM(a, b)||interactions.checkSouthM(a, b)||interactions.checkWestM(a, b)||interactions.checkEastM(a,b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public boolean checkSpeeds() {
    	boolean vaf = false;
    	if(joker.getSpeed() > Monsters.get(0).getSpeed()) {
    		vaf= true;
    	}
    	return vaf;
    }
    public boolean checkPath(int a, int b){
        boolean vaf = false;
        try{
            for(int i = 0; i < HeroXWest.size(); i ++){
                if(String.valueOf(a).equals(HeroXWest.get(i))){
                   
                        if(String.valueOf(b).equals(HeroYWest.get(i))){
                            vaf = true;
                        }
                    
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        try{
            for(int i = 0; i < HeroXNorth.size(); i ++){
                if(String.valueOf(a).equals(HeroXNorth.get(i))){
                    
                        if(String.valueOf(b).equals(HeroYNorth.get(i))){
                            vaf = true;
                        }
                    
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        try{
            for(int i = 0; i < HeroXSouth.size(); i ++){
                if(String.valueOf(a).equals(HeroXSouth.get(i))){
                    
                        if(String.valueOf(b).equals(HeroYSouth.get(i))){
                            vaf = true;
                        }
                    
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        try{
            for(int i = 0; i < HeroXEast.size(); i ++){
                if(String.valueOf(a).equals(HeroXEast.get(i))){
                   
                        if(String.valueOf(b).equals(HeroYEast.get(i))){
                            vaf = true;
                        }
                    
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        return vaf;
    }
    public boolean checkPotions() {
     	int a = joker.getXPos();
    	int b  = joker.getYPos();
    	boolean vaf = false;
    	if(interactions.checkNorth(a, b)||interactions.checkSouth(a, b)||interactions.checkWest(a, b)||interactions.checkEast(a,b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public boolean checkShopK() {
     	int a = joker.getXPos();
    	int b  = joker.getYPos();
    	boolean vaf = false;
    	if(interactions.checkNorthSh(a, b)||interactions.checkSouthSh(a, b)||interactions.checkWestSh(a, b)||interactions.checkEastSh(a,b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public boolean checkBlackS() {
     	int a = joker.getXPos();
    	int b  = joker.getYPos();
    	boolean vaf = false;
    	if(interactions.checkNorthS(a, b)||interactions.checkSouthS(a, b)||interactions.checkWestS(a, b)||interactions.checkEastS(a,b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public boolean checkDirections(int a, int b) {
    	boolean vaf = false;
    	if(interactions.checkNorthD(a, b)||interactions.checkSouthD(a, b)||interactions.checkWestD(a, b)||interactions.checkEastD(a,b)) {
    		vaf = true;
    	}else {
    		vaf = false;
    	}
    	return vaf;
    }
    public int returnMonsterIndex() {
    	int x = 0;
    	for(int i = 0; i < Monsters.size(); i++) {
    		if(checkDirections(Monsters.get(i).getXPos(), Monsters.get(i).getYPos())) {
    			x = i;
    		}
    		
    	}
    	return x;
    
    }
    public int returnPotionsIndex() {
    	int x = 0;
    	for(int i = 0; i < Potions.size(); i++) {
    		if(checkDirections(Potions.get(i).getxPos(), Potions.get(i).getyPos())) {
    			x = i;
    		}
    		
    	}
    	return x;
    }
    public void removePotion(int a) {
    	Obj[Potions.get(a).getxPos()][Potions.get(a).getyPos()] = null;
    	Potions.remove(a);
    }
    public void statusToString(int a) {
    	System.out.println("You have sucessfully attacked!");
    	if(Monsters.get(a).getHealth() <= 0) {
    		System.out.println("The monster's health is now 0");
    	}else {
    	System.out.println("The Monster's health is now "+ Monsters.get(a).getHealth());
    	}
    	System.out.println("The Monster have attacked you!");
    	if(joker.getHealth() <= 0) {
    		System.out.println("Your Health is now 0");
    	}else {
    		System.out.println("Your Health is now " + joker.getHealth());
    	}
    }
    public void removeBlackSmith() {
    	Obj[blackSmith.getxPos()][blackSmith.getyPos()] = null;
    }
    public void removeShopKeeper() {
    	Obj[shopKeeper.getxPos()][shopKeeper.getyPos()] = null;
    }
    public boolean win() {
    	boolean vaf = false;
    	int counter = 0;
    	for(int i = 0; i < Obj.length; i++) {
    		for(int j = 0; j < Obj[0].length; j ++) {
    			if(Obj[i][j] instanceof Monster) {
    				counter ++;
    			}
    		}
    	}
    	if(counter == 0){
    		vaf = true;
    	}
    	return vaf;
    }
    public void mapToString(){
        for(int i = 0; i < Obj.length; i ++){
            for(int j = 0; j < Obj[0].length; j ++){
                if(Obj[i][j] instanceof Hero){
                    System.out.print("  (╥_╥)  ");
                    
                }else if(Obj[i][j] instanceof Monster){
                    if(checkPath(i,j)){
                        
                        System.out.print("  :(*):   ");
                    }else{
                        System.out.print("    .     ");   
                    }      
                }else if(Obj[i][j] instanceof Potion)   {
                	if(checkPath(i,j)) {
                		System.out.print("    P     ");
                	}else {
                		System.out.print("    .     ");
                	}
                }else if(Obj[i][j] instanceof Farmer1) {
                	if(checkPath(i,j)) {
                		System.out.print("    B     ");
                	}else {
                		System.out.print("    .     ");
                	}
                }else if(Obj[i][j] instanceof Farmer2) {
                	if(checkPath(i,j)) {
                		System.out.print("    S     ");
                	}else {
                		System.out.print("    .     ");
                	}
                }
                else{
                    System.out.print("    .     ");
                }
            }
            System.out.println("\n" + "\n" );
        }
        System.out.println("\n" + "\n");
    }
}
