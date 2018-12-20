
// package lab4; 
import java.util.Scanner;
// James Dumitru, Programmer
public class PrattParkingGarage
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
    // the local variables declared and initialized
    char answer = 'Y', specEvent = 'N', rateCode = '\0';
    int ticketNum = 0;
    int timeIn = 0, timeOut = 0, timeDiff = 0;
    double amountTendered = 0.0, changeDue = 0.0;
    double flatFee = 0.0, monthFee = 0.0;
    double EXTRA_CHARGE = 0.0;
    double coupon = 0.0;
	double tip = 0.0;
    double flatTax = 3.00, totalDueFromCust = 0.0;
    
    	double couponUsed = 0.0 , totalRev = 0.0, totalTax = 0.0 , totalTip = 0.0 ;
    			
    
    System.out.println("");
    System.out.println("");
    System.out.println("***************************");
    System.out.println("----Pratt Parking Garage---");
    System.out.println("***************************");
    System.out.println("");
    System.out.println("");
    
    
    while(answer == 'Y' || answer == 'y') 
    {
    System.out.println("--------- M E N U ---------");
    System.out.println("data entry process: enter each of these");
    System.out.println("customer ticket number ->");
    ticketNum = sc.nextInt();
    System.out.println("ticket number " + (ticketNum));
    
    //determining time in parking garage
    System.out.println("time in (military)");
    timeIn = sc.nextInt();
    System.out.println("time out (military)");
    timeOut = sc.nextInt();
    timeDiff = timeOut - timeIn;
    System.out.println("time difference " + (timeDiff));
    
    //determine if flat rate or monthly
    System.out.println("rate code: (F or M)");
    rateCode = sc.next().charAt(0);
    System.out.println("rate code: " + rateCode);
    if (rateCode == 'F')
    {
      flatFee = 10.00;
      totalDueFromCust = flatFee;
      
    }
    if (rateCode == 'M')
    {
      monthFee = 90.00;
      totalDueFromCust = monthFee;
      // monthly fee is deferred 
      totalDueFromCust = 0;	
    }
    //tip amount
    System.out.println("tip amount");
    tip = sc.nextDouble();
    System.out.printf("tip: $%.2f\n", tip);
    totalDueFromCust += tip;
    totalTip += tip;
    		
    System.out.printf("flat tax: $%.2f\n", flatTax);
    totalDueFromCust += flatTax;
    totalTax += flatTax;
    
    //special event requirements
    System.out.println("special event(Y or N)?");
    specEvent = sc.next().charAt(0);
    if(specEvent == 'Y') EXTRA_CHARGE = 10;
      totalDueFromCust += EXTRA_CHARGE;
      totalRev += totalDueFromCust;
      
    System.out.println("coupon amount");
    coupon = sc.nextDouble();
    totalDueFromCust -= coupon;
    totalRev -= coupon; 
    if (coupon > 0)
    { couponUsed=1;
    }
    System.out.printf("total charge: $%.2f\n", totalDueFromCust);
  
    
    System.out.println("amount tendered from customer");
    amountTendered = sc.nextDouble();
    changeDue = amountTendered - totalDueFromCust;
    System.out.printf("change: $%.2f\n", changeDue);
    System.out.println("***************************");
    System.out.println("run again(Y or N)?");
    answer = sc.next().charAt(0);
    // reset all pertinent variables before the next loop ( customer ) 
    // by assigning a zero to the appropriate variables

  }//while loop end
    System.out.println("***************************");
    System.out.println(" ");
    System.out.println("Total Revenue: $" + totalRev );
    System.out.println("Total tax and tips: $" + totalTax + ", $" + totalTip);
    System.out.println("Total coupons used:" + couponUsed);
    System.out.println(" ");
    System.out.println("***************************");
    
	}// end main()
}// end class

