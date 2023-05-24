package com.regularexpressions;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String validEmailAddress = "darrandaf@gmail.com";
        boolean isEmailValid = isValid(validEmailAddress, "^[a-zA-Z0-9_\\-\\.$]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{3,}$");
        System.out.println("Email: " + isEmailValid);


        String validPhoneNumber = "000-555-0102";
        boolean isPhoneValid = isValid(validPhoneNumber, "^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
        System.out.println("Valid phone number: " + isPhoneValid);

        String validDate = "02/25/1993";
        boolean isDateValid = isValid(validDate, "^[0-9]{2}[/][0-9]{2}[/][0-9]{4}$");
        System.out.println("Valid Date: " + isDateValid);

        String validURL = "https://www.google.com";
        boolean isURLValid = isValid(validURL, "^[a-zA-Z://]+w\\.[a-zA-Z][a-zA-Z0-9]+\\.[a-z]{3}$");
        System.out.println("Valid URL: " + isURLValid);

        String validCreditCard = "9876 5432 1234 4567";
        boolean isCreditCardValid = isValid(validCreditCard, "^[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4}$");
        System.out.println("Valid credit cared number: " + isCreditCardValid);

        String validZipCode = "28212-2882";
        boolean isZipCodeValid = isValid(validZipCode, "^[0-9]{5}-[0-9]{4}");
        System.out.println("Valid zipcode: " + isZipCodeValid);

        String javaIdentifier = "myIdentifier";
        boolean isIdentifierValid = isValid(javaIdentifier, "^[a-zA-Z0-9_$]{1,}");
        System.out.println("Valid Java identifier: " + isIdentifierValid);

        String hexidecimalColor = "#FFFF00";
        boolean isHexidecimalValid = isValid(hexidecimalColor, "^#[0-9a-fA-F]{6}$");
        System.out.println("Hexidecimal color is valid: " + isHexidecimalValid);

        String validTime = "12:00";
        boolean isTimeValid = isValid(validTime, "^[0-9]{2}:[0-9]{2}$");
        System.out.println("Time format is valid: " + isTimeValid);


    }

    public static boolean isValid(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println( input + " is valid.");
        } else {
            System.out.println( input + " is not valid.");
        }
        return matcher.matches();
    }
}



//valid email address
// ^[a-zA-Z0-9_\-\.$]+@[a-zA-Z0-9_\-\.]+\.[a-zA-Z]{3,}$

//valid phone number
// ^[0-9]{3}-[0-9]{3}-[0-9]{4}$

//valid date in the format MM/DD/YYYY.
//^[0-9]{2}[/][0-9]{2}[/][0-9]{4}$

//valid URL
//^[a-zA-Z://]+w\.[a-zA-Z][a-zA-Z0-9]+\.[a-z]{3}$

//valid credit card number
//^[0-9]{4} [0-9]{4} [0-9]{4} [0-9]{4}$

//valid US zip code
//^[0-9]{5}-[0-9]{4}

//valid Java identifier
//^[a-zA-Z0-9_$]{1,}

//valid hexadecimal color code
//^#[0-9a-fA-F]{6}$

//valid time in the 24-hour format
//^[0-9]{2}:[0-9]{2}$