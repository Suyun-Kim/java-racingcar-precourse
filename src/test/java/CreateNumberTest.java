import Utils.CreateNumber;
import Utils.Validation;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateNumberTest {

    @Test
    void 랜덤_숫자_생성테스트() {
        assertThat(CreateNumber.generateRandomNumber()).isNotNull();
    }

    @Test
    void 랜덤_숫자_생성_범위_테스트() {
        assertThat(Validation.checkCountRange(CreateNumber.generateRandomNumber())).isTrue();
    }

}
