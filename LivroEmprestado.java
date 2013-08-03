package Questao19;

public class LivroEmprestado {
	//---------------------------  TODO LIVRO EMPRESTADO TERÁ UM PESSOA RELACIONADA  A ELE .
	private Livro livro;   // ACESSO A CLASSE LIVRO
	private Pessoa Pessoa; // ACESSO A CLASSE PESSOA 
	private Livro[] livros = new Livro[20]; // ARRAY DE LIVROS QUE ESTÃO SENDO EMPRESTADOS 
	
	// ----------------------------REGISTRAR UM LIVRO QUE VAI SER EMPRESTADO
	public void EmprestarLivro(Livro livro , Pessoa pessoa){
		for (int i = 0; i < livros.length; i++) {
			if (this.livros[i] == null) {
				this.livros[i]= livro;
				this.Pessoa = pessoa;
				i= this.livros.length;			
			}
		}	
	}
	// ------------------------ RETIRAR UM LIVRO QUANDO RECEBER O LIVRO 
	public boolean ReceberLivro(String nome){
		boolean remove = false;
		
		for (int i = 0; i < livros.length; i++) {
			if (this.livros[i] != null) {
				if (this.livros[i].getTitulo().equalsIgnoreCase(nome)) {
					this.livros[i]=null;
					remove = false;
					
				}
			}
		}
		return remove;
	}
	// --- -------------------------- VER LIVROS REGISTRADOS -- Array de Livros Emprestados 
	public Livro[] LivrosRegristrados(){       
		return this.livros;
	}
	
	//  -------------------------------Métodos SET  e GET  do livro  - só que não serã muito usados devido estarmos usando o array de livros  
	public Livro getLivro() { 
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	//---------------------------------- Métodos SET  e GET  para objeto PESSOA  - é por esse métodos que tenho acesso aos parametros da classe  PESSOA.
	public Pessoa getPessoa() {
		return Pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		Pessoa = pessoa;
	}
	
}
