package jquery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jquery.Entity.espressoEntity;
import jquery.Entity.latteEntity;
import jquery.Entity.pourEntity;

import jquery.Service.espressoService;
import jquery.Service.latteService;
import jquery.Service.pourService;

@Controller
public class mainController {

	@Autowired
	pourService pS;
	@Autowired
	latteService lS;
	@Autowired
	espressoService eS;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/P")
	public String P(Model model) {
		List<pourEntity> pe = pS.queryAll();
		model.addAttribute("pours", pe);
		return "P";
	}
	
	@RequestMapping("/toPAdd")
    public String toPAdd() {
        return "PAdd";
    }

    @RequestMapping("/padd")
    public String padd(pourEntity pe) {
    	pS.save(pe);
        return "redirect:/P";
    }
    
    @RequestMapping("/toPEdit")
    public String toPEdit(Model model,Integer id) {
    	pourEntity pe = pS.findUserById(id);
        model.addAttribute("pours", pe);
        return "PEdit";
    }

    @RequestMapping("/pedit")
    public String pedit(pourEntity pe) {
    	pS.edit(pe);
        return "redirect:/P";
    }
    
    @RequestMapping("/pdelete")
    public String pdelete(Integer id) {
        pS.delete(id);
        return "redirect:/P";
    }
	
	@RequestMapping("/L")
	public String L(Model model) {
		List<latteEntity> le = lS.queryAll();
		model.addAttribute("lattes", le);
		return "L";
	}
	
	@RequestMapping("/toLAdd")
    public String toLAdd() {
        return "LAdd";
    }

    @RequestMapping("/ladd")
    public String add(latteEntity le) {
    	lS.save(le);
        return "redirect:/L";
    }
    
    @RequestMapping("/toLEdit")
    public String toLEdit(Model model,Integer id) {
    	latteEntity le = lS.findUserById(id);
        model.addAttribute("lattes", le);
        return "LEdit";
    }

    @RequestMapping("/ledit")
    public String edit(latteEntity le) {
    	lS.edit(le);
        return "redirect:/L";
    }
    
    @RequestMapping("/ldelete")
    public String ldelete(Integer id) {
        lS.delete(id);
        return "redirect:/L";
    }
	
	@RequestMapping("/E")
	public String E(Model model) {
		List<espressoEntity> ee = eS.queryAll();
		model.addAttribute("espressos", ee);
		return "E";
	}
	
	@RequestMapping("/toEAdd")
    public String toEAdd() {
        return "EAdd";
    }

    @RequestMapping("/eadd")
    public String add(espressoEntity ee) {
    	eS.save(ee);
        return "redirect:/E";
    }
    
    @RequestMapping("/toEEdit")
    public String toEEdit(Model model,Integer id) {
    	espressoEntity ee = eS.findUserById(id);
        model.addAttribute("espressos", ee);
        return "EEdit";
    }

    @RequestMapping("/eedit")
    public String edit(espressoEntity ee) {
    	eS.edit(ee);
        return "redirect:/E";
    }
    
    @RequestMapping("/edelete")
    public String edelete(Integer id) {
        eS.delete(id);
        return "redirect:/E";
    }
	
	@RequestMapping("/S")
	public String S() {
		return "S";
	}
}
