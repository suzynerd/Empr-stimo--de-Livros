package Questao19;

import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
	int ler =-1;	
	
	Livro objLivro = new Livro();  // OBJETO DO TIPO LIVRO 
	Pessoa objPessoa = new Pessoa(); // OBJETO DO TIPO PESSOA 
	LivroEmprestado LivroEmprestimo = null; // CLASSE  LIVROEMPRESTADO 

	
	while(ler != 0){ // ENQUANTO A OP«√O FOR DIFERENTE DE ZERO , QUE SER¡ A SAÕDA DO SISTEMA 
		System.out.println("1-Emprestar Livro");
		System.out.println("2-Receber Livro");
		System.out.println("3-Ver livros emprestados");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("OpÁ„o : ");
		ler = sc.nextInt();
		
			switch (ler) {
			// CASO OP«√O DIGITADA SEJA 1 - ONDE QUER REGISTRAR O EMPRESTIMO DO LIVRO A UMA DETERMINADA PESSOA 
			case 1:
				
				//-------- LER DADOS CADASTRADOS 
				 LivroEmprestimo = new LivroEmprestado();
				System.out.println("Nome Cadastro :");
				String nome =sc.next();
				System.out.println("CPF Usu√°rio cadastrado:");
				String cpf = sc.next();
				System.out.println("Digite Nome Livro :");
				String nomelivro =sc.next();
				System.out.println("Digite Autor do Livro :");
				String autorlivro =sc.next();
				System.out.println("Digite Editora do Livro:");
				String editoralivro = sc.next();
				
				// SETAR OS VALORES DIGITADOS NAS CLASSES PESSOA E LIVRO 
				objPessoa.setNome(nome);
				objPessoa.setCpf(cpf);
				objLivro.setTitulo(nomelivro);
				objLivro.setAutor(autorlivro);
				objLivro.setEditora(editoralivro);
				
				//  REGISTRAR O EMPRESTIMO DO LIVRO - LEVANDO COMO PARAMETROS O OBJETO LIVRO E PESSOA. 
				LivroEmprestimo.EmprestarLivro(objLivro,objPessoa);
				
				break;
			case 2:
				
				//CASO OP«√O DIGITADA SEJA  2  - ENT√O QUER REMOVER DO CADASTRO UM LIVRO DE UMA  PESSOA.
				System.out.println("Digite o nome do Livro que ser√° devolvido : ");
				nomelivro =sc.next();
				
				//CHAMADA  DO M…TODO RECEBER LIVRO QUE LEVA COMO PARAMETRO  O NOME DO LIVRO PARA FAZER UMA VERIFICA«√O E REMOVER NO ARRAY
				LivroEmprestimo.ReceberLivro(nomelivro);
				System.out.println("Livro Devolvido com sucesso");
				
				break;
			case 3:
				
				// CASO A OP«√O DIGTADA SEJA 3 - ENT√O QUER VER OS LIVROS QUE FORAM EMPRESTADOS A DETERMINADAS PESSOAS. 
				System.out.println("-- LIVROS EMPRESTADOS--- ");
				
				Livro[] livros_emprestados = LivroEmprestimo.LivrosRegristrados(); // minha array de livros com o objeto LivroEmprestimo que ir√° acessar o met√≥do livros registrados.
				
				if (livros_emprestados.length ==0) { // VER SE TEM LIVROS  EMPRESTADOS SE N√O MANDA  A MENSAGEM PERSONALIZADA 
					System.out.println("N√ÉO TEM LIVROS EMPRESTADOS NO BANCO DE REGISTROS");
				}else{
				
					// SE TIVER LIVROS EMPRESTADOS IR¡ BUSCAR NO ARRAY 
					for (int i = 0; i < livros_emprestados.length; i++) { 
						if (livros_emprestados[i] != null) {  // OLHA  A POSI«√O  SE TEM UM ITEM 
							
							// LISTA O LIVRO E A PESSOA 
							System.out.println("*******************************************************");
							System.out.println("------------------LIVRO------------------------");
							System.out.println("LIVRO:"+livros_emprestados[i].getTitulo());
							System.out.println("AUTOR:"+livros_emprestados[i].getAutor());
							System.out.println("EDITORA:"+livros_emprestados[i].getEditora());
							System.out.println("------------------PESSOA-------------------------");
							System.out.println("Nome  :" +LivroEmprestimo.getPessoa().getNome());
							System.out.println("CPF:"+ LivroEmprestimo.getPessoa().getCpf());
							System.out.println("*******************************************************");
						}
					}
				}
				break;
	
			default:
				break;
			}
		
			}
	}
}
