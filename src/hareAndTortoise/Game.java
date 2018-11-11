package hareAndTortoise;

import java.util.Scanner;

public abstract  class Game extends Animal{
public static void main(String[] args) {
	Rabbit rabbit=new Rabbit();
	Tortoise tortoise =new Tortoise();
	Scanner sc=new Scanner(System.in);
	int flat1;
	while(true){
		sc.nextLine();
		flat1= rabbit.getFlat();
		if(flat1==0){
			rabbit.run();
			rabbit.touchLuck();
			rabbit.touchTransmission();
			rabbit.touchTree();
			rabbit.touchMine();
		}
		else{
			System.out.println("兔子在睡觉");
			System.out.println("睡了"+(4 -flat1)+"回合");
			flat1--;
			rabbit.setFlat(flat1);
		}
		
		    tortoise.run();
		    tortoise.touchLuck();
		    tortoise.touchDownWay();
	        tortoise.touchTransmission();
		    tortoise.touchMine();
		
		
		
		
		
	}


		
				
			
		}

}


