package bowling.step4.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NameTest {
    @Test
    void 이름이_3글자이상으로_입력되었을_때() {
        Assertions.assertThatThrownBy(() -> new Name("ryan"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Name.NAME_LENGTH_EXCEPTION);
    }


    @Test
    void 이름이_영어가아닌문자로_입력되었을_때() {
        Assertions.assertThatThrownBy(() -> new Name("라이언"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Name.NAME_ENGLISH_EXCEPTION);
    }

    @Test
    void 이름이_빈값일_때() {
        Assertions.assertThatThrownBy(() -> new Name(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(Name.NAME_BLANK_EXCEPTION);
    }
}