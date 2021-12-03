
public class SpacedLogger implements Logger{

	@Override
	public void log(String message) {
		
		System.out.println(spaceMe(message));
	}

	private String spaceMe(String message) {
		StringBuilder builder= new StringBuilder();		
		
		for (int i = 0; i < message.length(); i++) {
			builder.append(message.charAt(i)).append(' ');
		}
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}

	@Override
	public void error(String message) {
		
		System.out.println("ERROR: " + spaceMe(message));
		
	}

}
