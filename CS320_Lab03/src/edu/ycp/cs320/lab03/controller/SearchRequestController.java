package edu.ycp.cs320.lab03.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.ycp.cs320.lab03.model.SearchRequest;

public class SearchRequestController {
	
	private SearchRequest model;

	public void setModel(SearchRequest model) {
		// TODO Auto-generated method stub
		this.model = model;
	}
	
	public void webScraper(String checkIn, String checkOut) {
		// TODO Auto-generated method stub
		Document doc;
		try {
			//String checkIn = "2016-04-12";
		    //String checkOut= "2016-04-16";
			//doc = Jsoup.connect("http://www.booking.com/searchresults.html?label=gen173nr-1FCAEoggJCAlhYSDNiBW5vcmVmcgV1c192YYgBAZgBMbgBDMgBD9gBAegBAfgBAqgCAw;sid=c7ddbaef979b3e3d4c98b522ade5707c;dcid=4;class_interval=1;dest_id=20053799;dest_type=city;group_adults=2;group_children=0;label_click=undef;no_rooms=1;offset=0;qrhpp=8eab35da39b929d7c4f878b28326b7b3-city-0;review_score_group=empty;room1=A%2CA;sb_price_type=total;score_min=0;si=ai%2Cco%2Cci%2Cre%2Cdi;src=index;ss=Baltimore;ssb=empty;srpos=1;origin=search").get(); 
			doc = Jsoup.connect("http://www.booking.com/searchresults.html?label=gen173nr-1FCAEoggJCAlhYSDNiBW5vcmVmcgV1c192YYgBAZgBMbgBDMgBD9gBAegBAfgBAqgCAw&sid=c7ddbaef979b3e3d4c98b522ade5707c&dcid=4&checkin="+checkIn+"&checkout="+checkOut+"&city=20053799&class_interval=1&dcsc=2&dtdisc=0&group_adults=2&group_children=0&hlrd=0&hyb_red=0&inac=0&label_click=undef&nha_red=0&no_rooms=1&postcard=0&redirected_from_city=0&redirected_from_landmark=0&redirected_from_region=0&review_score_group=empty&room1=A%2CA&sb_price_type=total&score_min=0&ss_all=0&ssb=empty&sshis=0&order=score").get();
			String title = doc.title();
			System.out.println("Title: " + title);
			
			 // get all links in page
		     // Elements links = doc.select("a[href]");
		     // for (Element link : links) {
		        //get the value from the href attribute
		      //  System.out.println("\nlink: " + link.attr("href"));
		      //  System.out.println("text: " + link.text());
		      //}
			  //Elements hotels = doc.select(#);
		      Elements hotels = doc.select("a.hotel_name_link.url");
		      Elements prices = doc.select("b");
		      Elements rooms = doc.select("span.room_link");
		      
		      System.out.println("First Hotel: " +hotels.get(0).text());
		      System.out.println("First Hotel: " + prices.get(0).text());
		      
		      ArrayList<String> hotelNames = new ArrayList<String>();
		      hotelNames.add(hotels.get(0).text());
		      
		      for(int i = 0; i < 15; i++) {   
		    	    System.out.println("Hotel: " + hotels.get(i).text());
		    	    System.out.println("Price: " + prices.get(i).text());
		    	    System.out.println("Room type: " + rooms.get(i).text());
		      } 
		      
		      //for (Element hotel : hotels) {
		        //get the value from the href attribute
		        //System.out.println("\nlink: " + link.attr("href"));
		    	//System.out.println("Hotel: " + link.text());
		      //}
		      for (Element price : prices) {
			    //System.out.println("Price: " + price.text());
			  }
		      for (Element room : rooms) {
				  //  System.out.println("Room type: " + room.text());
		      }
			
		     // Elements xxxDivs = doc.select("div.answer[name=ss]");
		      //System.out.println("hotel: " + xxxDivs.text());
		      
		      
		    		  
		      //Document doc1 = (Document) Jsoup.connect("http://www.booking.com/searchresults.html?label=gen173nr-1FCAEoggJCAlhYSDNiBW5vcmVmcgV1c192YYgBAZgBMbgBDMgBD9gBAegBAfgBAqgCAw&sid=c7ddbaef979b3e3d4c98b522ade5707c&dcid=4&checkin="+checkIn+"&checkout="+checkOut+"&city=20053799&class_interval=1&dcsc=2&dtdisc=0&group_adults=2&group_children=0&hlrd=0&hyb_red=0&inac=0&label_click=undef&nha_red=0&no_rooms=1&postcard=0&redirected_from_city=0&redirected_from_landmark=0&redirected_from_region=0&review_score_group=empty&room1=A%2CA&sb_price_type=total&score_min=0&ss_all=0&ssb=empty&sshis=0&order=score")
		    		//  .data("ss", "Harrisburg, Pennsylvania, USA")
		    		  // and other hidden fields which are being passed in post request.
		    		//  .userAgent("Mozilla")
		    		//  .post();
		    		  // System.out.println(doc1); // will print html source of homepage of facebook.
		      
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
}
