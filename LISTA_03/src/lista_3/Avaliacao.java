/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 422UR4H
 */
public class Avaliacao {
    private String nomeAluno;
    private String disciplina;
    private List<Double> notas = new ArrayList<>();
    
    
    // construtor
    public Avaliacao(String nomeAluno, String disciplina) {
        this.nomeAluno = nomeAluno;
        this.disciplina = disciplina;
    }
    
    public void registrarNota(double nota) {
        notas.add(nota);
    }
    
    public double calcularMedia() {
        double media = 0;
        
        for (double nota: notas) {
            media += nota;
        }
        try {
            media /= notas.size();
        } catch (NullPointerException e) {
            System.out.println(e);
            media = 0;
        }
        
        return media;
    }

    
    // getters and setters
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public List<Double> getNotas() {
        return notas;
    }
    
    
}
