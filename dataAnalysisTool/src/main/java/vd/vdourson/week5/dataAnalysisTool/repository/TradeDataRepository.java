package vd.vdourson.week5.dataAnalysisTool.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import vd.vdourson.week5.dataAnalysisTool.entities.TradeData;

@Repository
public class TradeDataRepository {
	
	private List<TradeData> allData = new ArrayList<TradeData>();
	
	//This constructor initiate the repository with the data contained into the csv file "covid_and_trade"
	public TradeDataRepository() {
		try (InputStream inputFS = getClass().getResourceAsStream("/covid_and_trade.csv");
		    	BufferedReader br = new BufferedReader(new InputStreamReader(inputFS))) {
		    	
			//Skip the header of the csv
			//Convert each line into an object of TradeData class
			this.allData = br.lines()
		    		  .skip(1)
		    		  .map(line -> line.split(",(?!\\s)"))
		    		  .map((ar) -> {
		    			  TradeData trLine = new TradeData(ar);
		    			  return trLine;
		    		  })
		    		  .collect(Collectors.toList());
		 } 	
		 catch (IOException e) {
			 System.out.println("Loading of the file failed" + e);
		 }
	}//End constructor

	public List<TradeData> getAllData() {
		return allData;
	}

	public void setAllData(List<TradeData> allData) {
		this.allData = allData;
	}
	
	
}
