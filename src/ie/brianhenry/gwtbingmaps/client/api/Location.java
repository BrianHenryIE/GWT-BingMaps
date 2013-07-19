package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;


public class Location extends JavaScriptObject { 
	
	protected Location(){ }
	
	public static Location newLocation(Double latitude, Double longitude) {
		return newLocation(String.valueOf(latitude), String.valueOf(longitude));
	}
	
	public static native Location newLocation(String latitude, String longitude) /*-{
		return new $wnd.Microsoft.Maps.Location(latitude, longitude);
	}-*/;
}