package com.gromor.open.charts.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Options extends JavaScriptObject {
	
	protected Options() {
		
	}

	public static Options create() {
		return createObject().cast();
	}

	public final native void setBackgroundColor(String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native void setEnableInteractivity(boolean enableInteractivity) /*-{
		this.enableInteractivity = enableInteractivity;
	}-*/;

	public final native void setFontName(String fontName) /*-{
		this.fontName = fontName;
	}-*/;

	public final native void setFontSize(double fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;

	public final native void setForceIFrame(boolean forceIFrame) /*-{
		this.forceIFrame = forceIFrame;
	}-*/;

	public final native void setIs3D(boolean is3D) /*-{
		this.is3D = is3D;
	}-*/;

	public final native void setPieResidueSliceColor(String pieResidueSliceColor) /*-{
		this.pieResidueSliceColor = pieResidueSliceColor;
	}-*/;

	public final native void setPieResidueSliceLabel(String pieResidueSliceLabel) /*-{
		this.pieResidueSliceLabel = pieResidueSliceLabel;
	}-*/;

	public final native void setPieSliceBorderColor(String pieSliceBorderColor) /*-{
		this.pieSliceBorderColor = pieSliceBorderColor;
	}-*/;

	public final native void setSliceVisibilityThreshold(double sliceVisibilityThreshold) /*-{
		this.sliceVisibilityThreshold = sliceVisibilityThreshold;
	}-*/;

	public final native void setTitle(String title) /*-{
		this.title = title;
	}-*/;
	
	
	
	
}
