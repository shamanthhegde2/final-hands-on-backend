package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Institute;

@Repository
public interface InstituteDaoRepository extends JpaRepository<Institute, String> {

}
