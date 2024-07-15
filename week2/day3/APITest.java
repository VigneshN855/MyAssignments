package week2.day3;

public class APITest {
	
	public void sendRequest(String endpoint) {
		System.out.println("This is a method with only one Aruement "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("This is method with 3 arguements "+endpoint+" "+requestBody+" "+requestStatus);
	}

	public static void main(String[] args) {
		APITest send = new APITest();
		send.sendRequest("Vickie");
		send.sendRequest("Sany", "Java", true);

	}

}
