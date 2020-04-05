package patterns.nullobject;

import com.google.inject.spi.Message;

public class RouterFactory {
        public static Router getRouterForMessage(Message message) {
            return new NullRouter();
        }
    }