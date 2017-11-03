package dev.oam.pen.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dev.oam.pen.entity.Pen;

public class TestPen {
	
	Pen pen1, pen2, pen3;
	
	@Before
	public void setUp(){
		pen1 = new Pen(1, "001", "pentil", 200);
		pen2 = new Pen(2, "075", "WanPen", 100);
		pen3 = new Pen(3, "089", "DuanPen", 60);
	}

	@Test
	public void test() {
		String actualResult = Pen.allPens();
		String expectedResult = "Pen id 1 model 001 pentil 200\n";
		expectedResult += "Pen id 2 model 075 WanPen 100\n";
		expectedResult += "Pen id 3 model 089 DuanPen 60\n";
		
		assertEquals(expectedResult, actualResult);
	}

}
