package com.adneom.trm;

import org.junit.Test;

import com.adneom.trm.domain.Helper;

import static org.junit.Assert.assertEquals;

/**
 * Test class
 * 
 * @author Els De Swaef
 */
public class HelperTest {

	@Test
	public void basicInitialsTest() {
		String name1 = "Els De Swaef";
		String name2 = "Tom Barman";
		assertEquals("EDS", Helper.getInitials(name1));
		assertEquals("TB", Helper.getInitials(name2));
	}
	
}
