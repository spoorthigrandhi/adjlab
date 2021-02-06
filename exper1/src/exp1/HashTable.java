package exp1;
import java.util.*; 
public class HashTable {
	 public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1201,"spoorthi");  
		  hm.put(1202,"priya");  
		  hm.put(1203,"chandu");  
		  hm.put(1204,"nikki");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}  	
}