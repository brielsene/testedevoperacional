import java.util.Comparator;

public class Empresa implements Comparator<Empresa> {
	private Integer id;
	private String nome;
	private String cnpj;
	private Double taxa;
	private Double saldo;

	public Empresa() {
		super();
	}

	public Empresa(Integer id, String nome, String cnpj, Double taxa, Double saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.taxa = taxa;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	@Override
	public int compare(Empresa o1, Empresa o2) {
		
		return o1.getId().compareTo(o2.getId());
	}

	

}
