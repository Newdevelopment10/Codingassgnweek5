
public class App {

	public static void main(String[] args) {
	  Logger logo = new AsteriskLogger();
	  logo.log("Good Day");
	  System.out.println();
	  logo.error("ERROR: Not a good day");
	  
	  System.out.println();
	  System.out.println();
	  
	  Logger spaces = new SpacedLogger();
	  spaces.log("Friends' Night");
	  System.out.println();
	  spaces.error("Anniversary Night");

	}

}
