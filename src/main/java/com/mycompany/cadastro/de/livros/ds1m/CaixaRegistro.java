package com.mycompany.cadastro.de.livros.ds1m;
import java.util.Scanner;
public class CaixaRegistro {
    public static void main(String[] args) {
        /* DECLARAÇÃO DE OBJETOS */
        Scanner objScanner = new Scanner(System.in);
        Livro objLivro = new Livro();
        
        int opcao = 0;
        while(opcao != 3){
            /* MENU DE ACESSO */
            System.out.println("\n1 - CADASTRAR LIVRO");
            System.out.println("2 - EXIBIR DADOS DO LIVRO");
            System.out.println("3 - SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO (DIGITE O NÚMERO): ");
            opcao = objScanner.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("INSIRA O TÍTULO: ");
                    String titulo = objScanner.next();
                    System.out.println("INSIRA O AUTOR: ");
                    String autor = objScanner.next();
                    System.out.println("INSIRA AS PÁGINAS: ");
                    String paginas = objScanner.next();
                    System.out.println("INSIRA O ISBN: ");
                    String isbn = objScanner.next();
                    System.out.println("INSIRA O valor: ");
                    String valor = objScanner.next();
                    objLivro.cadastrarLivro(titulo, autor, paginas, isbn, valor);
                    break;
                    
                case 2:
                    objLivro.exibirLivro();
                    break;
                    
                case 3:
                    System.out.println("OBRIGADO! VOLTE SEMPRE");
                    break;
                    
                default:
                    System.out.println("OPÇÃO INVÁLIDA! DIGITE NOVAMENTE");
            }
        }
    }
}