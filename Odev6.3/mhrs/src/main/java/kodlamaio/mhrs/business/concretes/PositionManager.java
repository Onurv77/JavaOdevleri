package kodlamaio.mhrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.mhrs.business.abstracts.PositionService;
import kodlamaio.mhrs.dataAccess.abstracts.PositionDao;
import kodlamaio.mhrs.entities.concretes.JobTitles;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		
		this.positionDao = positionDao;
				
	}
	
	@Override
	public List<JobTitles> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
