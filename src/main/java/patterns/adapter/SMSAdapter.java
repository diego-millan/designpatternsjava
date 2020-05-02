package patterns.adapter;

import patterns.adapter.domain.SMS;
import patterns.adapter.exception.SMSException;

public class SMSAdapter implements SMSSender {

    private static final int TEXT_MAXIMUM_SIZE = 160;
    private SMSSenderV2 SMSsenderV2;

    public SMSAdapter(SMSSenderV2 SMSsenderV2) {
        this.SMSsenderV2 = SMSsenderV2;
    }

    public boolean sendSMS(SMS sms) {
        String receiver = sms.getReceiver();
        String sender = sms.getSender();
        String[] texts = splitMessages(sms.getText());

        boolean sent = true;

        try {
            SMSsenderV2.sendSMS(receiver, sender, texts);
        } catch (SMSException e) {
            sent = false;
        }
        return sent;
    }
    
    private String[] splitMessages(String text) {
        int size = text.length();

        int amount = (size % TEXT_MAXIMUM_SIZE == 0) ? size / TEXT_MAXIMUM_SIZE : size / TEXT_MAXIMUM_SIZE + 1;

        String[] messages = new String[amount];

        for (int i = 0; i < amount; i++) {
            int min = i*TEXT_MAXIMUM_SIZE;

            int max = (i == amount-1) ? size : (i+1) * TEXT_MAXIMUM_SIZE;

            messages[i] = text.substring(min, max);
        }

        return  messages;
    }
}
