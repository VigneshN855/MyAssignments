package week2.day3;

public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("enterUsername from LoginTestData method is invoked");
	}
	public void enterPassword() {
		System.out.println("enterPasssword from LoginTestData method is invoked");
	}
	
	public static void main(String[] args) {
		LoginTestData log = new LoginTestData();
		log.enterCredentials();
		log.navigateToHomePage();
		log.enterUsername();
		log.enterPassword();
	}

}
