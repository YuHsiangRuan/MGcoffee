package jquery.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jquery.Entity.espressoEntity;

public interface jqueryEntityRepositoryEspresso extends JpaRepository<espressoEntity, Integer>{

	espressoEntity findById(Integer id);
	Integer deleteById(Integer id);
}
