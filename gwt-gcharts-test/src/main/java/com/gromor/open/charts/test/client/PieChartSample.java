package com.gromor.open.charts.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.gromor.open.charts.client.ApiReadyEvent;
import com.gromor.open.charts.client.ApiReadyEventHandler;
import com.gromor.open.charts.client.DataTable;
import com.gromor.open.charts.client.Options;
import com.gromor.open.charts.client.PieChart;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PieChartSample implements EntryPoint {

	PieChart pw;

	/**
	 * This is the entry point method.
	 */

	public void onModuleLoad() {
		PieChart.loadApi();
		PieChart.addApiReadyHandler(new ApiReadyEventHandler() {
			public void onApiReady(ApiReadyEvent event) {
				DataTable dataTable = DataTable.create();
				dataTable.addColumn("string", "Language");
				dataTable.addColumn("number", "Speakers (in millions)");
				dataTable.addRows(8);
				dataTable.setValue(0, 0, "Assamese");
				dataTable.setValue(0, 1, 13);
				dataTable.setValue(1, 0, "Bengali");
				dataTable.setValue(1, 1, 83);
				dataTable.setValue(2, 0, "Bodo");
				dataTable.setValue(2, 1, 1.4);
				dataTable.setValue(3, 0, "Dogri");
				dataTable.setValue(3, 1, 2.3);
				dataTable.setValue(4, 0, "Gujarati");
				dataTable.setValue(4, 1, 46);
				dataTable.setValue(5, 0, "Hindi");
				dataTable.setValue(5, 1, 300);
				dataTable.setValue(6, 0, "Kannada");
				dataTable.setValue(6, 1, 38);
				dataTable.setValue(7, 0, "Kashmiri");
				dataTable.setValue(7, 1, 5.5);
				// Set options
				Options options = Options.create();
				options.setBackgroundColor("#f0f0f0");

				// options.setColors(colors);
				options.setFontName("Tahoma");
				options.setIs3D(true);
				// options.setPieResidueSliceColor("#000000");
				// options.setPieResidueSliceLabel("Others");
				// options.setSliceVisibilityThreshold(0.1);
				options.setTitle("Languages of India");

				final PieChart pc = new PieChart();
				RootPanel.get().add(pc);
				pc.addListener();
				pc.draw(dataTable, options);

				

			}
		});
	}
}
