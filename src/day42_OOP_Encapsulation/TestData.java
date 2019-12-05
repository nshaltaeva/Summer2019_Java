package day42_OOP_Encapsulation;

public class TestData {

	/*
	 Name
	 ID
	 */
	
	private String Name = "Bekir"; //the data is not visible to any other classes
	private int ID = 897;
	
	
	//getter methods
	public String getName() { //read the private data only
		return Name;
	}
	
	public int getID() {
		return ID;
	}
	
	
	//setter: to change the value
	public void setName (String Name) {
		this.Name = Name;
		// return Name;
	}
	
	public void setID (int ID) {
		this.ID = ID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
