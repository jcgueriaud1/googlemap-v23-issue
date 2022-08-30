package com.example.application.views;

import com.flowingcode.vaadin.addons.googlemaps.GoogleMap;
import com.flowingcode.vaadin.addons.googlemaps.GoogleMapPoint;
import com.flowingcode.vaadin.addons.googlemaps.GoogleMapPolygon;
import com.flowingcode.vaadin.addons.googlemaps.LatLon;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.SortableLayout;

import java.util.Arrays;

@PageTitle("Google Map")
@Route(value = "googlemap", layout = MainLayout.class)
public class GoogleMapView extends HorizontalLayout {


    public GoogleMapView() {
        String apiKey = "---";
        GoogleMap gmaps = new GoogleMap(apiKey,null,null);
        gmaps.setMapType(GoogleMap.MapType.SATELLITE);
        gmaps.setSizeFull();
        gmaps.setCenter(new LatLon(0,0));
        gmaps.addMarker("Center", new LatLon(0,0), true, "");
        GoogleMapPolygon gmp = gmaps.addPolygon(Arrays.asList(new GoogleMapPoint(gmaps.getCenter()),
                new GoogleMapPoint(gmaps.getCenter().getLat(),gmaps.getCenter().getLon()+1),
                new GoogleMapPoint(gmaps.getCenter().getLat()+1,gmaps.getCenter().getLon())));
        setSizeFull();
    }

}
