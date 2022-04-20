package it.uniroma3.siw.model;

import javax.persistence.*;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String RagioneSociale;
	 
	private int numeroCell;

	private String via;
	
	private int nCivico;
	
	private String comune;
	
	private int cap;
	
	private String provincia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return RagioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		RagioneSociale = ragioneSociale;
	}

	public int getNumeroCell() {
		return numeroCell;
	}

	public void setNumeroCell(int numeroCell) {
		this.numeroCell = numeroCell;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getnCivico() {
		return nCivico;
	}

	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	

}
