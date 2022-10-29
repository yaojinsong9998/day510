/**
 * @author: 86152
 * @date: 2021/5/10 16:26
 * @description:
 */


public class FirstThreadTest extends Thread {

    int i = 0;

    //重写run方法，run方法的方法体就是现场执行体
    public void run() {
        for (; i < 200; i++) {
            System.out.println(getName() + "  " + i);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "  : " + i);
            if (i == 50) {
                new FirstThreadTest().start();
                new FirstThreadTest().start();
            }
        }
    }


}