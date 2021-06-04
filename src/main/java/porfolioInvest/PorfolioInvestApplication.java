package porfolioInvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import porfolioInvest.Portfolio.Portfolio;

import java.util.List;

@SpringBootApplication
@RestController
public class PorfolioInvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PorfolioInvestApplication.class, args);
	}


	@GetMapping()
	public List<Portfolio> getPorfolio(){
		return List.of(
				new Portfolio("AAPL",
						20,
						2500.0,
						600.0)
		);
	}



}
