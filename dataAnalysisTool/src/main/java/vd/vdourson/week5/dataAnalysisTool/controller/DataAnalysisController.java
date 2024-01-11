package vd.vdourson.week5.dataAnalysisTool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vd.vdourson.week5.dataAnalysisTool.service.DataAnalysisService;

@RestController
public class DataAnalysisController {
	
	private DataAnalysisService dataAnalysisService;
	
	@Autowired
	public DataAnalysisController(DataAnalysisService dataAnalysisService) {
		this.dataAnalysisService = dataAnalysisService;
	}
	
	@GetMapping("/monthly_total")
	public ResponseEntity<Long> getMonthlyTotal(
			@RequestParam String year,
			@RequestParam String month,
			@RequestParam(required = false, defaultValue = "All") String country,
			@RequestParam(required = false, defaultValue = "All") String commodity,
			@RequestParam(required = false, defaultValue = "All") String transport_mode,
			@RequestParam(required = false, defaultValue = "$") String measure){
		return new ResponseEntity<Long>(dataAnalysisService.getMonthlyTotal(year, month, country, commodity, transport_mode, measure), HttpStatus.OK);
	}
	
	@GetMapping("/monthly_average")
	public ResponseEntity<Long> getMonthlyAverage(
			@RequestParam String year,
			@RequestParam String month,
			@RequestParam(required = false, defaultValue = "All") String country,
			@RequestParam(required = false, defaultValue = "All") String commodity,
			@RequestParam(required = false, defaultValue = "All") String transport_mode,
			@RequestParam(required = false, defaultValue = "$") String measure){
		return new ResponseEntity<Long>(dataAnalysisService.getMonthlyTotal(year, month, country, commodity, transport_mode, measure), HttpStatus.OK);
	}
	
	
}
