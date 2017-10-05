public class MAxi {
    public static void main(String[] args) {

        int[] Array = {1, 2, 3, 4, 5, 6};
        int imax=0;
        int max;
        int min;
        int imin=0;

        int temp;
        max = Array[0];
        min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
                imax=i;
                           }
            if (Array[i] < min) {
                min = Array[i];
                imin=i;

            }





        }
        Array[imax]=min;
        Array[imin]=max;

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
        }
        System.out.println();
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);

    }

}