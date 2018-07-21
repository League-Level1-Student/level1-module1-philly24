/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf.
 *  Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		if (name.equalsIgnoreCase("papa")) {
			System.out.println(name+" wears red hat");
			return name+" wears red hat";
		}
		else {
			String whiteHat = " wears a white hat";
			System.out.println(whiteHat);
			return whiteHat;
		}
	
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		if (name.equalsIgnoreCase("smurfette")) {
			System.out.println(name+" is a female");
			return name+" is a female"; 
		}
		else {
			System.out.println(name+" is a male");
			return name+" is a male";
		}
	}

}



