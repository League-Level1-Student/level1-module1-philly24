package extra;

public class Person {
	
	private String name;
	private String superpower;
	public String getname() {
		return name;
	}
	public String getsuperpower() {
		return superpower;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
		
		
	}
	public String toString(){
		System.out.println( name+" has mad "+superpower+" skills");
		return name+" has mad "+superpower+" skills";
	}
}
