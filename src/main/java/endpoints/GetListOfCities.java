package endpoints;

import apiConnection.API_Connection;
import helper.API_Address;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.HashSet;
import java.util.Set;

public class GetListOfCities {
    private API_Connection API = new API_Connection(API_Address.LIST_OF_SUPPORTED_CITIES + "Ohio" +
            API_Address.COUNTRY_AND_KEY);
    private Set<String> cities = new HashSet<>();
    public GetListOfCities() throws ParseException {
        JSONArray dataArr = API.getJSONArray("data");
        for(int i=0;i<dataArr.size();i++)
        {
            //Store the JSON objects in an array
            //Get the index of the JSON object
            JSONObject jsonObj = (JSONObject)dataArr.get(i);
            cities.add((String) jsonObj.get("city"));
        }
        API.disconnectConnection();
    }

    public Set<String> getCities() {
        return new HashSet<>(cities);
    }

    public boolean verifyCity(String city) {
        return this.getCities().contains(city) ? true : false;
    }
}
