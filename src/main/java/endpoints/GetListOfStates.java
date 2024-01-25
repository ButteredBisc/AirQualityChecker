package endpoints;

import apiConnection.API_Connection;
import helper.API_Address;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.HashSet;
import java.util.Set;

public class GetListOfStates {
    private API_Connection API = new API_Connection(API_Address.LIST_OF_SUPPORTED_STATES);
    private Set<String> states = new HashSet<>();
    public GetListOfStates() throws ParseException {
        JSONArray dataArr = API.getJSONArray("data");
        for(int i=0;i<dataArr.size();i++)
        {
            //Store the JSON objects in an array
            //Get the index of the JSON object
            JSONObject jsonObj = (JSONObject)dataArr.get(i);
            states.add((String) jsonObj.get("state"));
        }
        API.disconnectConnection();
    }

    public Set<String> getStates() {
        return new HashSet<>(states);
    }

    public boolean verifyState(String state) {
        return this.getStates().contains(state) ? true : false;
    }
}
