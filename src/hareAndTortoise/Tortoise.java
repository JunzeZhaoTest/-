package hareAndTortoise;

public    class Tortoise extends Animal{
	public Tortoise(){
		maxStep=3;
		
	        }
	public void touchMine(){
		if(Map.map[position-1]==Map.a){
			System.out.println("̫�����ˣ��ڹ�ȵ��˵���");
			int flat=0;
		String animal =getAnimalName();
		while(position>0){
			--position;
			if(Map.map[position-1]==Map.a){
				flat++;
			}
			if(flat==1){
				System.out.println("��ը������һ�����׸�");
				System.out.println(animal+"һ������"+position+"��");
				break;
			}
			if(position==1){
				System.out.println("���޵��׸񣬱����ͻص�һ����");
				position=0;
				break;
			}
		    }
		    }
		
	        }
	 public void touchTransmission(){
			if(Map.e==Map.map[position-1]){
				System.out.println("�����˴��͸�");
				 int flat=0;
				 String animal=getAnimalName();
		 while(position<100){
			 ++position;
			 if(Map.map[position-1]==Map.e){
				flat++;
			 }
			 if(flat==2){
				 System.out.println("�ڹ걻���͵������������͸�");
				 System.out.println(animal+"һ������"+position+"��");
				 break;
			 }
			 if(position>=100){
				 System.out.println("ǰ���޴��͸��ڹ�Ӯ��");
				 position=100;
				System.exit(0);
			 }
		     }
			 }
			
			
		     }
		
}
