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

public class GetListOfCitiesTest {
    @Mock
    private GetListOfCities endpoint;
    private final String CITY1 = "city1";
    private final String CITY2 = "city2";
    private final String CITY3 = "city3";

    private Set<String> cities = new HashSet<>();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cities.add(CITY1);
        cities.add(CITY2);
        cities.add(CITY3);
    }

    @Test
    public void getCity_returnList() {
        //GIVEN
        when(endpoint.getCities()).thenReturn(cities);

        //WHEN
        Set<String> result = endpoint.getCities();

        //THEN
        Assert.assertTrue(result.containsAll(cities));
    }

    @Test
    public void verifyCity_validCity_returnTrue() {
        //GIVEN
        when(endpoint.verifyCity(CITY1)).thenReturn(true);

        //WHEN
        boolean result = endpoint.verifyCity(CITY1);

        //THEN
        Assert.assertTrue(result);
    }

    @Test
    public void verifyCity_invalidCity_returnFalse() {
        //GIVEN
        when(endpoint.verifyCity(anyString())).thenReturn(false);

        //WHEN
        boolean result = endpoint.verifyCity(CITY1);

        //THEN
        Assert.assertFalse(result);
    }

    @Test
    public void verifyCity_nullCity_returnTrue() {
        //GIVEN
        //WHEN
        //THEN
    }
}
