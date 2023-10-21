package threadSafeSingletoneBillPugh;

public class BillPughSingleton {

    public static void main(String[] args) {
        System.out.println("If you see the same value of \"System start\", then singleton was reused (yay!)" + "\n" +
                "If you see different values of \"System start\", then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread thread1 = new Thread(new ThreadVent1());
        Thread thread2 = new Thread(new ThreadVent2());
        Thread thread3 = new Thread(new ThreadVent3());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class ThreadVent1 implements Runnable {
        @Override
        public void run() {
            AirVentilationController vent = AirVentilationController.getInstance();
            System.out.println("Thread1 [System start " + vent.getSystemConnectionTime() + "] Ventilation level is: " + vent.increaseVentilation());
        }
    }

    static class ThreadVent2 implements Runnable {
        @Override
        public void run() {
            AirVentilationController vent = AirVentilationController.getInstance();
            System.out.println("Thread2 [System start " + vent.getSystemConnectionTime() + "] Ventilation level is: " + vent.increaseVentilation());
        }
    }

    static class ThreadVent3 implements Runnable {
        @Override
        public void run() {
            AirVentilationController vent = AirVentilationController.getInstance();
            System.out.println("Thread3 [System start " + vent.getSystemConnectionTime() + "] Ventilation level is: " + vent.increaseVentilation());
        }
    }
}
