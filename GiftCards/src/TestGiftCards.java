import javax.swing.JOptionPane;
public class TestGiftCards{
    public static void main(String[] args){
        GiftCards gc = new GiftCards("", 0.0);
        // Welcome message
        String message = "Welcome!";
        JOptionPane.showMessageDialog(null, "Message: " + message,
        "Message", JOptionPane.PLAIN_MESSAGE);
        // Asking for card holder's name
        String str =
            JOptionPane.showInputDialog(null, "gift card holder's name : ");
        gc.setHolder(str);
        // Asking for gift card number
        str = JOptionPane.showInputDialog(null, "gift card number : ");
        gc.cardNum = Integer.parseInt(str);
        // Asking for gift card type
        str =
            JOptionPane.showInputDialog(null, "Enter card type (refund, purchase) : ");
        gc.setCardType(str);
        // How much is on the card
        str = JOptionPane.showInputDialog(null, "gift card amount : ");
        gc.setBalance(Double.parseDouble(str));

        // issue the card
        gc.IssueGiftCard();
        // use the gift card and spend some money!! hahahaha
        double useCard = 0;
        str =
            JOptionPane.showInputDialog(null, "deduct amount from card : ");
        useCard = Double.parseDouble(str);
        // How much you have left on the card
        gc.printCurrentGiftCardInfo(useCard);
        }
}
