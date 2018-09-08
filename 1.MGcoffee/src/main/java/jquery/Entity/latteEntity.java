package jquery.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="llist")
public class latteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id; //pk，ai
	@Column(name="mdegree")
	private Integer mdegree;//打奶溫度
	@Column(name="mtime")
	private Integer mtime;//打奶時間
	@Column(name="mbrand")
	private String mbrand;//牛奶牌子
	@Column(name="mpic")
	private String mpic;//拉花圖案
	@Column(name="note")
	private String note;//筆記
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMdegree() {
		return mdegree;
	}
	public void setMdegree(Integer mdegree) {
		this.mdegree = mdegree;
	}
	public Integer getMtime() {
		return mtime;
	}
	public void setMtime(Integer mtime) {
		this.mtime = mtime;
	}
	public String getMbrand() {
		return mbrand;
	}
	public void setMbrand(String mbrand) {
		this.mbrand = mbrand;
	}
	public String getMpic() {
		return mpic;
	}
	public void setMpic(String mpic) {
		this.mpic = mpic;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public latteEntity() {}
}
