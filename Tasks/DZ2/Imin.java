import java.util.Scanner;
import static java.lang.Math.*;
 
public class Imin {
   public static void main(String[] args) {
 Scanner scanner= new Scanner(System.in);
 int[] mas = new int[10]; 
 int sum=0; int chislo=0; int raznisa;int min;
 
 
System.out.println("Введите любое целое число от 1 до 1000: ");
  for(int i=0;i<mas.length;i++) {
	  mas[i]=scanner.nextInt();
	  chislo=chislo+mas[i];
	
	 //System.out.println("Минимальное число массива: " + imin);
	   }
	   // System.out.println("Сумма чисел массива: " + chislo);
	 
	 for(int j=0;j<mas.length;j++) {
		 int imin=mas[j];
		//System.out.println(Math.min(imin));
		  
	 }
	System.out.println(Math.max(12,44));
	 
	 // System.out.println("Минимальное число массива: " + min);
   //System.out.println("Минимальное число массива: " + imin);
	    raznisa=sum-chislo;
	//   System.out.println("Вы не ввели число: " + raznisa);
   }
}