
public class AsteriskLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String message) {
		
		String errorMsg = "***" + message + "***";
		String border = "*".repeat(errorMsg.length());
		
		System.out.println(border);
		System.out.println(errorMsg);
		System.out.println(border);
		
	}

}
