package singleton;

public class MySingleObject {
	
	private static MySingleObject instance = new MySingleObject();
	
	public static MySingleObject getInstance() {
		return instance;
	}
	
	public String getMessage() {
		return "Hello world!";
	}

}
