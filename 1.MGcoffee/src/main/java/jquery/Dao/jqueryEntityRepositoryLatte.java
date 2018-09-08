package jquery.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jquery.Entity.latteEntity;

public interface jqueryEntityRepositoryLatte extends JpaRepository<latteEntity, Integer>{

	latteEntity findById(Integer id);
	Integer deleteById(Integer id);
}
