package day13_Review;

public class Switch_WarmUp {
	
	
	      public static void main(String[] args) {
	    	  
	    	/*
	    	 switch statement:
        
        switch(Expression){
            case CaseValue :
                    statement1;
                    statement2;
                    break;
            case CaseValue : 
                    statement1;
                    statement2;
                    break;
            default:
                    statement1;
                    statement2;
                    break;
        }
        we can have as many cases as you want
        
        caseValue MUSt match with the switch Expression' dataType
        break statement: 
            used for exiting the switch statement.
            if we don't have break statement, code will continue to run till next break statement or }
    case is similar with else-if
    default section is similar with else statement
    default section will get executed when there is no case that matches with the given Expression  
	    	
	    	
	    	 */
	    	  System.out.println("======case1========");
	    	  
	    	  int num = 2;
	    	  
	    	  switch (num) {
	    	  case 7: 
	    		  System.out.println("Sunday");
	    		  break;//used for exiting switch statement after the case is executed
	    		  // case closed
	    		  
	    	  default: 
	    		  System.out.println("Invalid Entry");
	    		  break;
	    		  
	    	  case 5-3:
	    		  System.out.println("Friday");
	    		  break;
	    		  
	    	  }
	    	  
	    	  System.out.println("======case2========");
	    	  
	    	  String days = "Friday";
	    	  switch(days) {
	    	  case "Monday": 
	    		  System.out.println("Monday is a Fun day");
	    	//	  break;
	    		  
	    	  case "Tuesday":
	    		  System.out.println("Tuesday is a Great day");
	    //		  break;
	    		  
	    	  case "Wednesday":
	    		  System.out.println("Wednesday is a day off");
	    		//  break;
	    		  
	    		  default:
	    			  System.out.println("Invalid ");
	    		//	  break;
	   		  }
	    		
	    	  System.out.println("======case3========");
	    	  
	    	// OR logic
	    	  char grade ='B';
	    	  if (grade == 'A' || grade == 'B') {
	    		  System.out.println("Passed the exam");
	    	  } else {
	    		  System.out.println("Failed");
	    	  }
	    		  
	    	  switch (grade) {
	    	  case 'A':
	    	  case 'B':
	    		  System.out.println("Passed the exam");
	    		  break;
	    		  
	    		  default:
	    			  System.out.println("Failed");
	    	  }
	    	  
	    	  System.out.println("==================");
	    	  
	    	 String US = "USA";
	    	 
	    	 if (US == "USA" || US == "America" || US =="US") {
	    		 System.out.println("American");
	    	 } else {
	    		 System.out.println("Not American");
	    	 }
	    	  
	    	  
	    	 switch (US) {
	    	 case "US":
	    	 case "USA":
	    	 case "America":
	    		 System.out.println("American");
	    		 break;
	    		 
	    		 default:
	    			 System.out.println("Not American");
	       	 } 
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
		
	}

}
