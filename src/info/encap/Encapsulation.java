package info.encap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Child class

public class Encapsulation {

	public static void main(String[] args) {
		
		Encaps e1=new Encaps();
		e1.setIdNO(1234);
		e1.setName("Minu");
		e1.setPhNo(1234567l);
		
		
		Encaps e2=new Encaps();
		e2.setIdNO(2345);
		e2.setName("Raj");
		e2.setPhNo(2345678900000766l);
		
		Encaps e3=new Encaps();
		e3.setIdNO(3456);
		e3.setName("vidya");
		e3.setPhNo(44678423);
		
		//User defined List
		
//		ArrayList<Encaps> li=new ArrayList<>();
//		li.add(e1);
//		li.add(e2);
//		li.add(e3);
//		
//		for (int i = 0; i <=2; i++) {
//			
//			System.out.println(li.get(i).getIdNO());
//			System.out.println(li.get(i).getName());
//			System.out.println(li.get(i).getPhNo());
		
		//Set
		
		Map<Integer, Encaps> mp=new LinkedHashMap<>();
		mp.put(1, e2);
		mp.put(2, e3);		
			
			
		}
		
			
			
		}
		
		
		
	

