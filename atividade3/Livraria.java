package Exercicio3;

public class Livraria {

	private	String NomeLivro;
	private	String EscritorLivro;
	private	int DataLivro;
		
	public LojaDeLivros(String NomeLivro, String EscritorLivro ,int DataLivro) {
	this.NomeLivro = NomeLivro;
	this.EscritorLivro = EscritorLivro;
	this.DataLivro = DataLivro;
	}
	
	public String getNomeLivro() {
		return NomeLivro;
	}
	public void setNomeLivro(String NomeLivro) {
		this.NomeLivro = NomeLivro;
	}

	public int getDataLivro() {
		return DataLivro;
	}
	public void setDataLivro(int DataLivro) {
		this.DataLivro = DataLivro;
	}
	public String getEscritorLivro() {
		return EscritorLivro;
	}
	public void setEscritorLivro (String EscritorLivro) {
		this.EscritorLivro = EscritorLivro;
	}
	public void imprimirDados() {
		System.out.println("Livro: " + getNomeLivro());
		System.out.println("Escritor do livro: " + getEscritorLivro());
		System.out.println("Data de publicamento: " + getDataLivro());
		
	}
