package unoRecursivo;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

public static void main(String[] args) {
		
		ArrayList<Integer> nums =  new ArrayList<Integer>(Arrays.asList(new Integer[]{10,6,5,7,1,4}));
        int fin = 15;
        metodoR(nums,fin,new ArrayList<Integer>());
}




	static void metodoR(ArrayList<Integer> nums, int fin, ArrayList<Integer> por) {
        int suma = 0;
        
        for (int x: por) suma += x;
        
        if (suma == fin)
        	
             System.out.println("Las combinaciones donde la suma sea igual a "+ fin +" son :"+Arrays.toString(por.toArray()));
        
        if (suma >= fin)
        	
             return;
        
        for(int i=0;i<nums.size();i++) {
        	
        	ArrayList<Integer> sobrante = new ArrayList<Integer>();
        	int numero = nums.get(i);
        	
        	for (int j=i+1; j<nums.size();j++)
        		
        		sobrante.add(nums.get(j));
        	ArrayList<Integer> porapoyo = new ArrayList<Integer>(por);
        	porapoyo.add(numero);
        	metodoR(sobrante,fin,porapoyo);
        }
     }
}
