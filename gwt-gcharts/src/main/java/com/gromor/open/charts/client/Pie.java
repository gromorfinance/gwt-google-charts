package com.gromor.open.charts.client;

import com.google.gwt.core.client.JavaScriptObject;


public class Pie extends JavaScriptObject {

	protected Pie() {

	}


	public static native Pie createPieChart(String divId)/*-{
		return new $wnd.google.visualization.PieChart($doc
				.getElementById(divId));

	}-*/;

	public final native void draw(DataTable dataTable, Options options)/*-{
		this.draw(dataTable, options);
	}-*/;

	
	// Select Listener

	public final native void addListener() /*-{
		$wnd.google.visualization.events.addListener(this, 'select',
				@com.gromor.open.charts.client.PieChart::selectHandlerCaller());
	}-*/;

	public final native void selectHandler(DataTable dt) /*-{
		dt.@com.gromor.open.charts.client.DataTable::getValue(Ljava/lang/String;Ljava/lang/String;)(this.getSelection()[0].row,0);
	}-*/;
	
	

}
