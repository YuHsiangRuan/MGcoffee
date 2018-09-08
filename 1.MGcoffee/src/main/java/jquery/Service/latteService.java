package jquery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jquery.Dao.jqueryEntityRepositoryLatte;
import jquery.Entity.latteEntity;

@Service
public class latteService {

	@Autowired
	jqueryEntityRepositoryLatte jER;
	
	public List<latteEntity> queryAll() {
		return jER.findAll();
	}
	
	public latteEntity findUserById(Integer id) {
		return jER.findById(id);
	}
	
	public void save(latteEntity lE) {
		jER.save(lE);
	}
	
	public void edit(latteEntity lE) {
		jER.save(lE);
	}
	
	public void delete(Integer id) {
		jER.delete(id);
	}
}
