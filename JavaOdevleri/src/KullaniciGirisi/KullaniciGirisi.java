package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	/*Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
	
	
	public static void main(String[] args) {
		
		String userName , password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanici adi giriniz :");
		userName = input.nextLine();
		
		System.out.print("Sifrenizi giriniz : ");
		password = input.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giris basarili !");
		}
		
		else if(!userName.equals("patika") && !password.equals("java123")) {
			System.out.println("Bilgileriniz hatali.");
		}
		
		else if(userName.equals("patika") && !password.equals("java123")) {
			
			System.out.println("Girdiginiz Sifre Hatali\nSifrenizi degistirmek ister misiniz? y/n");
			String inp = input.nextLine();
			
			if(inp.equals("y")) {
				
				System.out.print("Yeni Sifre tanimlayiniz. : ");
				String newPass = input.nextLine();
				
				if(newPass.equals("java123")) {
					System.out.println("Sifre olusturulamadi. Lutfen baska sifre giriniz.");
				}else {
						System.out.println("Sifre degistirildi.");
					}
				}
			else {
					System.out.println("Sifreniz degistirilmedi. Bilgilerinizi tekrar kontrol ediniz.");
			}
			}
		input.close();
		}	
	}
	
	

