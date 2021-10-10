package redhood.v5.operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class OperationFactoryTest {

    @Test
    public void should_return_add_operation_object_when_operator_is_add()
    {
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("add");
        assertThat(operation,instanceOf(AddOperation.class));

    }
    @Test
    public void should_return_sub_operation_object_when_operator_is_sub()
    {
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("sub");
        assertThat(operation,instanceOf(SubOperation.class));



    }
}