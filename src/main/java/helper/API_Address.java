package helper;

/**
 * Global API Addresses
 */
public class API_Address {
    public static String KEY = "208639a4-1558-45ec-9ac3-62fba6fd8de5";
    public static String COUNTRY_AND_KEY = "&country=USA&key=" + KEY;
    public static String State = "&state=";
    public static String LIST_OF_SUPPORTED_STATES = "http://api.airvisual.com/v2/states?country=USA&key=" + KEY;
    public static String LIST_OF_SUPPORTED_CITIES = "http://api.airvisual.com/v2/cities?state=";
    public static String GET_CITY_DATA = "http://api.airvisual.com/v2/city?city=";

    private String s;
    API_Address(String s) {
        this.s = s;
    }
}
