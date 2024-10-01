package mti.com.telegram.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelegramOutputUserData {
    Object output;
    List<Object> outputList;
    TelegramHeader header;
    TelegramMessage message;

}
