package collection;

public class Address {
	private int room;
	private String state;
	public Address(int room, String state) {
		super();
		this.room = room;
		this.state = state;
	}
	public Address() {
		super();
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [room=" + room + ", state=" + state + "]";
	}
	
	
}
