package apiConnection;

import exceptions.ClientException;
import exceptions.ServerException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class API_Connection {
    private URL url;
    private HttpURLConnection conn;

    private String initialJson;

    public API_Connection(String address) {
        try {
            this.url = new URL(address);
            conn = (HttpURLConnection) url.openConnection();

            //Connection setup
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            //Connection Test
            conn.connect();
            verifyConnection(conn.getResponseCode());
            initialJson = initialJSON();


        }catch (MalformedURLException e){
        e.printStackTrace();
        } catch (Exception e){
        e.printStackTrace();
        }

    }

    private void verifyConnection (int responseCode) throws RuntimeException {
        String message = "Response Code: " + responseCode;
        if (responseCode >= 500){
                throw new ServerException(message);
        }else if (responseCode >= 400) {
            throw new ClientException(message);
        }
    }

    public void disconnectConnection(){conn.disconnect();}

    public String initialJSON() throws IOException {
        String json = "";
        Scanner sc = new Scanner(url.openStream());
        while (sc.hasNext()) {
            json += sc.nextLine();
        }
        //TODO: DELETE PRINTLN'S
        System.out.println("\nJSON data in string format");
        System.out.println(json);
        sc.close();
        return json;
    }
    //TODO: Null check

    /**
     * Get Json segment of API
     * @param key
     * @return JSON Array
     * @throws ParseException
     */
    public JSONArray getJSONArray(String key) throws ParseException {
        try {
            JSONParser parse = new JSONParser();
            JSONObject jobj = (JSONObject) parse.parse(initialJson);
            return (JSONArray) jobj.get(key);
        }catch (ParseException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

