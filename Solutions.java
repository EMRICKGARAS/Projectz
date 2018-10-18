/**
 * @(#)Solutions.java
 *
 *
 * @author 
 * @version 1.00 2018/10/14
 */

import java.util.*;
import java.io.*;
public class Solutions {
	
	//903A
    public static int hungryStudent(int n, int num){	    
	    while(n > 0) {
	        boolean isPres = false;

            for (int i=0; i<=33;i++) {
                for (int j=0; j<=33; j++) {
                    if (3*i + 7*j == num) {
                        isPres = true;
                        break;
                    }
                    else if (3*i + 7*j > num) break;
                }
                
                if(isPres) break;
            }
	        
	        if(isPres) {
	            System.out.println("YES");
	        }
	        else {
	            System.out.println("NO");
	        }
	        n--;
	    } return 0; 
    }
    
   //915A
   public static int garden(int n, int k, int tmp){
		int ans = k;
		for (int i = 0; i < n; i++) {
			if (k % tmp == 0)
				ans = Math.min(ans, k / tmp);
		}
		return ans;
	}
   
   //979A
   public static int pizza(long p){
        if (p == 1) {
            System.out.println(0);
        }
        else if (p % 2 == 1) {
            return (int) p;
        } else {
            return (int) p/2;
        } return (int) p;
   }
	
	//991B
	public static int gettingA(int n){
        int[] a = new int[n];

        double sum = 0, total = n*5.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        Arrays.sort(a);

        int pos = 0;
        while (sum/total < 0.9 && pos < n) {
            sum = sum - a[pos] + 5;
            pos++;
        }
        return pos;
	}
	
	//914A
   public static int perfectSquares(int size){
		int elems[] = new int[size];

		Arrays.sort(elems);
		for (int i = size - 1; i >= 0; i--) {
			if (Math.sqrt(elems[i]) != (int) Math.sqrt(elems[i])) {
				System.out.println(elems[i]);
			}
   		} return 0;
   }
	
	//908A
	public static String countingCards(String line){
        System.out.println(line.length() - line.replaceAll("[aoiue13579]", "").length());
        return line;
	}
	
	//988A
	public static int diverseTeam(int n, int k, int a, ArrayList a1, ArrayList a2){
        for(int i = 0; i < n; i++){
            if(!a1.contains(a)){a1.add(a);if(a2.size()<k)a2.add(i+1);}
        }
        if(a1.size()>=k){
            System.out.println("YES");
            for(int i=0;i<a2.size();i++){
                System.out.print(a2.get(i)+" ");
            }
        }
        else{
        	System.out.println("NO");
        	} return 0;
    } 
    public  static  void  print (int [] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    //984A
    public static int game(int x){
		int a[]= new int[x];
		
		for(int i=0;i<x;i++)	
				Arrays.sort(a);
		
		if(x%2!=0){
			return a[x/2];
			}
		else{
			return x/2-1;
		}		
    }
    	
}