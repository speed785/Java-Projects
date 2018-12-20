import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class GiftCards{
    static NumberFormat nf = NumberFormat.getCurrencyInstance();
    DateFormat dateForm = new SimpleDateFormat("MM/dd/yyyy");
    Calendar cal = Calendar.getInstance();
    Date today = new Date();
    // class data members
    public boolean expires;
    private double balance;
    public int cardNum;
    private String cardType;
    public String issueDate;
    private String holder;
    
    // define the member methods
    // default constructor
    public GiftCards() {}
    // overloaded constructor
    public GiftCards(String n, double amt){
        holder = n;
        balance = amt;
        }
    public void IssueGiftCard(){
        System.out.println("");
        System.out.println(" [ Card Issued ] ");
        System.out.println(" Today's Date is: " + dateForm.format(today));
        System.out.println(" Card Holder . . . " + holder);
        System.out.println(" Card Number . . . " + cardNum);
        System.out.println(" Card Type . . . " + cardType);
        System.out.println(" Card Amount . . . " +
            NumberFormat.getCurrencyInstance().format(balance));
        }
    public double getBalance(){
        return balance;
        }
    public void setBalance(double b){
        balance = b;
        }
    public String getHolder(){
        return holder;
        }
    public void setHolder(String h){
        holder = h;
        }
    public String getCardType(){
        return cardType;
        }
    public void setCardType(String t){
        cardType = t;
        }
    public void printCurrentGiftCardInfo(double spend){
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
        System.out.println(" [ Card Balance ] ");
        System.out.println(" Today's Date is: " + dateForm.format(today));
        System.out.println(" Deducted . . . . " +
            NumberFormat.getCurrencyInstance().format(spend));
        System.out.println(" Card Amount . . . " +
            NumberFormat.getCurrencyInstance().format(balance - spend));
        cal.add(Calendar.YEAR, 1);
        System.out.println(" Gift card expires in one year.");
        System.out.println(" Expiration Date is: " + cal.getTime());
        }
    }