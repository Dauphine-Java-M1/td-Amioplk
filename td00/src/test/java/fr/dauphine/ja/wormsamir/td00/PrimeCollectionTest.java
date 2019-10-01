package fr.dauphine.ja.wormsamir.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    public void testZeroIsPrime() {
    	
    	PrimeCollection p = new PrimeCollection();
    	assertFalse( p.isPrime(0) );
    
    }
    
    public void testTwoIsPrime() {
    	
    	PrimeCollection p = new PrimeCollection();
    	assertTrue( p.isPrime(2) );
    
    }

	public void testNineIsPrime() {
	
		PrimeCollection p = new PrimeCollection();
		assertFalse( p.isPrime(9) );

	}
}
