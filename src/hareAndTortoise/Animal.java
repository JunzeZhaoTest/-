package hareAndTortoise;

import java.util.Random;

public abstract    class  Animal {
protected   int position;
protected  int maxStep;
abstract public void touchMine();
abstract public void touchTransmission();

public  void touchLuck(){
	String animal=getAnimalName();
	if(Map.d==Map.map[position-1]){
		System.out.println(animal+"恭喜遇到幸运星");
		 run();
	}
}

public void touchDownWay(){
	if(Map.c==Map.map[position-1]){
		System.out.println("乌龟遇到了下坡路");
       int step= 10;
	String animal=getAnimalName();
	System.out.println("乌龟又走了10步");
	position=position+step;
	System.out.println(animal+"一共走了"+position+"步");
	
	}
}

public   void run(){
	gameOver();
	Random random =new Random();
	int step= random.nextInt(maxStep)+1;
	String animal=getAnimalName();
	System.out.println("走了"+step+"步");
	position=position+step;
	System.out.println(animal+"一共走了"+position+"步");
	printMap();
}
public void gameOver(){
	String animal=getAnimalName(); 
	if(position>=99){
		System.out.println(animal+"赢得了比赛");
	    System.exit(0);
	}
	
}
public  String getAnimalName(){
	return maxStep==3?"龟":"兔";
}

public  void printMap(){
	String temp=Map.map[position-1];
	String animal =getAnimalName();
	Map.map[position-1]=animal;
	for(String i:Map.map){
		System.out.print(i);
	}
	System.out.println();
	Map.map[position-1]=temp;
}

}

		
