package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Corso {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private LocalDate dataInizio;
	
	private int durataInMesi;
	
	@ManyToMany(mappedBy="corsi")
	private List<Allievo> allievi;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST}) //Lazy perchè potrei essere interessato solo alle info sul corso o ai sui allievi.	
	private Docente docente;											 //Cascade.PERSIST perchè è quasi come una composizione: quando rendo persistente il corso
																		 //devo rendere persistente anche il docente.	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurataInMesi() {
		return durataInMesi;
	}

	public void setDurataInMesi(int durataInMesi) {
		this.durataInMesi = durataInMesi;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
}
