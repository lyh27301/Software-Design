
public class Japanese {
	
	private String japanese;
	private String english;
	private boolean isVisited;
	private int speed;
	
	public Japanese(String english, String japanese) {
		this.japanese = japanese;
		this.english = english;
		this.isVisited = false;
		
		//you can change speed of dictation here[3000 is 3000 ms per Katakana/katakana]
		this.speed = japanese.length()*3000;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void visit() {
		this.isVisited = true;
	}
	
	public boolean getIsVisited() {
		return isVisited;
	}
	
	public void print() {
		System.out.println(english);
	}
	
	public String getAnswer() {
		return this.japanese;
	}

}
