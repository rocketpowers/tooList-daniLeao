package todoListPackages.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import todoListPackages.user.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
