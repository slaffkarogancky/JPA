package kharkov.kp.gic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GOPNIKI")

public class Gopnik {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GENERATE_GOPNIK_ID")	
	@SequenceGenerator(name="GENERATE_GOPNIK_ID", sequenceName = "GEN_GOPNIK_ID", initialValue=1, allocationSize=1)
	private int id;
	
	@Column(name="klikuha")
	private String klikuha;

	public Gopnik(String klikuha) {
		super();
		this.klikuha = klikuha;
	}

	// Constructors
	public Gopnik() {
		super();
	}

	public int getId() {
		return id;
	}

	// Getters & setters
	public void setId(int id) {
		this.id = id;
	}
	

	public String getKlikuha() {
		return klikuha;
	}

	public void setKlikuha(String klikuha) {
		this.klikuha = klikuha;
	}

	@Override
	public String toString() {
		return "Gopnik [id=" + id + ", klikuha=" + klikuha + "]";
	}
	
	
	
}
