GwtBingMaps
=========

GwtBingMaps is a set of JSNI overlays for using the [Bing Maps AJAX Control, Version 7.0](http://msdn.microsoft.com/en-us/library/gg427611.aspx), with GWT.

Quickstart
----

Downlad [GwtBingMaps.jar](http://www.sortons.ie/gwt/GwtBingMaps20140506.jar), add it to your /war/WEB_INF/lib folder, and add it to your build path.

Then add the following to your myproject.gwt.xml:

    <inherits name="ie.brianhenry.gwtbingmaps.GwtBingMaps" />
    <script src='//ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0&amp;s=1' /> 
  
Get an API key from [Bing Maps Account Center](https://www.bingmapsportal.com/). 
  
To add a map to your application, create a BingMap object (a composite), giving it a unique title and pass it MapOptions and ViewOptions.

    BingMap mapDiv = new BingMap("myMapName", mapOptions, viewOptions);

E.g. in [SortonsEvents/DirectoryView.java](https://github.com/BrianHenryIE/Sortons-Events/blob/master/src/ie/sortons/events/client/view/DirectoryView.java) and [FriendsEvents/EventsMap.java](https://github.com/BrianHenryIE/Friends--Events/blob/master/src/ie/sortons/friendsevents/client/widgets/EventsMap.java).
Overview
----

This is mostly just a set of overlays, so is nearly 1:1 with [the regular documentation](http://msdn.microsoft.com/en-us/library/gg427611.aspx).

It is incomplete -- I just needed it to put intuitive/familiar looking maps in Facebook applications.

So far, this handles making the map, adding pins, adding  infoboxes and handling events. BingMaps is capable of a lot more!

Some classes are just empty JavaScriptObject shells so references in other objects are ok. In some places, it was unclear an int or a double should be used.
Live Examples
----
* Here is [a directory of Dublin theatres companies](https://www.facebook.com/DublinTheatre/app_361530767318220).
* Here is [a map of events your friends have been invited to](https://apps.facebook.com/sortonsevents/). (Fb login)

