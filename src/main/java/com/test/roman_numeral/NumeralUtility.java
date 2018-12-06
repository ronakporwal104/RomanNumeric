package com.test.roman_numeral;

import java.util.ArrayList;
import java.util.List;

public class NumeralUtility {
	public static List<Boolean> getOperations(List<Integer> digitList){
		
		if(digitList.size()<2){
			return null;
		}
		
		List<Boolean> operations = new ArrayList<Boolean>();
	
		for(int i=1;i<digitList.size();i++){
			operations.add(RuleEngine.doSubtract(digitList.get(i-1), digitList.get(i)));
		}
		return operations;
	}
	
	public static List<Integer> getDigitValues(List<String> romanList){
		List<Integer> valueList = new ArrayList<Integer>();
		for (String item : romanList) {
			valueList.add(RomanDigitEnum.valueOf(item).getValue());
		}
		return valueList;
	}
	
	public static Integer doSum(List<Integer> valueList){
		List<Boolean> operations = getOperations(valueList);
		Integer total = valueList.get(0);
		for (int i = 1; i < valueList.size(); i++) {
			if(operations.get(i-1)){
				total = valueList.get(i) - total;
			}else{
				total = total + valueList.get(i);
			}
		}
		return total;
	}
	
	/*public static void main(String[] args){
		List<Integer> valueList = new ArrayList<Integer>();
		valueList.add(10);
		valueList.add(10);
		List<Boolean> operations = getOperations(valueList);
		System.out.println(doSum(valueList, operations));
	}*/
}
