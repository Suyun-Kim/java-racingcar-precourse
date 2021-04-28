import Utils.CarUtil;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarUtilTest {

    @Test
    void 문자열_쉼표_구분_배열_반환_테스트() {
        assertThat(CarUtil.divideByCommas("쏘나타,그랜져,스타렉스").size()).isEqualTo(3);
        assertThat(CarUtil.divideByCommas("쏘나타,그랜져").size()).isEqualTo(2);
    }
}
