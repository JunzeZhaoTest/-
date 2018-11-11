package hareAndTortoise;

public    class Tortoise extends Animal{
	public Tortoise(){
		maxStep=3;
		
	        }
	public void touchMine(){
		if(Map.map[position-1]==Map.a){
			System.out.println("太不幸了，乌龟踩到了地雷");
			int flat=0;
		String animal =getAnimalName();
		while(position>0){
			--position;
			if(Map.map[position-1]==Map.a){
				flat++;
			}
			if(flat==1){
				System.out.println("被炸回上数一个地雷格");
				System.out.println(animal+"一共走了"+position+"步");
				break;
			}
			if(position==1){
				System.out.println("后方无地雷格，被传送回第一个格");
				position=0;
				break;
			}
		    }
		    }
		
	        }
	 public void touchTransmission(){
			if(Map.e==Map.map[position-1]){
				System.out.println("遇到了传送格");
				 int flat=0;
				 String animal=getAnimalName();
		 while(position<100){
			 ++position;
			 if(Map.map[position-1]==Map.e){
				flat++;
			 }
			 if(flat==2){
				 System.out.println("乌龟被传送到下数两个传送格");
				 System.out.println(animal+"一共走了"+position+"步");
				 break;
			 }
			 if(position>=100){
				 System.out.println("前方无传送格，乌龟赢了");
				 position=100;
				System.exit(0);
			 }
		     }
			 }
			
			
		     }
		
}
