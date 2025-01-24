package com.juan.app_spring_01.repository;

import com.juan.app_spring_01.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
