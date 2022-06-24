package MayinTarlasi;

import java.util.Scanner;

public class MineSweeper {

//	Oyun metin tabanlıdır.
//	Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
//	Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
//	Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. 
//	Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. 
//	Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
//	Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
//	Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
//	Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
//	Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı 
//	(sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve 
//	etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
//	Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
	
	String[][] minedMap;
    String[][] game;
	int rowNumber ;
	int colNumber ;
	int mineNumber ;
	
	MineSweeper(int rowNumber, int colNumber){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.minedMap = new String[rowNumber][colNumber];
        this.game = new String[rowNumber][colNumber];
        this.mineNumber = (rowNumber * colNumber) / 4;
	}
	
	void minedMap() {
        for (int i = 0; i < mineNumber; i++) {
            int tempRow = (int) (Math.random() * rowNumber);
            int tempCol = (int) (Math.random() * colNumber);
            if (this.minedMap[tempRow][tempCol] != "*") {
                this.minedMap[tempRow][tempCol] = "*";
            } else {
                i--;
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (this.minedMap[i][j] != "*") {
                    this.minedMap[i][j] = "-";
                }
                System.out.print(this.minedMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void showingMinedMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(this.minedMap[i][j] + " ");
            }
            System.out.println();
        }
    }
	
    void showingMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(this.game[i][j] + " ");
            }
            System.out.println();
        }
    }

    void gameMap() {
    	for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                this.game[i][j] = "-";
            }
        }
    }
	
    void run() {
        int totalMove = (colNumber * rowNumber) - mineNumber;
        Scanner inp = new Scanner(System.in);
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz...");
        gameMap();
        minedMap();

        while (totalMove > 0) {
            int mineVision = 0;

            System.out.println("===============================");
            showingMap();
            System.out.print("Lutfen bir satir numarasi giriniz:");
            int rowInput = inp.nextInt();

            System.out.print("Lutfen bir sutun numarasi giriniz:");
            int colInput = inp.nextInt();
            
            if ((rowInput < 0 || rowInput >= rowNumber) || (colInput < 0 || colInput >= colNumber)) {
                System.out.println("Hatali giris yaptiniz. Lutfen sinirlar icinde secim yapiniz.");
                continue;
            } else {
                if (this.minedMap[rowInput][colInput] == "*") {
                    System.out.println("Mayina Bastiniz.");
                    showingMinedMap();
                    break;
                } else {
                    int minusRow = (rowInput-1), sumRow= (rowInput+1);
                    int minusCol = (colInput-1), sumCol = (colInput+1);
                    if ((minusRow < 0) || (minusCol < 0)) {
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if ((sumRow >= colNumber) || (sumCol >= colNumber)) {
                        sumRow = rowInput;
                        sumCol = colInput;
                    }
                    for (int i = minusRow; i <= sumRow; i++) {
                        for (int j = minusCol; j <= sumCol; j++) {
                            if (this.minedMap[i][j] == "*") {
                                mineVision++;
                            }
                        }
                    }
                    String convertMineVision = String.valueOf(mineVision);
                    this.game[rowInput][colInput] = convertMineVision;
                    totalMove--;
                }
            }
        }
        if (totalMove == 0) {
            System.out.println("Tebrikler kazandiniz.");
        }
        inp.close();
    }
}
