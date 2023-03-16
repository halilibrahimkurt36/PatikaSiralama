import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double sayi1=0,sayi2=0,sayi3=0;
		Scanner giris=new Scanner(System.in);
		
		System.out.println("Lütfen 1.Sayıyı Giriniz : ");
		sayi1=giris.nextDouble();
		
		System.out.println("Lütfen 2.Sayıyı Giriniz : ");
		sayi2=giris.nextDouble();
		
		System.out.println("Lütfen 3.Sayıyı Giriniz : ");
		sayi3=giris.nextDouble();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			if(sayi2>sayi3) {
				System.out.println(sayi1+ ">"+ sayi2 +">" +sayi3);
			}
			else {
				System.out.println(sayi1+ ">"+ sayi3 +">" +sayi2);
			}
		}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			if(sayi1>sayi3) {
				System.out.println(sayi2+ ">"+ sayi1 +">" +sayi3);
			}
			else {
				System.out.println(sayi2+ ">"+ sayi3 +">" +sayi1);
			}
		}
		
		else if(sayi3>sayi1 && sayi3>sayi2) {
			if(sayi1>sayi2) {
				System.out.println(sayi3+ ">"+ sayi1 +">" +sayi2);
			}
			else {
				System.out.println(sayi3+ ">"+ sayi2 +">" +sayi1);
			}
		}
		

	}

}
