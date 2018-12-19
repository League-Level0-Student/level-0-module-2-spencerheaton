package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		
	String height = JOptionPane.showInputDialog("how tall are you in inches?(only enter in numbers.)");
int num = Integer.parseInt(height);
if(num>=48)
	{
		JOptionPane.showMessageDialog(null, "you can ride *finger guns*");
	}else
	{
		JOptionPane.showMessageDialog(null, "Yah can't get on on buddy boy");

	}
}}
