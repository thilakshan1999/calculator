package redhood.v5.operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DivOperationTest {
    @Test
    public void should_divide_poestive_values() throws InvalidOperatioException {
        DivOperation divOperation=new DivOperation();
        double result=divOperation.execute(new double[]{6.0,2.0});

        assertThat(result,is(3.0));
    }

    @Test
    public void should_not_divide_by_zero() throws InvalidOperatioException {
        DivOperation divOperation=new DivOperation();
        double result=divOperation.execute(new double[]{6.0,0.0});

        assertThat(result,is(0.0));
    }

}