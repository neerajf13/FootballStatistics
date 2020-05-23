package com.nf.footballStatistics.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nf.footballStatistics.model.Player;


@Repository
public interface PlayerDAO extends CrudRepository<Player, Integer>{

	@Override
	List<Player> findAll();
}
