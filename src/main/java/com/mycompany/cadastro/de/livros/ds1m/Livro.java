
package com.mycompany.cadastro.de.livros.ds1m;

import java.util.Scanner;

public class Livro {
    Scanner objScanner = new Scanner(System.in);
    
    /* DECLARAÇÃO DE ATRIBUTOS */
    private String titulo;
    private String autor;
    private String paginas;
    private String isbn;
    private String valor;
    
    /* MÉTODOS FUNCIONAIS DA CLASSE */
    // CADASTRO DO LIVRO
    public void cadastrarLivro(String titulo, String autor, String paginas, String isbn, String valor){
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        setIsbn(isbn);
        setValor(valor);
    }
    
    // EXIBIR DADOS DO LIVRO
    public void exibirLivro(){
        System.out.println("TÍTULO: " + getTitulo());
        System.out.println("AUTOR: " + getAutor());
        System.out.println("PÁGINAS: " + getPaginas());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("VALOR: R$" + getValor());
    }
    
    /* MÉTODOS DE GET E SET DA CLASSE */
    // MÉTODOS GET
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getPaginas(){
        return paginas;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public String getValor(){
        return valor;
    }
    
    // MÉTODOS SET
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setPaginas(String paginas){
        this.paginas = paginas;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }

    void cadastrarLivro(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}