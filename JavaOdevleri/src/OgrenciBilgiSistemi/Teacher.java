package OgrenciBilgiSistemi;

public class Teacher {

	String name;
    String mpno;
    String branch;
	
   public Teacher(String name, String branch, String mpno) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
    
    void print() {
    	System.out.println("Adi \t\t: " + this.name);
    	System.out.println("Bolumu\t\t: " + this.branch);
    	System.out.println("Telefonu\t: " + this.mpno);
    }
    
}
