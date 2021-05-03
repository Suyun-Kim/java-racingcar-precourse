import Utils.CarUtil;
import vo.Car;
import enums.MoveStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarUtilTest {

    private static Car car;

    @BeforeEach
    void setUp() {
        car = new Car("싼타페");
        car.setMoveStatus(MoveStatus.MOVE);
    }

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

    @Test
    void 자동차_전진_카운트_테스트() {
        assertThat(CarUtil.addMoveCount(car)).isEqualTo(1);
    }


}
