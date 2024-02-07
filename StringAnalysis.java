package GitHub;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringAnalysis {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a String");
	        String email = sc.next();

	        int totalChars = email.length();
	        int uppercaseCount = 0;
	        int lowercaseCount = 0;
	        int digitCount = 0;
	        int otherCount = 0;

	        for (char ch : email.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                uppercaseCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowercaseCount++;
	            } else if (Character.isDigit(ch)) {
	                digitCount++;
	            } else {
	                otherCount++;
	            }
	        }

	        double uppercasePercentage = (double) uppercaseCount / totalChars * 100;
	        double lowercasePercentage = (double) lowercaseCount / totalChars * 100;
	        double digitPercentage = (double) digitCount / totalChars * 100;
	        double otherPercentage = (double) otherCount / totalChars * 100;

	        System.out.println("Upper Case Percentage: "+new DecimalFormat("0.000").format(uppercasePercentage) + "%");
	        System.out.println("Lower Case Percentage: "+new DecimalFormat("0.000").format(lowercasePercentage) + "%");
	        System.out.println("Digit Case Percentage: "+new DecimalFormat("0.000").format(digitPercentage) + "%");
	        System.out.println("Other Case Percentage: "+new DecimalFormat("0.000").format(otherPercentage) + "%");
	    }

}
