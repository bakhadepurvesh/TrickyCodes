package Day_10_3_2026;

public class Tricky2 {
	
	    static int x = 10;

	    public static void main(String[] args) {

	    	Tricky2 t1 = new Tricky2();
	    	Tricky2 t2 = new Tricky2();

	        t1.x = 20;

	        System.out.println(t2.x);
	    }
}






// Static variable is shared by all objects.