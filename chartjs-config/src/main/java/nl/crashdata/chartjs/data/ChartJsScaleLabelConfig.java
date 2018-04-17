package nl.crashdata.chartjs.data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface ChartJsScaleLabelConfig extends Serializable
{
	@JsonProperty("display")
	Boolean isDisplay();

	@JsonProperty("labelString")
	String getLabelString();
}
