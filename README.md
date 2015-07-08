GwtBingMaps
=========

GwtBingMaps is a set of JSNI overlays for using the [Bing Maps AJAX Control, Version 7.0](http://msdn.microsoft.com/en-us/library/gg427611.aspx), with GWT.

Quickstart
----

1. Downlad [GwtBingMaps.jar](http://www.sortons.ie/gwt/gwtbingmaps20140506.jar), add it to your /war/WEB_INF/lib folder, and add it to your build path.

Or if you're using Maven

1. Clone this repository into your workspace using

    git clone https://github.com/BrianHenryIE/GwtBingMaps.git

Then add it to your local Maven repository with

    mvn install

And add it to your pom.xml

    <dependency>
		<groupId>ie.brianhenry</groupId>
		<artifactId>gwtbingmaps</artifactId>
		<version>0.0.2-SNAPSHOT</version>
		<scope>provided</scope>
	</dependency>

2. Then add the following to your myproject.gwt.xml:

    <inherits name="ie.brianhenry.gwtbingmaps.GwtBingMaps" />

3. Add this to your .html file:

    <script src='//ecn.dev.virtualearth.net/mapcontrol/mapcontrol.ashx?v=7.0&amp;s=1'></script>
    
4. Get an API key from [Bing Maps Account Center](https://www.bingmapsportal.com/). 
  
5. To add a map to your application, create a BingMap object, giving it a unique title and pass it MapOptions and ViewOptions.

    BingMap mapDiv = new BingMap("myMapName", mapOptions, viewOptions);

E.g. in [SortonsEvents/DirectoryView.java](https://github.com/BrianHenryIE/Sortons-Events/blob/master/src/ie/sortons/events/client/view/DirectoryView.java) and [FriendsEvents/EventsMap.java](https://github.com/BrianHenryIE/Friends--Events/blob/master/src/ie/sortons/friendsevents/client/widgets/EventsMap.java).

Overview
----

This is mostly just a set of overlays, so is nearly 1:1 with [the regular documentation](http://msdn.microsoft.com/en-us/library/gg427611.aspx).

It is incomplete -- I just needed it to put intuitive/familiar looking maps in Facebook applications.

So far, this handles making the map, adding pins, adding infoboxes and handling events. BingMaps is capable of a lot more!

Some classes are just empty JavaScriptObject shells so references in other objects are ok. In some places, it was unclear if an int or a double should be used.

Live Examples
----
* Here is [a directory of Dublin theatre companies](https://www.facebook.com/DublinTheatre/app_361530767318220).
* Here is [a map of events your friends have been invited to](https://apps.facebook.com/sortonsevents/). (requires Facebook login)

