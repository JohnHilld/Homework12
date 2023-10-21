package normalSingletoneLazy;

public class LazySingleton {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        IlluminationController illumination1 = IlluminationController.getInstance("192.168.111.012");
        IlluminationController illumination2 = IlluminationController.getInstance("192.168.111.143");
        System.out.println(illumination1.getControllerPort());
        System.out.println(illumination2.getControllerPort());
    }
}
