package com.gromor.open.charts.client.core;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class LoaderScript {

	static EventBus eventBus2 = new SimpleEventBus();

	public static native void addLoaderScript()/*-{
		var tag = $doc.createElement('script');
		tag.src = "https://www.gstatic.com/charts/loader.js";
		var firstScriptTag = $doc.getElementsByTagName('script')[0];
		firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);
		tag.onload = function() {
			@com.gromor.open.charts.client.core.LoaderScript::scriptReady()();
		}
	}-*/;

	public static native void testAlert()/*-{
		alert("testAlert");

	}-*/;

	public static void scriptReady() {
		eventBus2.fireEvent(new ScriptReadyEvent());
	}

	public static HandlerRegistration addScriptReadyHandler(ScriptReadyEventHandler handler) {
		return eventBus2.addHandler(ScriptReadyEvent.TYPE, handler);
	}

	public static HandlerRegistration addCoreChartReadyHandler(CoreChartReadyEventHandler handler) {
		return eventBus2.addHandler(CoreChartReadyEvent.TYPE, handler);
	}

	public static native void getCoreChart()/*-{
		$wnd.google.charts.load('current', {
			'packages' : [ 'corechart' ]
		});
		$wnd.google.charts
				.setOnLoadCallback(@com.gromor.open.charts.client.core.LoaderScript::coreChartReady());

	}-*/;

	public static void coreChartReady() {
		eventBus2.fireEvent(new CoreChartReadyEvent());
	}

}
