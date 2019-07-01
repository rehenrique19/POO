/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.ocp.violacao;

/**
 *
 * @author 
 */
public class Empregado {
    private long id;
    private String nome;
    private String departamento;
    private boolean trabalhando;
    
    
    // construtor
    public Empregado(long id, String nome, String dep, boolean trab) {
        this.id = id;
        this.nome = nome;
        this.departamento = dep;
        this.trabalhando = trab;
    }
    
    // getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
    
    
}
