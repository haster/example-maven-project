package nl.crashdata.chartjs.data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.crashdata.chartjs.colors.ChartJsRGBAColor;

/**
 * Represents the configuration of one dataset for a chart. In other words, this represents the data
 * for one line in a line chart. If there are moultiple lines, there will be multiple datasets.
 *
 * Corresponds to the elements of the {@code config.data.datasets} property.
 *
 * @author haster
 *
 * @param <K>
 *            The type of the x-axis ('keys') of the data
 * @param <V>
 *            The type of the y-axis ('values') of the data.
 */
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
