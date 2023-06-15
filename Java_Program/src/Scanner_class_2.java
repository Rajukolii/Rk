import javax.swing.JOptionPane;

public class Scanner_class_2 {

	public static void main(String[] args) {
	
		int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number"));

		int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number"));
		
		int c = a+b;
		
		JOptionPane.showMessageDialog(null, "Result is "+c);
	}

}
