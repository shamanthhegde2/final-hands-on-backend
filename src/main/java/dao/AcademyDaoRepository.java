package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Academy;
@Repository
public interface AcademyDaoRepository extends JpaRepository<Academy, Integer> {

}
