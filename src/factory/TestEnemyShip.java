package factory;

import java.util.Scanner;

public class TestEnemyShip {

	public static void main(String [] args){
		
		EnemyShip theEnemy = null;
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		Scanner userInput = new Scanner(System.in);
	
		
		System.out.println("What type of ship ? (U/R/B)");
		
		if(userInput.hasNextLine()){
			String enemyShipOption = "";
			enemyShipOption = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
		}
		
		if(theEnemy != null){
			doStuffEnemy(theEnemy);
		} else{
			System.out.println("Enter a U, R or B next time.");
		}
		
		userInput.close();
		
	}
	
	
	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayHeroShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
