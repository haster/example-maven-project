package nl.crashdata.chartjs.data.simple;

import java.io.Serializable;

import nl.crashdata.chartjs.data.ChartJsChartType;
import nl.crashdata.chartjs.data.ChartJsConfig;
import nl.crashdata.chartjs.data.ChartJsData;
import nl.crashdata.chartjs.data.ChartJsOptions;

public class SimpleChartJsConfig<K extends Serializable, V extends Serializable>
		implements ChartJsConfig<K, V>
{
	private static final long serialVersionUID = 1L;

	private ChartJsData<K, V> data;

	private ChartJsOptions options;

	private ChartJsChartType chartType;

	@Override
	public ChartJsChartType getChartType()
	{
		return chartType;
	}
	
	public void setChartType(ChartJsChartType chartType)
	{
		this.chartType = chartType;
	}

	@Override
	public ChartJsData<K, V> getData()
	{
		return data;
	}

	public void setData(ChartJsData<K, V> data)
	{
		this.data = data;
	}

	@Override
	public ChartJsOptions getOptions()
	{
		return options;
	}

	public void setOptions(ChartJsOptions options)
	{
		this.options = options;
	}
}
