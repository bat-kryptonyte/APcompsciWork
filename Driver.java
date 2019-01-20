import java.util.Scanner;
public class Driver
{
    public static int count = 0;
    public static boolean vat = false;
    public static void main(String Args[]){
        Scanner move = new Scanner(System.in);
        Map map1 = new Map(10,10);
        map1.placeMonster(6);
        map1.placeHero();
        map1.placeFountains(2);
        map1.placeBlackSmith();
        map1.placeShopKeeper();
        map1.mapToString();
        System.out.println("\n" + "\n");
        while(true ){
         while(count == 0) {
            System.out.println("*Please enter a direction for the Hero to move*");
            System.out.println("w,a,s,d");
            char direction = move.next().charAt(0);
            map1.movement(direction);
            map1.mapToString();
            if(map1.checkMonsters()) {
            	count = 1;
            }else if(map1.checkPotions()) {
            	count = 3;
            }else if(map1.checkBlackS()) {
            	count = 4;
            }else if(map1.checkShopK()) {
            	count = 5;
            }
            else {
            	count = 0;
            }
            
            
            
        }
        while(count == 1) {
        	System.out.println("*You have encountered a Monster, choose run or fight*");
        
        	String response = move.next();
        	if(response .equalsIgnoreCase("run")) {
        		if(map1.checkSpeeds()) {
        			System.out.println("You have successfully Escaped");
        			map1.heroSlow();
        			count = 0;
        			break;
        		}else {
        			System.out.println("The Monster is too fast, you have to engage!");
        		}
        	
        	}else if(response.equalsIgnoreCase("fight")) {
        		    count = 2;
        		    break;
        	}else {
        		System.out.println("You have to make a choice!");
        	}
        	
        }
        while(count == 2) {
        	System.out.println("Do you wish to run or stay");
        	String response = move.next();
            if(response.equalsIgnoreCase("run")) {
            	count = 1;
            }else {
            	count = 2;
            }
        	int x = map1.returnMonsterIndex();
        	if(map1.joker.getHealth() > 0 ) {
        		map1.setStatus(x);
        		map1.statusToString(x);
        		if(map1.checkMonsterDeath(x)) {
            		System.out.println("The Monster have been slained.");
            		map1.removeMonster(x);
            		map1.joker.addKillCount();
            		count = 0;
            		
            		break;
            	}
            	}else {
            		System.out.println("You have been slained.");
            		count = 100;
            		break;
            	}
        	
        		
        	}
        while(count == 3) {
        	int x = map1.returnPotionsIndex();
        	System.out.println("You have found a magical potion to heal yourself!");
        	System.out.println("Would you use or discard the potion？（Use or Discard)");
        	String response = move.next();
        	if(response .equalsIgnoreCase("Use")) {
        		map1.joker.setHealth(100);
        		map1.removePotion(x);
        		System.out.println("You are now at maximum Health");
        		count = 0;
        		break;
        	}else if(response .equalsIgnoreCase("Discard") ){
        		map1.removePotion(x);
        		System.out.println("The potion has been discarded");
        		count = 0;
        		break;
        	}else {
        		System.out.println("You Have to make a choice!");
        		break;
        	}
        }
        while(count == 4) {
        	System.out.println("You have met a local Blacksmith!");
        	System.out.println("Blacksmith: This dragon slayer…Only a true hero will receive this.");
        	if(map1.joker.getKillcount() >= 4) {
        		System.out.println("Blacksmith: You have been awarded the DragonSlayer!");
        		map1.joker.setDagDamage(map1.blackSmith.getBuff());
        		System.out.println("Blacksmith: I have fulfilled my mission. It is time for me to leave.(vanishes)");
        		map1.removeBlackSmith();
        		count = 0;
        		break;
        	}else {
        		System.out.println("Blacksmith: You have not yet slayed 4 monsters, come back later!");
        		count = 0;
        		break;
        	}
        }while(count == 5) {
        	System.out.println("You have met a local Shopkeeper!");
        	System.out.println("Shopkeeper: This precious armor…Only a true hero will receive this.");
        	if(map1.joker.getKillcount() >= 2) {
        		System.out.println("ShopKeeper: You have been awarded the Bronze Armor!");
        		map1.joker.wornArmor();
        		System.out.println("ShopKeeper: I have fulfilled my mission. It is time for me to leave.(vanishes)");
        		map1.removeShopKeeper();
        		count = 0;
        		break;
        	}else {
        		System.out.println("ShopKeeper: You have not yet slayed 2 monsters, come back later!");
        		count = 0;
        		break;
        	}
        }
            
        	if(count == 100) {
        		move.close();
        		break;
        	}
        	if(map1.win()) {
        		System.out.println("Peace has been restored to this village.");
        		System.out.println("You have become the hero of the village!");
        		System.out.println("***The End***");
        		move.close();
        		break;
        	}
        }
    }
       
        
   }
    

