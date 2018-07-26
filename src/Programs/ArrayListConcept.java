package Programs;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(800);
		ar.add(799);
		
		ar.remove(3);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		ar.add("Ajay");
		ar.add(12.33);
		ar.add('M');
		ar.add(25);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
			
	}
}

