package jquery.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plist")
public class pourEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id") // PK，AI
	private Integer id;
	@Column(name="beanname")
	private String beanname;//豆名
	@Column(name="roasting")
	private String roasting;//烘焙度，下拉選單
	@Column(name="ground")
	private String ground;//研磨度，下拉選單
	@Column(name="degree")
	private Integer degree;//水溫
	@Column(name="volume")
	private Integer volume;//容量
	@Column(name="cvolume")
	private Integer cvolume;//粉量
	@Column(name="note")
	private String note;//筆記
	
	public Integer getCvolume() {
		return cvolume;
	}
	public void setCvolume(Integer cvolume) {
		this.cvolume = cvolume;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBeanname() {
		return beanname;
	}
	public void setBeanname(String beanname) {
		this.beanname = beanname;
	}
	public String getRoasting() {
		return roasting;
	}
	public void setRoasting(String roasting) {
		this.roasting = roasting;
	}
	public String getGround() {
		return ground;
	}
	public void setGround(String ground) {
		this.ground = ground;
	}
	public Integer getDegree() {
		return degree;
	}
	public void setDegree(Integer degree) {
		this.degree = degree;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public pourEntity() {}
	
}
