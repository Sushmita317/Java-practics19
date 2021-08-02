package Regex;
import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("AxxB");
		System.out.println("String matches the given Regex - "+ matcher.matches());

	}

}
