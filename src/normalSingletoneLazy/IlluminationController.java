package normalSingletoneLazy;

public class IlluminationController {

    private static IlluminationController instance;
    private String controllerPort;

    private IlluminationController(String port) {
        controllerPort = port;
    }

    public static IlluminationController getInstance(String port) {

        if (instance == null) {
            instance = new IlluminationController(port);
        }
        return instance;
    }

    public String getControllerPort() {
        return controllerPort;
    }
}
