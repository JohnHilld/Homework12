package normalSingletoneStaticBlock;

public class StaticBlockSingleton {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        OvenController oven1 = OvenController.getInstance();
        OvenController oven2 = OvenController.getInstance();
        System.out.println(oven1.hashCode());
        System.out.println(oven2.hashCode());
        System.out.println("Check if the same: " + oven1.equals(oven2));
    }
}
