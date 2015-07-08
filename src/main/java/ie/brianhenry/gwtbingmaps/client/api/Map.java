package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

/*
 These properties can only be set when using the Map constructor.:

 disableBirdseye
 enableClickableLogo
 enableSearchLogo
 fixedMapPosition
 showBreadcrumb
 showCopyright
 showDashboard
 showMapTypeSelector 
 showScalebar

 */
public class Map extends JavaScriptObject {

	protected Map() {
	}

	/**
	 * Why anyone would create a map without the credentials or options is beyond me, but Microsoft allows it, so here
	 * it is.
	 * 
	 * @param mapName
	 */
	public final static Map newMap(String mapName) {
		return newMapJSO(mapName, null);
	}

	/**
	 * Initializes a new instance of the Map class.
	 * 
	 * @param mapName
	 *            (containerElement:node)
	 * @param mapOptions
	 * @return
	 */
	public final static Map newMap(String mapName, MapOptions mapOptions) {
		return newMapJSO(mapName, (JavaScriptObject) mapOptions);
	}

	/**
	 * Initializes a new instance of the Map class.
	 * 
	 * @param mapName
	 *            (containerElement:node)
	 * @param mapOptions
	 * @return
	 */
	public final static Map newMap(String mapName, ViewOptions viewOptions) {
		return newMapJSO(mapName, (JavaScriptObject) viewOptions);
	}

	private static native Map newMapJSO(String mapName, JavaScriptObject options) /*-{
		$doc[mapName] = new $wnd.Microsoft.Maps.Map($doc
				.getElementById(mapName), options);
		return $doc[mapName];
	}-*/;

	/**
	 * @return The map's entities. Use this property to add or remove entities from the map.
	 */
	public final native EntityCollection Entities() /*-{
		return this.entities;
	}-*/;

	// TODO
	/**
	 * @return the version of the map control.
	 */
	public final native String getVersion() /*-{
		// return this.getVersion();
		return $wnd.Microsoft.Maps.getVersion();
	}-*/;

	/**
	 * Removes focus from the map control so that it does not respond to keyboard events.
	 */
	public final native void blur() /*-{
		this.blur();
	}-*/;

	// TODO
	// Check the impact this will have on the Java objects
	/**
	 * Deletes the Map object and releases any associated resources.
	 */
	public final native void dispose() /*-{
		this.dispose();
	}-*/;

	/**
	 * Applies focus to the map control so that it responds to keyboard events.
	 */
	public final native void focus() /*-{
		this.focus();
	}-*/;

	/**
	 * @return the location rectangle that defines the boundaries of the current map view.
	 */
	public final native LocationRect getBounds() /*-{
		return this.getBounds();
	}-*/;

	/**
	 * @return the location of the center of the current map view.
	 */
	public final native Location getCenter() /*-{
		return this.getCenter();
	}-*/;

	// TODO
	// public final native String[] getCopyrights(Callback callback) /*-{
	// return this.getVersion();
	// }-*/;

	// TODO
	// public final native void getCredentials(Callback callback) /*-{
	// return this.getVersion();
	// }-*/;

	/**
	 * @return the heading of the current map view.
	 */
	public final native double getHeading() /*-{
		return this.getHeading();
	}-*/;

	/**
	 * @return the height of the map control.
	 */
	public final native double getHeight() /*-{
		return this.getHeight();
	}-*/;

	/**
	 * @return the string that represents the imagery currently displayed on the map.
	 */
	public final native String getImageryId() /*-{
		return this.getImageryId();
	}-*/;

	/**
	 * @return a string that represents the current map type displayed on the map. Valid map types are listed in the
	 *         MapTypeId Enumeration topic.
	 * @see http://msdn.microsoft.com/en-us/library/gg427625.aspx
	 */
	public final native String getMapTypeId() /*-{
		return this.getMapTypeId();
	}-*/;

	/**
	 * @return the current scale in meters per pixel of the center of the map.
	 */
	public final native double getMetresPerPixel() /*-{
		return this.getMetresPerPixel();
	}-*/;

	/**
	 * @return the current map mode.
	 */
	public final native MapMode getMode() /*-{
		return this.getMode();
	}-*/;

	/**
	 * @return the map???s mode node.
	 */
	public final native Node getModeLayer() /*-{
		return this.getModeLayer();
	}-*/;

	/**
	 * @return the map options that have been set. Note that if an option is not set, then the default value for that
	 *         option is assumed and getOptions returns undefined for that option.
	 */
	public final native MapOptions getOptions() /*-{
		return this.getOptions();
	}-*/;

	/**
	 * @return the x coordinate of the top left corner of the map control, relative to the page.
	 */
	public final native double getPageX() /*-{
		return this.getPageX();
	}-*/;

	/**
	 * @return the y coordinate of the top left corner of the map control, relative to the page.
	 */
	public final native double getPageY() /*-{
		return this.getPageY();
	}-*/;

	/**
	 * @return the map???s root node.
	 */
	public final native Node getRootElement() /*-{
		return this.getRootElement();
	}-*/;

	/**
	 * @return the location rectangle that defines the boundaries of the view to which the map is navigating.
	 */
	public final native LocationRect getTargetBounds() /*-{
		return this.getTargetBounds();
	}-*/;

	/**
	 * @return the center location of the view to which the map is navigating.
	 */
	public final native Location getTargetCenter() /*-{
		return this.getTargetCenter();
	}-*/;

	/**
	 * @return the heading of the view to which the map is navigating.
	 */
	public final native double getTargetHeading() /*-{
		return this.getTargetHeading();
	}-*/;

	/**
	 * @return the scale in meters per pixel of the center of the view to which the map is navigating.
	 */
	public final native double getTargetMetersPerPixel() /*-{
		return this.getTargetMetersPerPixel();
	}-*/;

	/**
	 * @return the zoom level of the view to which the map is navigating.
	 */
	public final native double getTargetZoom() /*-{
		return this.getTargetZoom();
	}-*/;

	/**
	 * @return the map???s user node.
	 */
	public final native Node getUserLayer() /*-{
		return this.getUserLayer();
	}-*/;

	/**
	 * @return the x coordinate of the viewport origin (the center of the map), relative to the page.
	 */
	public final native double getViewportX() /*-{
		return this.getViewportX();
	}-*/;

	/**
	 * @return the y coordinate of the viewport origin (the center of the map), relative to the page.
	 */
	public final native double getViewportY() /*-{
		return this.getViewportY();
	}-*/;

	/**
	 * @return the width of the map control.
	 */
	public final native double getWidth() /*-{
		return this.getWidth();
	}-*/;

	/**
	 * @return the zoom level of the current map view.
	 */
	public final native double getZoom() /*-{
		return this.getZoom();
	}-*/;

	// TODO
	// An overlay for this
	/**
	 * @returns the range of valid zoom levels for the current map view.
	 */
	public final native JavaScriptObject getZoomRange() /*-{
		return this.getZoomRange();
	}-*/;

	/**
	 * @return a boolean indicating whether map imagery tiles are currently being downloaded.
	 */
	public final native boolean isDownloadingTiles() /*-{
		return this.isDownloadingTiles();
	}-*/;

	/**
	 * @returns a boolean indicating whether the map is in a regular Mercator nadir mode.
	 */
	public final native boolean isMercator() /*-{
		return this.isMercator();
	}-*/;

	/**
	 * @returns true if the current map type allows the heading to change; false if the display heading is fixed.
	 */
	public final native boolean isRotationEnabled() /*-{
		return this.isRotationEnabled();
	}-*/;

	/**
	 * Sets the current map type. The specified mapTypeId must be a valid map type ID or a registered map type ID. Valid
	 * map type IDs are listed in the MapTypeId Enumeration topic.
	 * 
	 * @param mapTypeId
	 * @see http://msdn.microsoft.com/en-us/library/gg427625.aspx
	 */
	public final native void setMapType(String mapTypeId) /*-{
															this.setMapType(mapTypeId);
															}-*/;

	// TODO
	// Non static method to access this
	/**
	 * Sets the height and width of the map.
	 * 
	 * @param widthHeight
	 */
	private final native void setOptions(JavaScriptObject widthHeight) /*-{
																		this.setOptions(widthHeight);
																		}-*/;

	/**
	 * Sets the map view based on the specified options.
	 * 
	 * @param viewOptions
	 */
	public final native void setView(ViewOptions viewOptions) /*-{
																this.setView(viewOptions);
																}-*/;

	// TODO
	// I think these need two methods each
	// public final native JavaScriptObject tryLocationToPixel() /*-{
	// return this.tryLocationToPixel();
	// }-*/;

	// This certainly didn't work as desired. Was a few km south east of where I clicked.
	public final native Location tryPixelToLocation(Point p) /*-{
																return this.tryPixelToLocation(p);
																}-*/;

}
