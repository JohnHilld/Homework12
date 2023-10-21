package threadSafeSingletoneBillPugh;

import java.util.Date;

public class AirVentilationController {

    private int airVentilationLevel;
    private long systemConnectionTime;

    private AirVentilationController() {
        airVentilationLevel = 0;

        Date date = new Date();
        systemConnectionTime = date.getTime();
    }

    private static class SingleHelper {
        private static final AirVentilationController INSTANCE = new AirVentilationController();
    }

    public static AirVentilationController getInstance() {
        return SingleHelper.INSTANCE;
    }

    public int getAirVentilationLevel() {
        return airVentilationLevel;
    }

    public long getSystemConnectionTime() {
        return systemConnectionTime;
    }

    public int increaseVentilation() {
        if (airVentilationLevel > 100) {
            return -1;
        }
        airVentilationLevel += 1;
        return airVentilationLevel;
    }

    public int decreaseVentilation() {
        if (airVentilationLevel < 0) {
            return -1;
        }
        airVentilationLevel -= 1;
        return airVentilationLevel;
    }

}
