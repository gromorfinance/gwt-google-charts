package com.gromor.open.charts.client;

import com.google.gwt.core.client.JavaScriptObject;;

public class DataTable extends JavaScriptObject {

	protected DataTable() {
	}

	// public final native JavaScriptObject getChartData() /*-{
	//// var data[]=([
	//// ['Task', 'Hours per Day'],
	//// ['Work', 11],
	//// ['Eat', 2],
	//// ['Commute', 2],
	//// ['Watch TV', 2],
	//// ['Sleep', 7]
	//// ]);
	// var data[]=[];
	// return data;
	// }-*/;

	public static native DataTable create() /*-{
		return new $wnd.google.visualization.DataTable();
	}-*/;

	public final native int addColumn(String type, String label) /*-{
		return this.addColumn(type, label);
	}-*/;

	public final native int addRows(int number) /*-{
		return this.addRows(number);
	}-*/;

	public final native void setValue(int rowIndex, int columnIndex, double value) /*-{
		this.setValue(rowIndex, columnIndex, value);
	}-*/;

	public final native void setValue(int rowIndex, int columnIndex, String value) /*-{
		this.setValue(rowIndex, columnIndex, value);
	}-*/;

	public final native void print() /*-{
		alert("hello");
	}-*/;

	public final native void getValue(String rowIndex, String columnIndex) /*-{
		alert(this.getValue(rowIndex, columnIndex)+' selected.')
	}-*/;

}
