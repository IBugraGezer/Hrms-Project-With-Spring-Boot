package burra.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import burra.hrms.entities.concretes.JobTitle;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
