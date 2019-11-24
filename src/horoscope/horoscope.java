package horoscope;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog(null, "What is your star sign?");
	if (star == "Aries") {
		JOptionPane.showMessageDialog(null, "Your mom is secretly Wonder Woman");
	}
	else if (star.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "You just won 1,000,000 dollars!");
	}
	else if (star.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "Your pet dog will enjoy his life with their new owner");
	}
	else if (star.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "You have cancer");
	}
	else if (star.equalsIgnoreCase("Leo")) {
		JOptionPane.showMessageDialog(null, "You dad is secretly Batman");
	}
	else if (star.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "You are what inspired the poop emoji");
	}
	else if (star.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "Enjoy today, because it may be your last");
	}
	else if (star.equalsIgnoreCase("Scorpio")) {		
		JOptionPane.showMessageDialog(null, "Have you wondered why you haven't seen your son in two days");
	}
	else if (star.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Your dad is Donald Trump");
	}
	else if (star.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "You won a new Tesla! I just need your address and credit card number");
	}
	else if (star.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "For Christmas, you should ask for friends and a life.");
	
	}
	else if (star.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "You should plant a tree");
		
	}else {
		JOptionPane.showMessageDialog(null, "No, a real one, you silly!");
	}
		
}
}
