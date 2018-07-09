package com.guru.hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieDataBase {

	private static final String movieDatabase = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";

	public static String[] getTitles(String substr) {
		List<String> titles = new ArrayList<>();
		int totalPages = 1;
		JSONArray data = null;
		JSONObject jsonObj = null;
		String response = null;
		
		try{
			StringBuilder urlBuilder = new StringBuilder();
			urlBuilder.append(movieDatabase).append(substr);
			
			response = getResponse(urlBuilder.toString());
			jsonObj = new JSONObject(response.toString());

			totalPages = jsonObj.getInt("total_pages");

			for (int i = 1; i <= totalPages; i++) {
				if (i != 1) {
					response = getResponse(urlBuilder.toString() + "&page=" + i);
					jsonObj = new JSONObject(response.toString());
				}
				data = jsonObj.getJSONArray("data");
				for (int j = 0; j < data.length(); j++) {
					titles.add(data.getJSONObject(j).getString("Title"));
				}
			}
			
		}
		catch(Exception e){
			System.out.println("Error");
		}
		Collections.sort(titles);
		String[] titlesArray = new String[titles.size()];
		titlesArray = titles.toArray(titlesArray);
		return titlesArray;
	}

	public static String getResponse(String urlString){
		
		StringBuilder response = new StringBuilder();
		
		try{
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			int responseCode = conn.getResponseCode();
			if(responseCode == 200){
				BufferedReader buf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line = null;
				while((line=buf.readLine())!=null){
					response.append(line);
				}
				buf.close();
			}
		}
		catch(Exception e){
			System.out.println("Exception while accessing the url");
		}
		return response.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] titles = getTitles("man");
		for(String s: titles)
			System.out.println(s);

	}

}
