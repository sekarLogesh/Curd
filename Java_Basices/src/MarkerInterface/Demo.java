package MarkerInterface;

public class Demo {

	public static void main(String[] args) {

		Student s = new Student();
		if(s instanceof A) {
			System.out.println("its marker interface");
		}
		Mark m = new Mark();
		if(m instanceof A) {
			System.out.println("its marker interface ");
		}
		else {
			System.out.println("its   not a marker interface ");

		}
	}

}
