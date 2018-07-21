

public class BackPackRunner {
public static void main(String[] args) {
	Backpack pack = new Backpack();
	Textbook book= new Textbook();
	Pencil pencil= new Pencil();
	Ruler ruler = new Ruler();
	
	pack.putInBackpack(book);
	pack.putInBackpack(pencil);
	pack.putInBackpack(ruler);
	pack.goToSchool();
}
}
