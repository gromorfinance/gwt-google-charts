package com.gromor.open.charts.client;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.gromor.open.charts.client.core.CoreChartReadyEventHandler;

public class PieChartReadyEvent extends GwtEvent<PieChartReadyEventHandler> {
	public static Type<PieChartReadyEventHandler> TYPE = new Type<PieChartReadyEventHandler>();

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<PieChartReadyEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(PieChartReadyEventHandler handler) {
		handler.onPieChartReady(this);
	}
}
