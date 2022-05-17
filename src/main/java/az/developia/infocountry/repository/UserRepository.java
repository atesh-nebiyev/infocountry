package az.developia.infocountry.repository;

import az.developia.infocountry.model.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByAlias(String alias);
}
