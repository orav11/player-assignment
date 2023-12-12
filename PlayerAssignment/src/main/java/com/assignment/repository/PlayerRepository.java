package com.assignment.repository;

import com.assignment.model.Player;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends ListCrudRepository<Player,String> {
}
