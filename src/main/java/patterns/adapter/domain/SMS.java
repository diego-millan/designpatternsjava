package patterns.adapter.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SMS {
    private String receiver;
    private String sender;
    private String text;
}
