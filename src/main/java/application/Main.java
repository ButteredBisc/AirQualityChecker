package application;

import apiConnection.API_Connection;
import endpoints.GetListOfCities;
import endpoints.GetListOfStates;
import org.json.simple.parser.ParseException;


public class Main {
    private static API_Connection api;

    public static void main(String[] args) throws ParseException {
       /*
        api = new API_Connection(API_Address.LIST_OF_SUPPORTED_STATES);


        JSONArray dataArr = api.getJSONArray("data");
        Set<String> countries = new HashSet<>();
        for(int i=0;i<dataArr.size();i++)
        {
            //Store the JSON objects in an array
            //Get the index of the JSON object
            JSONObject jsonobj_1 = (JSONObject)dataArr.get(i);
            countries.add((String) jsonobj_1.get("state"));

        }
        */
        GetListOfStates states = new GetListOfStates();
        GetListOfCities city = new GetListOfCities();

        if (states.verifyState("Ohio")) {
            System.out.println("Ohio: true");
        }
        else
            System.out.println("Ohio: false");

        if (city.verifyCity("Akron")) {
            System.out.println("Akron: true");
        }
        else
            System.out.println("Akron: false");

        //api.disconnectConnection();
    }
}