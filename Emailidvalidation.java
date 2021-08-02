package Regex;

import java.util.ArrayList;

import ClassworkRegex.Emailidvalidation;

public class Emailidvalidation {

	public static void main(String[] args) {
	ArrayList<String> validEmailList = new ArrayList<>();
	validEmailList.add("qwe@gmail.com");
	validEmailList.add("kme@gmail.com");
	validEmailList.add("nme@gmail.com");
	validEmailList.add("qoie@gmail.com");
	validEmailList.add("qye@gmail.com");
	
	Emailidvalidation emailidvalidation = new Emailidvalidation();
	for (String email : validEmailList)
	{
		System.out.println(email+"is valid="+Emailidvalidation.validate(email));
	}
	System.out.printlm("------------");
	
		
	}

	}

}
String email = "qwertyu@gmail.com";
Emailidvalidation emailidvalidation = new Emailidvalidation();

System.out.println(email + "is valid = " + emailidvalidation.validation(email));
//