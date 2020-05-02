package patterns.adapter;

import patterns.adapter.exception.SMSException;

public interface SMSSenderV2 {
    void sendSMS(String receiver, String sender, String[] msgs) throws SMSException;
}
