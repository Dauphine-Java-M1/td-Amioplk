package fr.dauphine.ja.wormsamir.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers;
	
	public PrimeCollection() 
	{
		numbers = new ArrayList<>();
	}
	
	void initRandom(int n, int m)
	{
		
		Random generator = new Random();
		for(int i=0; i<n ; ++i) 
		{
			numbers.add(generator.nextInt(m));
		}
	}
	
	boolean isPrime(int p) 
	{
		for(int i=2; i<Math.sqrt(p) ;++i) 
		{
			if(p%i == 0) return false;
		}
		
		return true;
	}
	
	void printPrimes() 
	{
		for(int p : numbers) 
		{
			if(isPrime(p)) System.out.println(p);
		}
	}
	
    public static void main( String[] args )
    {
    	PrimeCollection pc = new PrimeCollection();
    	pc.initRandom(100, 2000);
    	pc.printPrimes();
    }
}
