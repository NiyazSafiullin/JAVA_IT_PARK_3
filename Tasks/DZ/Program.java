import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int x=scanner.nextInt();
		int y1=x%5000;
		int y2=x/5000;
				System.out.println("Купюр по 5000 рублей" + " " + y2+ " " + "шт.");
				int z1=y1%1000;
				int z2=y1/1000;
				System.out.println("Купюр по 1000 рублей" + " " + z2+ " " + "шт.");
				int t1=z1%500;
				int t2=z1/500;
				System.out.println("Купюр по 500 рублей" + " " + t2+ " " + "шт.");
	int w1=t1%100;
				int w2=t1/100;
				System.out.println("Купюр по 100 рублей" + " " + w2+ " " + "шт.");
				int p1=w1%50;
				int p2=w1/50;
				System.out.println("Купюр по 50 рублей" + " " + p2+ " " + "шт..");
				int b1=p1%10;
				int b2=p1/10;
				System.out.println("Купюр по 10 рублей" + " " + b2+ " " + "шт.");
				int j1=b1%5;
				int j2=b1/5;
				System.out.println("Купюр по 5 рублей" + " " + j2+ " " + "шт.");
				int k1=j1%2;
				int k2=j1/2;
				System.out.println("Купюр по 2 рубля" + " " + k2+ " " + "шт.");
				int m1=k1%1;
				int m2=k1/1;
				System.out.println("Купюр по 1 рублю" + " " + m2+ " " + "шт.");
	}
}