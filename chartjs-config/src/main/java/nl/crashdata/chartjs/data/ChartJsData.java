package nl.crashdata.chartjs.data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface ChartJsData<K extends Serializable, V extends Serializable> extends Serializable
{
	@JsonProperty("datasets")
	List<ChartJsDataset<K, V>> getDatasets();
}
