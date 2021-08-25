package dev.eroglu;

public class Father implements Parent{
    private String name;

    @Override
    public String talkWithChildren() {
        return "Earn your own money";
    }

}
