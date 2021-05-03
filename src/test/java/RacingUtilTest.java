import Utils.RacingUtil;
import car.Car;
import enums.MoveStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RacingUtilTest {

    private static Car car;
    private static List<Car> cars;

    @BeforeEach
    void setUp() {
        car = new Car("싼타페");
        car.setMoveCount(3);
    }

    @BeforeEach
    void setCars() {
        String[] carNames = {"싼타페", "쏘나타", "K5", "아이오닉"};
        Integer[] moveCounts = {1, 3, 3, 2};

        cars = new ArrayList<Car>();

        for(int i=0; i < carNames.length; i++) {
            car = new Car(carNames[i]);
            car.setMoveCount(moveCounts[i]);

            cars.add(car);
        }

    }

    @Test
    void 각_횟수마다_전진_출력_테스트() {
        assertThat(RacingUtil.printOutGame(car)).isEqualTo("싼타페 : ---");
    }

    @Test
    void 최대_전진_횟수_출력_테스트() {
        assertThat(RacingUtil.getMaxMoveCount(cars)).isEqualTo(3);
    }

    @Test
    void 게임_우승상태_체크_테스트() {
        assertThat(RacingUtil.setVictoryStatus(cars, 3).get(0).getMoveStatus()).isEqualTo(MoveStatus.NON_VICTORY);
        assertThat(RacingUtil.setVictoryStatus(cars, 3).get(1).getMoveStatus()).isEqualTo(MoveStatus.VICTORY);
        assertThat(RacingUtil.setVictoryStatus(cars, 3).get(2).getMoveStatus()).isEqualTo(MoveStatus.VICTORY);
        assertThat(RacingUtil.setVictoryStatus(cars, 3).get(3).getMoveStatus()).isEqualTo(MoveStatus.NON_VICTORY);
    }

    @Test
    void 경기_결과_출력_테스트() {
        cars = RacingUtil.setVictoryStatus(cars, 3);
        assertThat(RacingUtil.printGameResult(cars)).isEqualTo("쏘나타,K5가 최종 우승했습니다.");
    }



}
