package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @see http://msdn.microsoft.com/en-us/library/gg675210.aspx
 */
public class InfoboxOptions  extends JavaScriptObject {

	protected InfoboxOptions(){ }		


	public static InfoboxOptions getInfoboxOptions(Integer width, Integer height, String id, Boolean showCloseButton, Integer zIndex, Boolean showPointer, Boolean visible, String title, String description, String htmlContent) {
		return getInfoboxOptions(String.valueOf(width), String.valueOf(height), id, String.valueOf(showCloseButton), String.valueOf(zIndex), String.valueOf(showPointer), String.valueOf(visible), title, description, htmlContent);
	}

	/**
	 * JSNI doesn't autobox nicely, so the other method deals with that.
	 */
	private static native InfoboxOptions getInfoboxOptions(String width, String height, String id, String showCloseButton, String zIndex, String showPointer, String visible, String title, String description, String htmlContent) /*-{ 
		
		var options = {};
		
		if(width != "null") { options.width = parseInt(width); }
		if(height != "null") { options.height = parseInt(height); }
		if(id != null) { options.id = id; }
		if(showCloseButton != "null") { options.showCloseButton = (showCloseButton=="true") ? true : false; }
		if(zIndex != "null") { options.zIndex = (zIndex=="true") ? true : false; }
		if(showPointer != "null") { options.showPointer = (showPointer=="true") ? true : false; }
		if(visible != "null") { options.visible = (visible=="true") ? true : false; }
		if(title != null) { options.title = title; }
		if(description != null) { options.description = description; }
		if(htmlContent != null) { options.htmlContent = htmlContent; }
		
		// TODO
		// offset:new Microsoft.Maps.Point(10,0)

		return options;
	}-*/;
	


}