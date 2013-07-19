package ie.brianhenry.gwtbingmaps.client.api;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * Creates a Composite containing a Bing Map JavaScriptObject.
 * 
 * @author Brian Henry
 * @see http://msdn.microsoft.com/en-us/library/gg427610.aspx
 */
public class BingMap extends Composite {

	private HTML panel;

	private Map theMap;
	
	private String mapName;
	private String credentials;
	private MapOptions mapOptions;
	private ViewOptions viewOptions;
	

	/**
	 * @param mapName - A unique name for the map - required
	 * @param credentials - Your API key - required
	 */
	public BingMap(String mapName, String credentials) {
		this(mapName, MapOptions.getMapOptions(credentials, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null);
	}
	
	
	/** 
	 * @param mapName - A unique name for the map - required
	 * @param mapOptions - initialization settings for the map (including API key) - optional, can only be specified when creating the map
	 * @param viewOptions - further options for customizing the map - optional, can also be specified later 
	 */
	public BingMap(String mapName, MapOptions mapOptions, ViewOptions viewOptions){
		this.mapName = mapName;
		this.mapOptions = mapOptions;
		this.viewOptions = viewOptions;
		
		panel = new HTML();
		initWidget(panel);
		this.getElement().setId(mapName);	
	}
	

	// Executes when the panel is attached to the DOM
	protected void onAttach(){
		super.onAttach();
		if(isBingMapsLibraryLoaded()){
		 	theMap = Map.newMap(mapName, mapOptions);
		 	if(viewOptions!=null) { theMap.setView(viewOptions); }
		} else {
			System.out.println("Bing Maps JavaScript API not present");
		}
		
	}

	
	/**
	 * @return The JavaScriptObject with methods for manipulating the map
	 */
	public Map getMap(){
		
		return this.theMap;
		
	}

	
	/**
	 * Checks if the Bing Maps JavaScript API has downloaded from Microsoft
	 * 
	 * @return true or false 
	 */
	public static native boolean isBingMapsLibraryLoaded() /*-{
		return !(($wnd.Microsoft === "undefined") || ($wnd.eval("typeof Microsoft") === "undefined"));
	}-*/;

	

	

	public final void addPinWithClickInfobox(Pushpin pushpin, Infobox pinInfobox) {
		addPinWithClickInfobox(theMap, pushpin, pinInfobox);
	}
	
	public final native void addPinWithClickInfobox(Map theMap, Pushpin pushpin, Infobox pinInfobox) /*-{
		
		// Add handler for the pushpin click event.
		$wnd.Microsoft.Maps.Events.addHandler(pushpin, 'click', function displayInfobox(e) { pinInfobox.setOptions({ visible:true }); } );  
		
		// Hide the infobox when the map is moved/clicked.
        $wnd.Microsoft.Maps.Events.addHandler(theMap, 'viewchange', function hideInfobox(e) { pinInfobox.setOptions({ visible: false }); });
        $wnd.Microsoft.Maps.Events.addHandler(theMap, 'click', function hideInfobox(e) { pinInfobox.setOptions({ visible: false }); });
		
		pinInfobox.setOptions({ visible: false });
		
		// Add both to the map		
		theMap.entities.push(pushpin);
		theMap.entities.push(pinInfobox);
	}-*/;

	
	public final native void removeAllInfoboxes() /*-{
	
		for(var i=this.entities.getLength()-1;i>=0;i--) {
			var pushpin= this.entities.get(i); 
			if (pushpin instanceof $wnd.Microsoft.Maps.Infobox) { 
				this.entities.removeAt(i);  
			};
		} 	 
	}-*/;
		
	public final native void removeAllPins() /*-{
		
		for(var i=this.entities.getLength()-1;i>=0;i--) {
			var pushpin= this.entities.get(i); 
			if (pushpin instanceof $wnd.Microsoft.Maps.Pushpin) { 
				this.entities.removeAt(i);  
			};
		} 	 
	}-*/;
	
	
	
	public final native void onViewChange() /*-{
		
		// Hide the infobox when the map is moved/clicked.
        $wnd.Microsoft.Maps.Events.addHandler(this, 'viewchange', function hideInfobox(e) { pinInfobox.setOptions({ visible: false }); });

	}-*/;
}
