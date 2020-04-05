package patterns.nullobject;

import com.google.inject.spi.Message;

public class RoutingHandler {

    public void handle(Iterable<Message> messages) {

        for (Message msg : messages) {
            Router router = RouterFactory.getRouterForMessage(msg);
            router.route(msg);
        }
    }
}
