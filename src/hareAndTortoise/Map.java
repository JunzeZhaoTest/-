package hareAndTortoise;

import java.util.Random;

 public class Map {
	 public static String a="@@ ";
	 public static String b="|| ";
	 public static String c="^^ ";
	 public static String d="** ";
	 public static String e="= = ";
     public static String[] map=new String[100];
 

 static{
	 initMap();
 }
 public static  void initMap(){
Random random2=new Random();
 int [] arrayRandom = new int[20];
 for(int i=0;i<5;i++){
	 for(int j=0;j<20;j++){
		 arrayRandom[j]= i*20+j;
	 }
	 for(int k=0;k<5;k++){
	 int random3=random2.nextInt(20-k);
	 int index= arrayRandom[random3];
	 arrayRandom[random3]=arrayRandom[20-k-1];
	 arrayRandom[20-k-1]=index;
	 switch(k)
	 {
	 case 0:
		 map[index]=Map.a;
		 break;
	 case 1:
		 map[index]=Map.b;
		 break;
	 case 2:
	     map[index]=Map.c;
	     break;
	 case 3:
		 map[index]=Map.d;
		 break;
	 case 4:
		 map[index]=Map.e;
	 }
 }
	
 }
 for(int i=0;i<100;i++){
	 if(map[i]==null){
		 map[i]="_ _ ";
	 }
 }
 
} 
}
