package kodlamaio.mhrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.mhrs.business.abstracts.PositionService;
import kodlamaio.mhrs.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {

	private PositionService positionService;
	
	@Autowired
	public JobTitlesController(PositionService positionService) {
		
		this.positionService = positionService;
		
	}
	
	@GetMapping("/getall")
	public List<JobTitles> getAll(){
		return this.positionService.getAll();
	}
	
}
