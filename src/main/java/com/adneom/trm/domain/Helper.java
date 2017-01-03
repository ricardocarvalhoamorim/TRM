package com.adneom.trm.domain;

/**
 * Helper class for some quick calculations.
 * 
 * This class should probably get a better name and a better place later.
 * I am not sure in this structure yet where code like this should be.
 *
 * @author Els De Swaef
 */
public class Helper {

	public static String getInitials(String name) {
		String initials = "";
		String[] nameParts = name.split(" ");
		for (String part : nameParts) {
			initials += part.charAt(0);
		}
		return initials;
	}
	
}
