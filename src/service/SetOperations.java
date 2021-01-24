package service;

import java.util.ArrayList;
import java.util.HashSet;

import model.TouristPlace;

/*Create a class called SetOperations inside service package with the following methods.*
2.**
7.*Use lamda operations to sort.*
8.*The return type of all the methods are set.*
*/
public class SetOperations{
	ArrayList<TouristPlace> ar = new ArrayList<TouristPlace>();
	HashSet<TouristPlace> places = new HashSet<TouristPlace>();
	public HashSet<TouristPlace> add(TouristPlace places){
		this.places.add(places);
		return this.places;
	}
	public HashSet<TouristPlace> remove(TouristPlace place){
		places.remove(place);
		return places;
	}
	public Object sortByDestination(HashSet<TouristPlace> places) {
		ar = new ArrayList<TouristPlace>();
		ar.addAll(places);
		ar.sort((TouristPlace a,TouristPlace b) -> a.getDestination().compareTo(b.getDestination()));
	    return ar;
	}
	public Object sortByRank(HashSet<TouristPlace> places) {
		ar = new ArrayList<TouristPlace>();
		ar.addAll(places);
		ar.sort((TouristPlace a,TouristPlace b) -> a.getDestination().compareTo(b.getDestination()));
	    return ar;	
	}
	public HashSet<TouristPlace> getPlaces(){
		return places;
	}
	public Object reset(HashSet<TouristPlace> places) {
		places.clear();
		return places;
	}
}
