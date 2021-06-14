package kodlamaio.mhrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.mhrs.entities.concretes.JobTitles;

public interface PositionDao extends JpaRepository<JobTitles, Integer> {

}
