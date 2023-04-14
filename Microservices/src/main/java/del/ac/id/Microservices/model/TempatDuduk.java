package del.ac.id.Microservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tempat_duduk")
public class TempatDuduk {
	private int id, idUser, nomor, status;
	private String tanggal;

	public TempatDuduk() { }

	public TempatDuduk(int id, int idUser, int nomor, String tanggal, int status) {
		this.id = id;
		this.idUser = idUser;
		this.nomor = nomor;
		this.tanggal = tanggal;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getIdUser() { return idUser; }
	public void setIdUser(int idUser) { this.idUser = idUser; }

	public int getNomor() { return nomor; }
	public void setNomor(int nomor) { this.nomor = nomor; }

	public String getTanggal() { return tanggal; }
	public void setTanggal(String tanggal) { this.tanggal = tanggal; }

	public int getStatus() { return status; }
	public void setStatus(int status) { this.status = status; }
}
