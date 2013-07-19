package ie.brianhenry.gwtbingmaps.client.example;

import ie.brianhenry.gwtbingmaps.client.api.BingMap;
import ie.brianhenry.gwtbingmaps.client.api.Infobox;
import ie.brianhenry.gwtbingmaps.client.api.InfoboxOptions;
import ie.brianhenry.gwtbingmaps.client.api.Location;
import ie.brianhenry.gwtbingmaps.client.api.MapOptions;
import ie.brianhenry.gwtbingmaps.client.api.Pushpin;
import ie.brianhenry.gwtbingmaps.client.api.PushpinOptions;
import ie.brianhenry.gwtbingmaps.client.api.ViewOptions;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.user.client.ui.RootPanel;

public class GWT_Bing_Maps implements EntryPoint {
	
	public void onModuleLoad() {
		
		// Set the MapOptions
		// Get your API key at https://www.bingmapsportal.com/
		String credentials = null;
		boolean enableSearchLogo = false;
		boolean showDashboard = true;
		boolean showMapTypeSelector = false;
		boolean showScalebar = false;
		
		MapOptions mapOptions = MapOptions.getMapOptions(credentials, null, null, null, null, null, null, null, null, null, null, null, enableSearchLogo, null, null, null, null, showDashboard, showMapTypeSelector, showScalebar, null, null);
		
		
		// Set the ViewOptions
	 	Location center = Location.newLocation(35.906849,-118.937988);
	 	String mapTypeId = "fb";
	 	int zoom = 5;
	 	
		ViewOptions viewOptions = ViewOptions.getViewOptions(null, center, null, null, mapTypeId, null, zoom);
		
		
		// Create and add the map
		BingMap map = new BingMap("myMap", mapOptions, viewOptions);
		
		map.setSize("750px", "400px");
		map.getElement().getStyle().setPosition(Position.RELATIVE);
		
		RootPanel.get("gwt").add(map);
		

		// Add a pin to the map
		Location location1 = Location.newLocation(38.906849,-120.937988);
		
		int pinWidth = 25;
		int pinHeight = 28;
		String icon = "http://www.facebook.com/images/map_pushpin.png";
		boolean draggable = false;
		
		PushpinOptions options = PushpinOptions.setPushPinOptions(pinWidth, pinHeight, icon, draggable, null, null, null);
		Pushpin pushpin = Pushpin.getPushpin(location1, options);

		map.getMap().Entities().push(pushpin);
		
		
		// Add an InfoBox to the map
		Location location2 = Location.newLocation(33.606849,-115.2);
		
		int infoWidth = 200;
		int infoHeight = 75;
		boolean showCloseButton = true;
		int zIndex = 0;
		Boolean showPointer = true;
		Boolean visible = true;
		String title = "An Infobox";
		String description = "This is an Infobox";
		
		InfoboxOptions infoboxOptions = InfoboxOptions.getInfoboxOptions(infoWidth, infoHeight, null, showCloseButton, zIndex, showPointer, visible, title, description, null);
		Infobox infobox = Infobox.getInfobox(location2, infoboxOptions);

		map.getMap().Entities().push(infobox);
		
	}
}
