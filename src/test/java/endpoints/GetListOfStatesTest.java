package endpoints;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class GetListOfStatesTest {
    @Mock
    private GetListOfStates endpoint;
    private final String STATE1 = "state1";
    private final String STATE2 = "state2";
    private final String STATE3 = "state3";

    private Set<String> states = new HashSet<>();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        states.add(STATE1);
        states.add(STATE2);
        states.add(STATE3);
    }

    @Test
    public void getStates_returnList() {
        //GIVEN
        when(endpoint.getStates()).thenReturn(states);

        //WHEN
        Set<String> result = endpoint.getStates();

        //THEN
        Assert.assertTrue(result.containsAll(states));
    }

    @Test
    public void verifyState_validState_returnTrue() {
        //GIVEN
        when(endpoint.verifyState(STATE1)).thenReturn(true);

        //WHEN
        boolean result = endpoint.verifyState(STATE1);

        //THEN
        Assert.assertTrue(result);
    }

    @Test
    public void verifyState_invalidState_returnFalse() {
        //GIVEN
        when(endpoint.verifyState(anyString())).thenReturn(false);

        //WHEN
        boolean result = endpoint.verifyState(STATE1);

        //THEN
        Assert.assertFalse(result);
    }

    @Test
    public void verifyState_nullState_returnTrue() {
        //GIVEN
        //WHEN
        //THEN
    }

}
