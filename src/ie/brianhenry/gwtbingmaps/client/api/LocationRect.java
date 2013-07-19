package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

public class LocationRect extends JavaScriptObject {
	
	protected LocationRect(){ }		
	
	
	/**
	 * @param center
	 * @param width
	 * @param height
	 * @return a new instance of the LocationRect class.
	 */
	public static native LocationRect newLocationRect(Location center, double width, double height) /*-{
 		return new $wnd.Microsoft.LocationRect(center, width, height);
	}-*/;

	
	
	
	
	public final native LocationRect clone() /*-{
		return this.clone();
	}-*/;
	

	public final native boolean contains(Location location) /*-{
		return this.contains(location);
	}-*/;

	
	public final native double getEast() /*-{
		return this.getEast();
	}-*/;
	
	
	public final native double getNorth() /*-{
		return this.getNorth();
	}-*/;

		
	public final native Location getNorthwest() /*-{
		return this.getNorthwest();
	}-*/;
	
	
	public final native double getSouth() /*-{
		return this.getSouth();
	}-*/;

		
	public final native Location getSoutheast() /*-{
		return this.getSoutheast();
	}-*/;
	
	
	public final native double getWest() /*-{
		return this.getWest();
	}-*/;

	
	public final native boolean intersects(LocationRect rect) /*-{
		return this.intersects(rect);
	}-*/;

	
	public final native String toStringJS() /*-{
		return this.toString();
	}-*/;

	
	
	
}