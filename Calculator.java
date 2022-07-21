package sayhello;
import java.util.Scanner;
public class calculator {

	public static void main(String[] main) {
		int a,b,c,d,e;
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz:");
		a=input.nextInt();
		System.out.println("İkinci sayiyi giriniz:");
		b=input.nextInt();
		while (true) {
			System.out.println("Yapılacak işlemi seciniz:");
			System.out.println("1-Toplama,2-Cıkarma,3-Carpma,4-Bolme");
			c=input.nextInt();
			if (c==1){
				// koşullara noktalı virgül kullanmıyoruz
				d=a+b;
				System.out.println(a+"+"+b+"="+d);}
			else if (c==2){
				d = a-b;
				System.out.println(a+"-"+b+"="+d);
			}
			else if (c==3) {
				d=a*b;
				System.out.println(a+"*"+b+"="+d);
			}
			else if (c==4) {
				System.out.println("Durumu seçiniz:");
				System.out.println("1 ya da 2");
				e = input.nextInt();
				if (e==1) {
					d=a/b;
					System.out.println(a+"/"+b+"="+c);
				}
				else if (e==2) {
					d=b/a;
					System.out.println(b+"/"+a+"="+d);
				}
				else {
					System.out.println("Seçtiğiniz durum bulunamamaktadır.");}
			}
			else {
				System.out.println("Seçtinğiniz durum bulunamamaktadır.");
			}
			
			}
			}}
