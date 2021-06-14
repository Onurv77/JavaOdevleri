package kodlamaio.mhrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.mhrs.entities.abstracts.EntityInterface;


@Entity
@Table(name = "job_titles")
public class JobTitles implements EntityInterface{
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "title")
	private String title;
	
	
	

}
