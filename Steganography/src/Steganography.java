import javax.swing.JOptionPane;
//James Dumitru, Programmer
public class Steganography 
{
	public static void main(String args[])
	{
		// the plaintext message
		String line1 = "Hello Stan and Marilyn!";
		String line2 = "Let us meet for lunch";		
		String line3 = "at noon on Tuesday.";
		String line4 = "We will be waiting";
		String line5 = "at the East building of";
		String line6 = "train station C.";				
		String line7 = "I will ask Hank, Quincy,";	
		String line8 = "Denise, Eddy and Roni";
		String line9 = "to join us there!";	
		String line10 = "Best Regards,";
		String line11 = "KZ";
		String message = "\n";
		String linea = "time to launch";
		String lineb = "drone BETA";
		
		// display the plaintext message
		message +=  "\t" + line1 + "\n";
		message +=  "\t" + line2 + "\n";
		message +=  "\t" + line3 + "\n";
		message +=  "\t" + line4 + "\n";
		message +=  "\t" + line5 + "\n";
		message +=  "\t" + line6 + "\n";
		message +=  "\t" + line7 + "\n";
		message +=  "\t" + line8 + "\n";
		message +=  "\t" + line9 + "\n";
		message +=  "\t" + line10 + "\n";
		message +=  "\t" + line11 + "\n";
		JOptionPane.showMessageDialog(null, "Message: " + message,"Plaintext Message", JOptionPane.PLAIN_MESSAGE);
		
		// convert plaintext message to lower case
		line1 = line1.toLowerCase(); 
		line2 = line2.toLowerCase(); 
		line3 = line3.toLowerCase(); 
		line4 = line4.toLowerCase(); 
		line5 = line5.toLowerCase(); 
		line6 = line6.toLowerCase(); 
		line7 = line7.toLowerCase(); 
		line8 = line8.toLowerCase(); 
		line9 = line9.toLowerCase(); 
		line10 = line10.toLowerCase(); 
		line11 = line11.toLowerCase(); 
		String plaintext = "\n";
		plaintext +=  "\t" + line1 + "\n";
		plaintext +=  "\t" + line2 + "\n";
		plaintext +=  "\t" + line3 + "\n";
		plaintext +=  "\t" + line4 + "\n";
		plaintext +=  "\t" + line5 + "\n";
		plaintext +=  "\t" + line6 + "\n";
		plaintext +=  "\t" + line7 + "\n";
		plaintext +=  "\t" + line8 + "\n";
		plaintext +=  "\t" + line9 + "\n";
		plaintext +=  "\t" + line10 + "\n";
		plaintext +=  "\t" + line11 + "\n";
		//Lower case window popup
		JOptionPane.showMessageDialog(null, "Message (lower case): " + plaintext,"Lower Case", JOptionPane.PLAIN_MESSAGE);
		//Lower case message count
		JOptionPane.showMessageDialog(null, "Message (lower case): " + plaintext.length(),"Lower Case", JOptionPane.PLAIN_MESSAGE);
		
		// define line messages field size with 20 indices
		int[] num = 
		{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		// define the key variable and message object
		int key = 0;
		StringBuilder s = new StringBuilder();
		
		// build the secret message
		s.append("\n"); // new line
		key = num[7]; // t
		s.append(line1.substring(key, key + 1));
		key = num[18]; // i
		s.append(line1.substring(key, key + 1));
		key = num[7];  // m
		s.append(line2.substring(key, key + 1));
		key = num[8]; // e
		s.append(line2.substring(key, key + 1));
		s.append(" "); // space
		key = num[1]; // t
		s.append(line3.substring(key, key + 1));
		key = num[5]; // o
		s.append(line3.substring(key, key + 1));
		s.append(" "); // space
		key = num[5]; // l
		s.append(line4.substring(key, key + 1));
		key = num[12]; // a
		s.append(line4.substring(key, key + 1));
		key = num[13]; // u
		s.append(line5.substring(key, key + 1));
		key = num[18]; // n
		s.append(line5.substring(key, key + 1));
		key = num[14]; // c
		s.append(line6.substring(key, key + 1));
		key = num[11]; // h
		s.append(line7.substring(key, key + 1));
		key = num[1]; // e
		s.append(line8.substring(key, key + 1));
		key = num[0]; // d
		s.append(line8.substring(key, key + 1));
		s.append(" ");
		key = num[9]; // d
		s.append(line8.substring(key, key + 1));
		key = num[14]; // r
		s.append(line9.substring(key, key + 1));
		key = num[1]; // o
		s.append(line9.substring(key, key + 1));
		key = num[6]; // n
		s.append(line9.substring(key, key + 1));
		key = num[15]; // e
		s.append(line9.substring(key, key + 1));
		s.append(" ");
		key = num[0]; // B
		s.append(line10.substring(key, key + 1).toUpperCase());
		key = num[1]; // E
		s.append(line10.substring(key, key + 1).toUpperCase());
		key = num[3]; // T
		s.append(line10.substring(key, key + 1).toUpperCase());
		key = num[8]; // A
		s.append(line10.substring(key, key + 1).toUpperCase());
		
		s.append("\n"); // new line
		System.out.println("a steganography secret " + s);
		//System.out.println("a steganography secret " + "\n" + linea + "\n" + lineb); Can use this if anything
		
		//new secret message attempt
		JOptionPane.showMessageDialog(null, "Secret Message: "+ line4,"Decoded", JOptionPane.PLAIN_MESSAGE);
		//Secret Message characters 
		JOptionPane.showMessageDialog(null, "Secret Message: "+ s.length(),"Decoded", JOptionPane.PLAIN_MESSAGE);
	}
}

