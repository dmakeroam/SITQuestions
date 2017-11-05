package dev.oam.ywc.quiz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution {

	private static char [] cardType = {'C','D','H','S'};
	private static String [] cardNo = {"2", "3", "4", "5", "6", "7", "8", "9", "0", "J", "Q", "K", "A"};
	private int [] mockData = {0, 1, 34 ,35};
	private String [] expectedResult = {"2C", "3C", "0H", "JH"};
	
	@Test
	public void testSolution(){
		
		// Test Suite
		
		for(int i = 0 ; i< 4 ; i++){
			
			assertEquals(expectedResult[i], cardAt(mockData[i]));
		
		}
		
	}
	
	public static String cardAt(int index){
		int cardTypeIndex = 0;
		int cardIndex = 0;
		for(int i = 0 ; i<index; i++, cardIndex++){
			if(cardIndex>12){
				cardIndex=0;
				cardTypeIndex++;
			}
		}
		return cardNo[cardIndex]+cardType[cardTypeIndex];
	}
}
