package net.proselyte.basepatterns.structural.proxy;

public class ProxyProject {
    private String url;
    private RealProject realProject;


    public ProxyProject(String url) {
        this.url = url;
    }

}
