package redhood.v5.operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddOperationTest {

    @Test
    public void should_add_poestive_values()
    {
        AddOperation addOperation=new AddOperation();
        double result=addOperation.execute(new double[]{5.0,6.2});

        assertThat(result,is(11.2));
    }

    @Test
    public void should_add_zeros()
    {
        AddOperation addOperation=new AddOperation();
        double result=addOperation.execute(new double[]{0.0,0.0});

        assertThat(result,is(0.0));
    }

    @Test
    public void should_add_negative_numbers()
    {
        AddOperation addOperation=new AddOperation();
        double result=addOperation.execute(new double[]{-7.0,-3.2});

        assertThat(result,is(-10.2));
    }
}