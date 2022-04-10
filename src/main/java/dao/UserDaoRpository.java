package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.User;
@Repository
public interface UserDaoRpository extends JpaRepository<User, String> {

}
