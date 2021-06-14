package kodlamaio.mhrs.business.abstracts;

import java.util.List;

import kodlamaio.mhrs.entities.concretes.JobTitles;

public interface PositionService {

	List<JobTitles> getAll();
	
}
