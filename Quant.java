package Regex;

import java.util.regex.*;

public class Quant {

	public static void main(String[] args) {
		System.out.println("? quantifier....");{
		System.out.println(Pattern.matches("[ayz]?", "a"));
		System.out.println(Pattern.matches("[ayz]?", "aaa"));
		System.out.println(Pattern.matches("[ayz]?", "ayyyyzz"));
		System.out.println(Pattern.matches("[ayz]?", "amnta"));
	    System.out.println(Pattern.matches("[ayz]?", "ayz"));
	    System.out.println("+ quantifier....");
	    
		System.out.println(Pattern.matches("[ayz]?", "a"));
	    System.out.println(Pattern.matches("[ayz]?", "aaa"));
	    System.out.println(Pattern.matches("[ayz]?", "aayyyzz"));
	    System.out.println(Pattern.matches("[ayz]?", "aammta"));
	    System.out.println(Pattern.matches("[ayz]?", "ayyyza"));
	    
		}

	}

}
