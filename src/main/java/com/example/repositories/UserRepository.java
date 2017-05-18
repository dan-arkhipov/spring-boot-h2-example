package com.example.repositories;

import com.example.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Daniil Arkhipov on 18/05/2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
