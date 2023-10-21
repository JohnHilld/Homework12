package normalSingletoneStaticBlock;

public class OvenController {

    private static OvenController instance;

    private OvenController() {}

    static {
        try {
            instance = new OvenController();
        } catch (Exception e) {
            throw new RuntimeException("Exception in creating instance");
        }
    }
    public static OvenController getInstance() {
        return instance;
    }
}
