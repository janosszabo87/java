import javax.swing.JOptionPane;
public class Ex10ReadingValues2{

	public static void main (String[]args){
		
	
		String input = JOptionPane.showInputDialog("Type the first number");
		double num1 = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Type the second number");
		double num2 = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Type the third number");
		double num3 = Double.parseDouble(input);
		
		
		Ex10ReadingValues2 ex10 = new Ex10ReadingValues2();
		double result = ex10.add3Numbers(num1,num2,num3);
		JOptionPane.showMessageDialog(null, "This is the result:" + result);
		
		


}
	private double add3Numbers(double a,double b,double c){
		double result = a+b+c;
		System.out.printf("This is the result; %.2f", result);
		return result;
	}
	

}