package com.q10viking.Strings;

public class IntegertoEnglishWords {
	private static final String[] LESS_THAN_20 = {"","One","Two","Three","Four",
									"Five","Six","Seven","Eight","Nine",
									"Ten","Eleven","Twelve","Thirteen","Fourteen",
									"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	private static final String[] TENS = {"","Ten","Twenty","Thirty","Forty","Fifty",
							"Sixty","Seventy","Eighty","Ninety"};
	private static final String[] THOUSANDS = {"Billion","Million","Thousand",""};
	
	private static final int[] radix = {1000000000,1000000,1000,1};
	
	public String numberToWords(int num) {
		if(num==0) return "Zero";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<radix.length;i++) {
			if(num/radix[i] == 0)
				continue;
			sb.append(trans(num/radix[i])).append(THOUSANDS[i]).append(" ");
			num %= radix[i];
		}
		return sb.toString().trim();
	}
	
	private String trans(int num) {
		if(num == 0) return "";
		if(num < 20) return LESS_THAN_20[num]+" ";
		if(num<100) return TENS[num/10]+" "+trans(num%10);
		return LESS_THAN_20[num/100]+" Hundred "+trans(num%100);
	}
	
	//测试
	public static void main(String[] args) {
		int[] numArr = {123,1234567,1234567891};
		IntegertoEnglishWords t = new IntegertoEnglishWords();
		for(int i=0;i<numArr.length;i++) {
			System.out.println("Input: "+numArr[i]);
			System.out.println("Output: "+t.numberToWords(numArr[i]));
		}
		
	}

}


/*
Output: One Hundred Twenty Three
Input: 1234567
Output: One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven
Input: 1234567891
Output: One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One
 */













