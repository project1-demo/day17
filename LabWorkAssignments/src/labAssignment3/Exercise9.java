package labAssignment3;

import java.time.*;

		public class Exercise9 {
			public static void main(String[] args)
		    {
		        LocalDate pdate = LocalDate.of(1999, 12, 04);
		        LocalDate now = LocalDate.now();
		 
		        Period diff = Period.between(pdate, now);
		 
		     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
		                    diff.getYears(), diff.getMonths(), diff.getDays());
		  }
		}

