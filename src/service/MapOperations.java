package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

/*Create a class called MapOperations inside service package with the following methods.*
2.**
8.*Use lamda operations to sort.*
9.*The return type of all the methods are map.*
*/
public class MapOperations{
	Map<String,TouristPlace> hashMap;
	String key = "1";
	//ArrayList<TouristPlace> list=new ArrayList<>();
	public Map<String,TouristPlace> add(TouristPlace places){
		hashMap.put(key,places);
		int n = Integer.parseInt(key)+1;
		key = String.valueOf(n);
		return hashMap;
	}
	public Map<String,TouristPlace> sortRandomly(Map<String,TouristPlace> places){
		hashMap=new HashMap<String,TouristPlace>(places);
		return hashMap;
	}
	public Map<String,TouristPlace> sortInEntryOrder(Map<String,TouristPlace> places){
		hashMap = new LinkedHashMap<String,TouristPlace>(places);
		return hashMap;
	}
	public Map<String,TouristPlace> sortAlphabetically(Map<String,TouristPlace> places){
		hashMap = new TreeMap<String,TouristPlace>();
		return hashMap;
	}
	public Object reset(Map<String,TouristPlace> places) {
		places.clear();
		return places;
	}
	public Map<String,TouristPlace> getList(){
		return hashMap;
	}
	
	public Object remove(TouristPlace places) {
		hashMap.remove(places.getName());
		hashMap.remove(places.getRank());
		hashMap.remove(places.getDestination());
		return places;
		
		
	}
}
