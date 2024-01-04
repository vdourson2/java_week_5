package vd.vdourson.week5.dataAnalysisTool;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import vd.vdourson.week5.dataAnalysisTool.repository.TradeDataRepository;

@SpringBootApplication
public class DataAnalysisToolApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataAnalysisToolApplication.class, args);
//		TradeDataRepository testRepo = context.getBean(TradeDataRepository.class);
//		System.out.println(testRepo.getAllData());
	}

}
