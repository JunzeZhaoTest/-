package hareAndTortoise;

public   class Rabbit extends Animal {
private int flat;
public Rabbit(){
	maxStep=6;
}
public void touchMine(){
	if(Map.a==Map.map[position-1]){
	 System.out.println("�ܲ��ң����Ӳȵ��˵���");
	 int flat=0;
	 String animal =getAnimalName();
	 while(position>0){
		 --position;
		 if(Map.map[position-1]==Map.a){
			 flat++;
		 }
		 if(flat==2) {
			 System.out.println(animal+"��ը��������������");
			 System.out.println(animal+"һ������"+position+"��");
			 break;
		 }
		 if(position==1){
			 System.out.println("���޵��׸񣬻ص�ԭ��");
			 position=0;
			 break;
		 }
	 }
	 }
}
 
 public void touchTransmission(){
	if(Map.e==Map.map[position-1]){
		System.out.println("�����˴��͸�");
	 String animal=getAnimalName();
    int flat=0;
    while(position<100){
    	++position;
    	if(Map.map[position-1]==Map.e){
    		flat++;
    	}
    	if(flat==1){
    		System.out.println("���ӱ����͵��������ڶ������͸�");
    		System.out.println(animal+"һ������"+position+"��");
    		break;
    	}
    	if(position>=100){
    		System.out.println("ǰ���޴��͸�����Ӯ��");
    		position=100;
    		System.exit(0);
    	}
    }
    
		
	}
}
 
 public void touchTree(){
	 if(Map.map[position-1]==Map.b){
		 System.out.println("������������˯���ˣ�˯�����غ�");
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
 

