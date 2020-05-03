package net.fusemc.core.scoreboard;

public class ScoreboardAPI {

    private static String display;
    private static String line1, line2, line3, line4, line5, line6, line7, line8, line9;
    private static boolean sidebar, teams;

    public static boolean isSidebar() {
        return sidebar;
    }

    public static boolean isTeams() {
        return teams;
    }

    public static void setSidebar(boolean sidebar) {
        ScoreboardAPI.sidebar = sidebar;
    }

    public static void setTeams(boolean teams) {
        ScoreboardAPI.teams = teams;
    }

    public static String getDisplay() {
        return display;
    }

    public static String getLine1() {
        return line1;
    }

    public static String getLine2() {
        return line2;
    }

    public static String getLine3() {
        return line3;
    }

    public static String getLine4() {
        return line4;
    }

    public static String getLine5() {
        return line5;
    }

    public static String getLine6() {
        return line6;
    }

    public static String getLine7() {
        return line7;
    }

    public static String getLine8() {
        return line8;
    }

    public static String getLine9() {
        return line9;
    }

    public static void setDisplay(String display) {
        ScoreboardAPI.display = display;
    }

    public static void setLine1(String line1) {
        ScoreboardAPI.line1 = line1;
    }

    public static void setLine2(String line2) {
        ScoreboardAPI.line2 = line2;
    }

    public static void setLine3(String line3) {
        ScoreboardAPI.line3 = line3;
    }

    public static void setLine4(String line4) {
        ScoreboardAPI.line4 = line4;
    }

    public static void setLine5(String line5) {
        ScoreboardAPI.line5 = line5;
    }

    public static void setLine6(String line6) {
        ScoreboardAPI.line6 = line6;
    }

    public static void setLine7(String line7) {
        ScoreboardAPI.line7 = line7;
    }

    public static void setLine8(String line8) {
        ScoreboardAPI.line8 = line8;
    }

    public static void setLine9(String line9) {
        ScoreboardAPI.line9 = line9;
    }
}
