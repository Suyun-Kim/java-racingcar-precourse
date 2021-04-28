import Utils.CarNameUtil;
import Utils.Validation;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    @Test
    void 자동차이름_5자_이내_테스트() {
        assertThat(Validation.checkLength(5)).isTrue();
        assertThat(Validation.checkLength(6)).isFalse();

    }

}
