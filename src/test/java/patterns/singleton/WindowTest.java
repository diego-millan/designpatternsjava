package patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class WindowTest {
    @Test
    public void whenTryInstanceMoreThanOnceThenReturnSameObject() {
        Window window = Window.getInstance();
        Window window2 = Window.getInstance();
        Window window3 = Window.getInstance();

        Assert.assertSame(window, window2);
        Assert.assertSame(window3, window2);
    }

}
