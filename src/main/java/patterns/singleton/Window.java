package patterns.singleton;

public final class Window {
    private static Window instance;

    private Window(){}

    public static synchronized Window getInstance() {
        if (instance == null) {
            instance = new Window();
        }
        return instance;
    }
}
