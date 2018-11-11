package hareAndTortoise;

public   class Rabbit extends Animal {
private int flat;
public Rabbit(){
	maxStep=6;
}
public void touchMine(){
	if(Map.a==Map.map[position-1]){
	 System.out.println("很不幸，兔子踩到了地雷");
	 int flat=0;
	 String animal =getAnimalName();
	 while(position>0){
		 --position;
		 if(Map.map[position-1]==Map.a){
			 flat++;
		 }
		 if(flat==2) {
			 System.out.println(animal+"被炸回上数两个地雷");
			 System.out.println(animal+"一共走了"+position+"步");
			 break;
		 }
		 if(position==1){
			 System.out.println("后方无地雷格，回到原点");
			 position=0;
			 break;
		 }
	 }
	 }
}
 
 public void touchTransmission(){
	if(Map.e==Map.map[position-1]){
		System.out.println("遇到了传送格");
	 String animal=getAnimalName();
    int flat=0;
    while(position<100){
    	++position;
    	if(Map.map[position-1]==Map.e){
    		flat++;
    	}
    	if(flat==1){
    		System.out.println("兔子被传送到了下数第二个传送格");
    		System.out.println(animal+"一共走了"+position+"步");
    		break;
    	}
    	if(position>=100){
    		System.out.println("前方无传送格，兔子赢了");
    		position=100;
    		System.exit(0);
    	}
    }
    
		
	}
}
 
 public void touchTree(){
	 if(Map.map[position-1]==Map.b){
		 System.out.println("兔子在树底下睡着了，睡三个回合");
	 flat=3;
	 }
 
 }
 public int getFlat(){
	 return flat;
 }
 public void setFlat(int flat){
	 this.flat=flat;
 }

 }
 

