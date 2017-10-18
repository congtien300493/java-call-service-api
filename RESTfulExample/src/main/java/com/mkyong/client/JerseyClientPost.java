package com.mkyong.client;

import com.google.gson.Gson;
import com.mkyong.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

	public static void main(String[] args) {

		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://datapower:8082/checktaikhoanthauchi");

			String input = "{"+
							"\"refId\" : \"123fssdgsssd4dsfsff0gsftfddfdf81111d5\","+
							"\"ip\" : \"111.111.111.111\","+
							"\"device\" : \"Samsung Galaxy S5 (klte)\","+
							"\"platform\" : \"Android 4.4\","+
							"\"channel\":\"WWW\","+
							"\"userid\": 696322,"+
							"\"sohd\" : 95327,"+
							"\"tkchuyen\":1600399,"+
							"\"tkthuhuong\":1128,"+
							"\"thethuhuong\":\"4041695500752001\","+
							"\"loaigd\":\"CARD\""+
							"}";

			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);
		//	Gson gson = new Gson();
			
		//	Response resp = gson.fromJson(output, Response.class);
			//System.out.println("maloi = "+ resp.getMaloi());
			//System.out.println("noi dung = "+ resp.getNoidung());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
