package patterns.nullobject;

import com.google.inject.spi.Message;

public interface Router {
    void route(Message message);
}
