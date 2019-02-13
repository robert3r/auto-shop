package org.launchcode.models.data;


import org.launchcode.models.Workshop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface WorkshopDao extends CrudRepository<Workshop, Integer> {
}
