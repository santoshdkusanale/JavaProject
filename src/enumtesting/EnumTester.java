package enumtesting;

public class EnumTester {

	enum Day{
		 SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
		    THURSDAY, FRIDAY, SATURDAY 
	}
	
	/*class daytry extends Day{
		
	}*/
	Day day;
	
	
	public EnumTester(Day day) {
		super();
		this.day = day;
	}

	public void tellItLikeThis() {
		switch(day) {
		case MONDAY : System.out.println("Mondays are bad");
		break;

		case FRIDAY:
            System.out.println("Fridays are better.");
            break;
            
		case SATURDAY: case SUNDAY:
            System.out.println("Weekends are best.");
            break;
         
		//case THEDAY : 
                    
        default:
            System.out.println("Midweek days are so-so.");
            break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumTester firstDay = new EnumTester(Day.MONDAY); //General value in enum definition
		 firstDay.tellItLikeThis();
			EnumTester secondDay = new EnumTester(EnumTester.Day.SATURDAY); //Now referring to inner class enum
			 secondDay.tellItLikeThis();
				EnumTester thirdDay = new EnumTester(Day.MONDAY);
				 thirdDay.tellItLikeThis();
				 
				 for (Day p : Day.values()) {
					    System.out.println(p);
					    p.ordinal();
					    p.getDeclaringClass();
					}
	}
	
	
		
	}

