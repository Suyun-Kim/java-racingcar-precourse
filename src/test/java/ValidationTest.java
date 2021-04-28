import Utils.Validation;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    @Test
    void 자동차이름_5자_이내_테스트() {
        assertThat(Validation.checkNameLength(5)).isTrue();
        assertThat(Validation.checkNameLength(6)).isFalse();

    }

    @Test
    void 숫자_범위_테스트() {
        assertThat(Validation.checkCountLength(1)).isTrue();
        assertThat(Validation.checkCountLength(9)).isTrue();
        assertThat(Validation.checkCountLength(10)).isFalse();
        assertThat(Validation.checkCountLength(0)).isFalse();
    }

}
