package jquery.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="elist")
public class espressoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="cvolum")
	private Integer cvolum;//粉量
	@Column(name="flow")
	private Integer flow;//流速
	@Column(name="color")
	private String color;//顏色
	@Column(name="oil")
	private String oil;//是否含油脂
	@Column(name="note")
	private String note;//筆記
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCvolum() {
		return cvolum;
	}
	public void setCvolum(Integer cvolum) {
		this.cvolum = cvolum;
	}
	public Integer getFlow() {
		return flow;
	}
	public void setFlow(Integer flow) {
		this.flow = flow;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public espressoEntity() {}
}
