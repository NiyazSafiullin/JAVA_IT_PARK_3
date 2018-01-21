package com.company;
class NewThread implements Runnable {
public NewThread() {

}
    @Override
    public void run() {
    for (int i=1;i<5;i++) {
        System.out.println("Значение цикла дочернего потока - " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    }
}
class OneThread {
    public OneThread() {
        System.out.println("Запускаем счетчик.");
        Runnable r = new NewThread();
        Thread t = new Thread(r);

        for (int i = 1; i <= 10; i++) {
            t.start();
            Thread.yield();
            System.out.println(t.getPriority());
            System.out.println("Пока выполняется цикл счетчика–                Выведем это сообщение.");
            System.out.println("Ну и наверно посчитаем значение Pi в квадрате: " +
                    Math.PI * Math.PI);
        }
    }


}
public class Main {

    public static void main(String[] args) {
       OneThread oneThread=new OneThread();
    }

}
