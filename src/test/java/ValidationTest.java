import Utils.Validation;
import static org.assertj.core.api.Assertions.assertThat;

import vo.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ValidationTest {

    private List<Car> cars;

    @BeforeEach
    void setUp() {
        cars = new ArrayList<>();
        cars.add(new Car("싼타페"));
        cars.add(new Car("쏘나타"));
    }


    @Test
    void 자동차이름_5자_이내_테스트() {
        assertThat(Validation.checkNameLength(5)).isTrue();
        assertThat(Validation.checkNameLength(6)).isFalse();

    }

    @Test
    void 자동차이름_중복_테스트() {
        assertThat(Validation.checkDuplicate(cars)).isTrue();
    }

    @Test
    void 자동차이름_입력_여부_테스트() {
        assertThat(Validation.checkIsEmptyCarName("싼타페,")).isTrue();
        assertThat(Validation.checkIsEmptyCarName("")).isFalse();
    }

    @Test
    void 숫자_범위_테스트() {
        assertThat(Validation.checkCountRange(1)).isTrue();
        assertThat(Validation.checkCountRange(9)).isTrue();
        assertThat(Validation.checkCountRange(10)).isFalse();
        assertThat(Validation.checkCountRange(0)).isFalse();
    }


}
