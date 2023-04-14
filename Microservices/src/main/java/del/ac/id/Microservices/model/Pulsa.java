package del.ac.id.Microservices.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pulsa")
public class Pulsa {
	private int id, status, idUser;
	private String jenisKartu, jumlah, harga, tanggal;
	
	public Pulsa() { }

	public Pulsa(int id, String jenisKartu, int idUser, String jumlah, String harga, int status, String tanggal) {
		this.id = id;
		this.jenisKartu = jenisKartu;
		this.idUser = idUser;
		this.jumlah = jumlah;
		this.harga = harga;
		this.status = status;
		this.tanggal = tanggal;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getJenisKartu() { return jenisKartu; }
	public void setJenisKartu(String jenisKartu) { this.jenisKartu = jenisKartu; }

	public int getIdUser() { return idUser; }
	public void setIdUser(int idUser) { this.idUser = idUser; }

	public String getJumlah() { return jumlah; }
	public void setJumlah(String jumlah) { this.jumlah = jumlah; }

	public String getHarga() { return harga; }
	public void setHarga(String harga) { this.harga = harga; }

	public int getStatus() { return status; }
	public void setStatus(int status) { this.status = status; }

	public String getTanggal() { return tanggal; }
	public void setTanggal(String tanggal) { this.tanggal = tanggal; }
}
