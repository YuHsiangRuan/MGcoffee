package jquery.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jquery.Entity.pourEntity;

public interface jqueryEntityRepository extends JpaRepository<pourEntity, Integer> {

	pourEntity findById(Integer id);
	Integer deleteById(Integer id);
}
