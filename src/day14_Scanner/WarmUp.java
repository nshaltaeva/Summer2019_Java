package day14_Scanner;

public class WarmUp {
	
	public static void main(String[] args) {
	
	/*
	 if the day is Monday or Tuesday:
	 				Java class days
	 if the day is Thursday or Friday:
	 				Selenium class days
	 if the day is Wednesday or Saturday:
	 				SQL class days
	 otherwise:		day off
	 
	 */
	//solution 1
	String day = "Tuesday";
	
	switch (day) {
	case "Monday":
		System.out.println("Java class");
		break;
		
	case "Tuesday":
		System.out.println("Java class");
		break;
		
	case "Wednesday":
		System.out.println("SQL class");
		break;
		
	case "Thursday":
		System.out.println("Selenium class");
		break;
		
	case "Friday":
		System.out.println("Selenium class");
		break;
		
	case "Saturday":
		System.out.println("SQL class");
		break;
		
	default: 
		System.out.println("Day off");	
	}
		System.out.println("   ");
	//solution 2
	
String day1 = "Sunday";
	
	switch (day1) {
	case "Monday":
	case "Tuesday":
		System.out.println("Java class");
		break;
		
	case "Wednesday":
	case "Saturday":
		System.out.println("SQL class");
		break;
		
	case "Thursday":
	case "Friday":
		System.out.println("Selenium class");
		break;
		
	default: 
		System.out.println("Day off");	
	}
		
	System.out.println("=====HTTPS codes=====");
	
	/*
	 status code: 
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
	 */
	
	int StatusCode = 201;
	switch (StatusCode) {
	case 200:
		System.out.println("OK");
		break;
	case 201:
		System.out.println("Created");
		break;
	case 202:
		System.out.println("Accepted");
		break;
	case 301:
		System.out.println("Moved Permanently");
		break;
	case 303:
		System.out.println("See others");
		break;
	case 304:
		System.out.println("Not motified");
		break;
	case 307:
		System.out.println("Temporary Redirect");
		break;
	case 400:
		System.out.println("Bad Request");
		break;
	case 401:
		System.out.println("Unautorized");
		break;
	case 403:
		System.out.println("Forbidden");
		break;
	case 404:
		System.out.println("Not Found");
		break;
	case 410:
		System.out.println("Gone");
		break;
	case 500:
		System.out.println("Internal Server Error");
		break;
	case 503:
		System.out.println("Service Unavailable");
		break;
		default:
			System.out.println("Invalid Entry");
	}
	
	int day2 = 5;
	switch(day2) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	
	default:
		System.out.println("Invalid Number");
		
	}
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
