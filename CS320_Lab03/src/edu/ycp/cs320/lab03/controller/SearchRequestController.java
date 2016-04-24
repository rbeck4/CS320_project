package edu.ycp.cs320.lab03.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import edu.ycp.cs320.lab03.model.SearchRequest;
//import edu.ycp.cs320.lab03.model.Results;

public class SearchRequestController {
	
	private SearchRequest model;
	//private Results modelA;

	public void setModel(SearchRequest model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

	public void webScraper(String checkInD, String checkInM, String checkOutD, String checkOutM, String city) {
		// TODO Auto-generated method stub
		//Document doc;
		try {
			//doc =null;
			//String city = "Baltimore";		
			//connect to booking.com baltimore hotels website, for inputed dates of stay
			if (city.equals("Baltimore")){
				Document doc = Jsoup.connect("http://www.booking.com/searchresults.en-us.html?aid=309654&label=booking-be-en-us-3SqKhEWLtwZZHncJh*yhgQS63640052092%3Apl%3Ata%3Ap1%3Ap2812%2C000%3Aac%3Aap1o1%3Aneg%3Afi%3Atikwd-2558630230%3Alp9006756%3Ali%3Adec%3Adm&sid=2ca0030b3e43ab5cce864ce6095bbbb7&dcid=12&checkin_monthday="+checkInD+"&checkin_year_month=2016-"+checkInM+"&checkout_monthday="+checkOutD+"&checkout_year_month=2016-"+checkOutM+"&city=20053799&class_interval=1&dtdisc=0&group_adults=2&group_children=0&hlrd=0&hyb_red=0&inac=0&label_click=undef&nha_red=0&no_rooms=1&postcard=0&redirected_from_city=0&redirected_from_landmark=0&redirected_from_region=0&review_score_group=empty&room1=A%2CA&sb_price_type=total&score_min=0&si=ai%2Cco%2Cci%2Cre%2Cdi&ss=Baltimore&ss_all=0&ssb=empty&sshis=0&ssne=Baltimore&ssne_untouched=Baltimore&order=score&tfl_cwh=1").get();
			//doc = Jsoup.connect("https://www.expedia.com/Hotel-Search?#destination=Baltimore+(and+vicinity),+Maryland,+United+States+of+America&startDate="+checkIn+"&endDate="+checkOut+"&adults=2&regionId=178235&sort=guestRating").get();
				 //scrape hotel names, prices, and room types.
			      Elements hotels = doc.select("a.hotel_name_link.url");
				 // Elements hotels = doc.select("span.hotelName");
			      Elements prices = doc.select("b");
			      //Elements prices = doc.select("span.actualPrice.fakeLink");
			      Elements rooms = doc.select("span.room_link");
			      //Elements rooms = doc.select("span.room_link");
			      
			      ArrayList<String> hotelNames = new ArrayList<String>();
			      ArrayList<String> hotelPrices = new ArrayList<String>();
			      ArrayList<String> hotelRooms = new ArrayList<String>();
			      
			      //print to console scraped info
			      for(int i = 0; i < 15; i++) {   
			    	    System.out.println("Hotel: " + hotels.get(i).text());
			    	    System.out.println("Price: " + prices.get(i).text());
			    	    System.out.println("Room type: " + rooms.get(i).text());
			    	    hotelNames.add(hotels.get(i).text());
			    	    hotelPrices.add(prices.get(i).text());
			    	    hotelRooms.add(rooms.get(i).text());
			      } 
				
			      
			      //model.setHotelNames(hotelNames);
			      model.setHotelNames(hotelNames); 
			      model.setPrices(hotelPrices); 
			      model.setRooms(hotelRooms); 
			      System.out.println(model.getHotelNames().get(1));
			      System.out.println(model.getPrices().get(1));
			      System.out.println(model.getRooms().get(1));
			
			}
			if (city.equals("Harrisburg")){
				Document doc = Jsoup.connect("http://www.booking.com/searchresults.html?label=gen173nr-1FCAEoggJCAlhYSDNiBW5vcmVmcgV1c19wYYgBAZgBMbgBDMgBFNgBAegBAfgBAqgCAw&sid=6add7dba32178a3738a8ae3c613945ff&dcid=1&checkin_monthday="+checkInD+"&checkin_year_month=2016-"+checkInM+"&checkout_monthday="+checkOutD+"&checkout_year_month=2016-"+checkOutM+"&class_interval=1&dest_id=20108940&dest_type=city&group_adults=2&group_children=0&hlrd=0&label_click=undef&no_rooms=1&review_score_group=empty&room1=A%2CA&sb_price_type=total&score_min=0&si=ai%2Cco%2Cci%2Cre%2Cdi&ss=Harrisburg%2C%20Pennsylvania%2C%20USA&ss_raw=harrisbur&ssb=empty&order=score_w&tfl_cwh=1").get();
			//}
			//String title = doc.title();
			//System.out.println("Title: " + title);
			
			
			  //scrape hotel names, prices, and room types.
		      Elements hotels = doc.select("a.hotel_name_link.url");
			 // Elements hotels = doc.select("span.hotelName");
		      Elements prices = doc.select("b");
		      //Elements prices = doc.select("span.actualPrice.fakeLink");
		      Elements rooms = doc.select("span.room_link");
		      //Elements rooms = doc.select("span.room_link");
			 
		      //System.out.println("First Hotel: " +hotels.get(0).text());
		      //System.out.println("First Hotel: " + prices.get(0).text());
		      
		      ArrayList<String> hotelNames = new ArrayList<String>();
		      ArrayList<String> hotelPrices = new ArrayList<String>();
		      ArrayList<String> hotelRooms = new ArrayList<String>();
		      
		      //print to console scraped info
		      for(int i = 0; i < 15; i++) {   
		    	    System.out.println("Hotel: " + hotels.get(i).text());
		    	    System.out.println("Price: " + prices.get(i).text());
		    	    System.out.println("Room type: " + rooms.get(i).text());
		    	    hotelNames.add(hotels.get(i).text());
		    	    hotelPrices.add(prices.get(i).text());
		    	    hotelRooms.add(rooms.get(i).text());
		      } 
			
		      
		      //model.setHotelNames(hotelNames);
		      model.setHotelNames(hotelNames); 
		      model.setPrices(hotelPrices); 
		      model.setRooms(hotelRooms); 
		      System.out.println(model.getHotelNames().get(1));
		      System.out.println(model.getPrices().get(1));
		      System.out.println(model.getRooms().get(1));
			}
		      //for (Element price : prices) {
			    //System.out.println("Price: " + price.text());
			  //}
		      //for (Element room : rooms) {
				  //  System.out.println("Room type: " + room.text());
		     // }
			
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
