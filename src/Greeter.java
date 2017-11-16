import javax.swing.JOptionPane;

public class Greeter {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Hi. What is your name?");
		JOptionPane.showMessageDialog(null, "Hey " + name);
	}

}
