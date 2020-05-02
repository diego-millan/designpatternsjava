package patterns.adapter;

import patterns.adapter.domain.SMS;

public interface SMSSender {
    public boolean sendSMS(SMS sms);
}
