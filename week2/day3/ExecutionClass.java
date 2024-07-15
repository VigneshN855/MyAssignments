package week2.day3;

public class ExecutionClass extends Button{
	public static void main(String[] args) {
		Button btn = new Button();
		btn.click();
		btn.setText();
		btn.submit();
		
		System.out.println("---------------------------------------");
		
		TextField txt = new TextField();
		txt.click();
		txt.setText();
		txt.getText();
		
		System.out.println("-----------------------------------------");
		
		CheckBoxButton chk = new CheckBoxButton();
		chk.click();
		chk.setText();
		chk.submit();
		chk.clickCheckButton();
		
		System.out.println("-------------------------------------------");
		
		RadioButton rad = new RadioButton();
		rad.click();
		rad.setText();
		rad.submit();
		rad.selectRadioButton();
		
		System.out.println("---------------------------------------------");
		
		ExecutionClass exc = new ExecutionClass();
		exc.click();
		exc.setText();
		exc.submit();
	}
}
