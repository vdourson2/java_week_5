package vd.vdourson.week5.dataAnalysisTool.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vd.vdourson.week5.dataAnalysisTool.entities.TradeData;
import vd.vdourson.week5.dataAnalysisTool.repository.TradeDataRepository;

@Service
public class DataAnalysisService {
	
	private TradeDataRepository tradedatarepository;

	@Autowired
	public DataAnalysisService(TradeDataRepository tradedatarepository) {
		this.tradedatarepository = tradedatarepository;
	}
	
	public Long getMonthlyTotal(String year, String month, String country, String commodity, String transport_mode, String measure) {
		long result = tradedatarepository.getAllData().stream()
				.filter(l -> l.getYear().equals(year))
				.filter(l -> l.getMonth().equals(month))
				.filter(l -> l.getCountry().equals(country))
				.filter(l -> l.getCommodity().equals(commodity))
				.filter(l -> l.getTransport_mode().equals(transport_mode))
				.filter(l -> l.getMeasure().equals(measure))
				.filter(l -> l.getDirection().equals("Exports"))
				.peek(l -> System.out.println(l))
				.collect(Collectors.summingLong(TradeData::getLongValue));
		System.out.println(result);
		return result;
	}
}
