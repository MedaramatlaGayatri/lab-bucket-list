package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.TouristPlace;

/*Progression - 2
1.*Create a class called ListOperations inside service package with the following methods.*
2.*public List<TouristPlace> add(TouristPlace places)*
3.*public List<TouristPlace> remove()*
4.*public Object sortByDestination(List<TouristPlace> places)*
5.*public Object sortByRank(List<TouristPlace> places)*
6.*public Object reset(List<TouristPlace> places)*
7.*Use lamda operations to sort.*
8.*The return type of all the methods are list.*
*/
public class ListOperations {
	List<TouristPlace> list = new ArrayList<TouristPlace>();
	public List<TouristPlace> add(TouristPlace places){
		list.add(places);
		return list;
	}
	public List<TouristPlace> remove(){
		list.remove(0);
		return list;
	}
	public List<TouristPlace> getPlaces(){
		return list;
	}

	public Object sortByDestination(List<TouristPlace> places) {
		//list.sort((TouristPlace place1, TouristPlace place2)->place1.getDestination().compareTo(place22.getDestination()));
		Collections.sort(places,new Comparator<TouristPlace>() {
			public int compare(TouristPlace a,TouristPlace b) {
				return a.getDestination().compareTo(b.getDestination());
			}
		});
		System.out.print(places);
		return places;
	}
	public Object sortByRank(List<TouristPlace> places) {
		//list.sort(TouristPlace place1, TouristPlace place2)->place1.getRank().compareTo(place2.getRank());
		Collections.sort(places,new Comparator<TouristPlace>() {
			public int compare(TouristPlace a,TouristPlace b) {
				return a.getRank().compareTo(b.getRank());
			}
		});
		return places;
	}
	public Object reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}