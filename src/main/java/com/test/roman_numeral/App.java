package com.test.roman_numeral;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int oneGoldCredit = 0;
	public static int oneIronCredit = 0;
	public static int oneSilverCredit = 0;
	
    public static void main( String[] args )
    {
    	List<String> sample1 = new ArrayList<String>();
    	sample1.add("GLOB");
    	sample1.add("GLOB");
    	oneSilverCredit = creditOfOneMetal(NumeralUtility.doSum(NumeralUtility.getDigitValues(sample1)),34);
    	List<String> sample2 = new ArrayList<String>();
    	sample2.add("GLOB");
    	sample2.add("PROK");
    	oneGoldCredit = creditOfOneMetal(NumeralUtility.doSum(NumeralUtility.getDigitValues(sample2)),57800);
    	List<String> sample3 = new ArrayList<String>();
    	sample3.add("PISH");
    	sample3.add("PISH");
    	oneIronCredit = creditOfOneMetal(NumeralUtility.doSum(NumeralUtility.getDigitValues(sample3)),3910);
        System.out.println( "Cost of GLOB GLOB Silver is 34 credits, Then Cost of 1 silver is :"+  oneSilverCredit);
        System.out.println( "Cost of GLOB PROK GOLD is 57800 credits, Then Cost of 1 gold is :"+  oneGoldCredit);
        System.out.println( "Cost of PISH PISH Iron is 3910 credits, Then Cost of 1 iron is :"+  oneIronCredit);
        
        List<String> sample4 = new ArrayList<String>();
    	sample4.add("PISH");
    	sample4.add("TEGJ");
    	sample4.add("GLOB");
    	sample4.add("GLOB");
        System.out.println( "how much is pish tegj glob glob? - "+  NumeralUtility.doSum(NumeralUtility.getDigitValues(sample4)));
        
        List<String> sample5 = new ArrayList<String>();
    	sample5.add("GLOB");
    	sample5.add("PROK");
    	System.out.println( "how many Credits is glob prok Silver?"+  NumeralUtility.doSum(NumeralUtility.getDigitValues(sample5))*oneSilverCredit);
        
    	List<String> sample6 = new ArrayList<String>();
    	sample6.add("GLOB");
    	sample6.add("PROK");
    	System.out.println( "how many Credits is glob prok Gold ?"+  NumeralUtility.doSum(NumeralUtility.getDigitValues(sample6))*oneGoldCredit);
    	
    	List<String> sample7 = new ArrayList<String>();
    	sample7.add("GLOB");
    	sample7.add("PROK");
    	System.out.println( "how many Credits is glob prok Iron ?"+  NumeralUtility.doSum(NumeralUtility.getDigitValues(sample7))*oneIronCredit);
         
    }
    
    private static Integer creditOfOneMetal(int noOfMetal, int totalCredit){
    	return totalCredit/noOfMetal;
    }

}
