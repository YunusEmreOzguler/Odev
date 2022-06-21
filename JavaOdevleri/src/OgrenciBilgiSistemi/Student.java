package OgrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int kimya, int fizik, int matSoz, int kimSoz, int fizSoz) {
        if ((mat >= 0 && mat <= 100) && (matSoz >= 0 && matSoz <= 100)) {
            this.mat.note = mat;
            this.mat.sozluNot = matSoz;
        }
        if ((kimya >= 0 && kimya <= 100) && (kimSoz >= 0 && kimSoz <= 100)) {
            this.kimya.note = kimya;
            this.kimya.sozluNot = kimSoz ;
        }
        if ((fizik >= 0 && fizik <= 100) && (fizSoz >= 0 && fizSoz <= 100)) {
            this.fizik.note = fizik;
            this.fizik.sozluNot = fizSoz ;
        }

    }
   

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama \t: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        double matNote = (this.mat.note * 0.80) + (this.mat.sozluNot * 0.20);
        double fizNote = (this.fizik.note * 0.80) + (this.fizik.sozluNot * 0.20);
        double kimNote = (this.kimya.note * 0.80) + (this.kimya.sozluNot * 0.20);
        this.avarage = (matNote + fizNote + kimNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci \t: " + this.name);
        System.out.println("Matematik Notu\t: " + this.mat.note);
        System.out.println("Fizik Notu \t: " + this.fizik.note);
        System.out.println("Kimya Notu \t: " + this.kimya.note);
    }

}