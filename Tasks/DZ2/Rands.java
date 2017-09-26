import java.util.Scanner;
 
public class Rands {
   public static void main(String[] args) {
 Scanner scanner= new Scanner(System.in);
 int[] mas = new int[999]; 
 int sum=0; int chislo=0; int raznisa;
 
 
System.out.println("Введите любое целое число от 1 до 1000: ");
  for(int i=0;i<mas.length;i++) {
	  mas[i]=scanner.nextInt();
	  chislo=chislo+mas[i];
	 
	   }
	   // System.out.println("Сумма чисел массива: " + chislo);
	 int index=0;
	 for(int j=0;j<mas.length;j++) {
	 if(index<=mas.length) {
		 index++;
		  sum=sum+index;
	 }
	 }
  
	    raznisa=sum-chislo;
	   System.out.println("Вы не ввели число: " + raznisa);
   }
}