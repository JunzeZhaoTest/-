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
		System.out.println(animal+"��ϲ����������");
		 run();
	}
}

public void touchDownWay(){
	if(Map.c==Map.map[position-1]){
		System.out.println("�ڹ�����������·");
       int step= 10;
	String animal=getAnimalName();
	System.out.println("�ڹ�������10��");
	position=position+step;
	System.out.println(animal+"һ������"+position+"��");
	
	}
}

public   void run(){
	gameOver();
	Random random =new Random();
	int step= random.nextInt(maxStep)+1;
	String animal=getAnimalName();
	System.out.println("����"+step+"��");
	position=position+step;
	System.out.println(animal+"һ������"+position+"��");
	printMap();
}
public void gameOver(){
	String animal=getAnimalName(); 
	if(position>=99){
		System.out.println(animal+"Ӯ���˱���");
	    System.exit(0);
	}
	
}
public  String getAnimalName(){
	return maxStep==3?"��":"��";
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

		
