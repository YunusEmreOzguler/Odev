package OgrenciBilgiSistemi;

public class Main {
	public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "5346787654", "MAT");
        Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali", 6253 ,"23", mat, fizik, kimya);
        s1.addBulkExamNote(87, 65, 64,80,70,100);
        s1.isPass();


        Student s2 = new Student("Emre",1234,"555",mat,fizik,kimya);
        s2.addBulkExamNote(100, 50, 40,70,87,98);
        s2.isPass();

        Student s3 = new Student("Hami", 253, "333", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40,76,66,78);
        s3.isPass();

    }
}