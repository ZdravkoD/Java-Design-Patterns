package shape;

public abstract class Shape implements Cloneable {
	
	abstract public void draw();
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}

	// private
	
	private String id;
	protected String type;
	
}
