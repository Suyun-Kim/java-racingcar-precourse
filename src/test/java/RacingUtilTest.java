import Utils.RacingUtil;
import car.Car;
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
        car.setMoveCount(2);
    }

    @Test
    void 각_횟수마다_전진_출력_테스트() {
        assertThat(RacingUtil.printOutGame(car)).isEqualTo("싼타페 : --");
    }




}
