package jquery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jquery.Dao.jqueryEntityRepositoryEspresso;
import jquery.Entity.espressoEntity;

@Service
public class espressoService {

	@Autowired
	jqueryEntityRepositoryEspresso jER;
	
	public List<espressoEntity> queryAll() {
		return jER.findAll();
	}
	
	public espressoEntity findUserById(Integer id) {
		return jER.findById(id);
	}
	
	public void save(espressoEntity eE) {
		jER.save(eE);
	}
	
	public void edit(espressoEntity eE) {
		jER.save(eE);
	}
	
	public void delete(Integer id) {
		jER.delete(id);
	}
}
