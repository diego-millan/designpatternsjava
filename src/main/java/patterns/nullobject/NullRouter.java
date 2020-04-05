package patterns.nullobject;

import com.google.inject.spi.Message;

public class NullRouter implements Router {

    @Override
    public void route(Message message) {
        // DO NOTHING
    }
}
