package com.gromor.open.charts.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.gromor.open.charts.client.core.CoreChartReadyEvent;
import com.gromor.open.charts.client.core.CoreChartReadyEventHandler;
import com.gromor.open.charts.client.core.LoaderScript;
import com.gromor.open.charts.client.core.ScriptReadyEvent;
import com.gromor.open.charts.client.core.ScriptReadyEventHandler;

public class PieChart extends Composite {

	public interface JsHelperResource extends ClientBundle {
		public static JsHelperResource INSTANCE = GWT.create(JsHelperResource.class);

		// @Source("loader.js")
		// public TextResource charts();
	}

	interface MyUiBinder extends UiBinder<Widget, PieChart> {

	}

	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

	@UiField
	DivElement pc;

	HTMLPanel container;

	HTMLPanel pc1;

	private final String divId;
	private static Pie piechart;
	private static DataTable dt;

	static SimpleEventBus eventBus = new SimpleEventBus();

	public static void loadApi() {
		LoaderScript.addScriptReadyHandler(new ScriptReadyEventHandler() {
			public void onScriptReady(ScriptReadyEvent event) {
				loadCoreChart();
			}
		});
		LoaderScript.addLoaderScript();
	}

	private static void loadCoreChart() {
		LoaderScript.getCoreChart();
		LoaderScript.addCoreChartReadyHandler(new CoreChartReadyEventHandler() {
			public void onCoreChartReady(CoreChartReadyEvent event) {
				apiReady();
			}
		});
	}

	private static void apiReady() {
		eventBus.fireEvent(new ApiReadyEvent());
	}

	public static HandlerRegistration addApiReadyHandler(ApiReadyEventHandler handler) {
		return eventBus.addHandler(ApiReadyEvent.TYPE, handler);
	}

	public PieChart() {
		this.divId = "piechart";
		container = (HTMLPanel) uiBinder.createAndBindUi(this);
		initWidget(container);
		pc.setId(this.divId);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		piechart = Pie.createPieChart(this.divId);
	}

	public void draw(DataTable dt_value, Options opt) {
		dt = dt_value;
		piechart.draw(dt, opt);
	}

	// Listener

	public void addListener() {
		piechart.addListener();
	}

	public static void selectHandlerCaller() {
		piechart.selectHandler(dt);
	}

}
