package mti.com.telegram.vo;

import mti.com.telegram.model.FieldType;
import mti.com.telegram.model.Kind;
import mti.com.telegram.model.TrimType;
import mti.com.telegram.model.annotation.FIELD;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelegramTail {
    @FIELD(
            kind = Kind.TAIL,
            length = 2,
            type = FieldType.STRING,
            trim = TrimType.RTRIM
    )
    public String tail;
}
