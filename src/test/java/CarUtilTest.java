import Utils.CarUtil;
import enums.MoveStatus;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarUtilTest {

    @Test
    void 문자열_쉼표_구분_배열_반환_테스트() {
        assertThat(CarUtil.divideByCommas("쏘나타,그랜져,스타렉스").size()).isEqualTo(3);
        assertThat(CarUtil.divideByCommas("쏘나타,그랜져").size()).isEqualTo(2);
    }

    @Test
    void 자동차_상태_변경_테스트() {
        assertThat(CarUtil.changeCarStatus(1)).isEqualTo(MoveStatus.STOP);
        assertThat(CarUtil.changeCarStatus(2)).isEqualTo(MoveStatus.STOP);
        assertThat(CarUtil.changeCarStatus(3)).isEqualTo(MoveStatus.STOP);
        assertThat(CarUtil.changeCarStatus(4)).isEqualTo(MoveStatus.MOVE);
        assertThat(CarUtil.changeCarStatus(5)).isEqualTo(MoveStatus.MOVE);
        assertThat(CarUtil.changeCarStatus(6)).isEqualTo(MoveStatus.MOVE);
        assertThat(CarUtil.changeCarStatus(7)).isEqualTo(MoveStatus.MOVE);
        assertThat(CarUtil.changeCarStatus(8)).isEqualTo(MoveStatus.MOVE);
        assertThat(CarUtil.changeCarStatus(9)).isEqualTo(MoveStatus.MOVE);
    }


}
