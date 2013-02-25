import java.util.*;


public class testklassosv {
	
	
	public static void main(String []args){
		
		System.out.println("Hej");
		System.out.println("wtf");
		//Detta är ett testprojekt
		int c = 4; 
		//lol
		System.out.println(c);
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i<10;i++){
			
			double temp = rand.nextDouble();
			list.add((int) temp);
			System.out.println(i+1 + ": " + temp);
			
		}
		
		
	}
	

}
