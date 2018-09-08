package jquery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jquery.Dao.jqueryEntityRepository;
import jquery.Entity.pourEntity;

@Service
public class pourService {

	@Autowired
	jqueryEntityRepository jER;
	
	public List<pourEntity>queryAll() {
		return jER.findAll();
	}
	
	public pourEntity findUserById(Integer id) {
		return jER.findById(id);
	}
	
	public void save(pourEntity pE) {
		jER.save(pE);
	}
	
	public void edit(pourEntity pE) {
		jER.save(pE);
	}
	
	public void delete(Integer id) {
		jER.delete(id);
	}
}
