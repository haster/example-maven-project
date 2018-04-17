package nl.crashdata.chartjs.data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.crashdata.chartjs.colors.ChartJsRGBAColor;

public interface ChartJsDataset<K extends Serializable, V extends Serializable> extends Serializable
{
	@JsonProperty("label")
	String getLabel();

	@JsonProperty("backgroundColor")
	ChartJsRGBAColor getBackgroundColor();

	@JsonProperty("borderColor")
	ChartJsRGBAColor getBorderColor();

	@JsonProperty("fill")
	String getFill();

	@JsonProperty("data")
	List<ChartJsDataPoint<K, V>> getData();
}
