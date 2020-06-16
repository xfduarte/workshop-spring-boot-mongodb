package info.tegridy.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import info.tegridy.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
