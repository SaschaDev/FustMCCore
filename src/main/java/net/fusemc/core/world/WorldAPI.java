package net.fusemc.core.world;

public class WorldAPI {

    private static boolean PortalCreate;
    private static boolean TimeSkip; //done
    private static boolean LightningStrike; //done
    private static boolean Thunder; //done
    private static boolean WeatherChange; //done


    public static void setLightningStrike(boolean lightningStrike) {
        LightningStrike = lightningStrike;
    }

    public static void setPortalCreate(boolean portalCreate) {
        PortalCreate = portalCreate;
    }

    public static void setThunder(boolean thunder) {
        Thunder = thunder;
    }

    public static void setTimeSkip(boolean timeSkip) {
        TimeSkip = timeSkip;
    }

    public static void setWeatherChange(boolean weatherChange) {
        WeatherChange = weatherChange;
    }

    public static boolean isLightningStrike() {
        return LightningStrike;
    }

    public static boolean isPortalCreate() {
        return PortalCreate;
    }

    public static boolean isThunder() {
        return Thunder;
    }

    public static boolean isTimeSkip() {
        return TimeSkip;
    }

    public static boolean isWeatherChange() {
        return WeatherChange;
    }
}
