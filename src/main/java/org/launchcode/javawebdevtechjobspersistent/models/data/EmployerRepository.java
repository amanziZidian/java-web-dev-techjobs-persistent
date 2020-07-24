package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import javax.transaction.Transactional;

@Repository
//@Transactional - only needed in JobRepository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}