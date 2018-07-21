
public class CatRunner {
public static void main(String[] args) {
	Cat a = new Cat("fluffy");
	a.meow();
	a.printName();
	for (int i = 0; i<9  ; i++) {
		a.kill();
	}
	
}
}
