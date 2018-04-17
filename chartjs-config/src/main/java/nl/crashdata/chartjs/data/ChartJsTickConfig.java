package nl.crashdata.chartjs.data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface ChartJsTickConfig<T extends Serializable> extends Serializable
{
	@JsonProperty("suggestedMin")
	T getSuggestedMinimum();

	@JsonProperty("min")
	T getForcedMinimum();

	@JsonProperty("suggestedMax")
	T getSuggestedMaximum();

	@JsonProperty("max")
	T getForcedMaximum();

	@JsonProperty("stepSize")
	T getStepSize();
}
