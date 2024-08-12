package net.proselyte.basepatterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger(){

        return programLogger;
    }

    private ProgramLogger(){

    }

}