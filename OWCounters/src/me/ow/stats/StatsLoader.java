package me.ow.stats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import me.ow.common.Constants;
import me.ow.common.Heroes;

public class StatsLoader {


	public static void main(String[] args) {
		HtmlCleaner htmlCleaner = new HtmlCleaner();

		EnumSet<Heroes> heroes = EnumSet.allOf(Heroes.class);

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(Constants.baseUrl+ Heroes.ANA);

		// add request header
		request.addHeader("User-Agent", "USER_AGENT");
		HttpResponse response;
		try {
			response = client.execute(request);
			System.out.println("Response Code : "
					+ response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(
					new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			
			TagNode nodes = htmlCleaner.clean(result.toString());
//			TagNode counters =nodes.findElementByAttValue("class", "counters", false, false);
			Object[] counters = nodes.evaluateXPath("//div[@class='counters']");
			
			if(counters.length>0){
				System.out.println(counters.length);
					String strong = ((TagNode)counters[0]).getText().toString();
					String weak = ((TagNode)counters[1]).getText().toString();
					
					String[] strongAr = strong.split(" +");
					System.out.println(strongAr.length);
					for (int i = 0; i < strongAr.length; i++) {
						System.out.println(strongAr[i]);
						
					}
//					System.out.println("strong");
//					System.out.println(strong);
//					System.out.println("weak");
//					System.out.println(weak);
			}
			
			System.out.println(counters);
//			System.out.println(result);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPatherException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
