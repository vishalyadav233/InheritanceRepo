package p7;

public class Ankit extends Student {
	public void Disp() {
		rollno = 64; name ="Vishal" ; marks = 64;
	}
	public static void main(String[] args) {
	Ankit r = new Ankit ();
	try {
			System.out.println(rollno+"    "+name+"    "+marks);
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
}

	
	


