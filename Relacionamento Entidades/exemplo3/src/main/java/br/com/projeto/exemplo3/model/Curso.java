package br.com.projeto.exemplo3.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cursos")
@Getter
@Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String curso;
    
    @ManyToMany(mappedBy = "cursos") //quando usarmos o "mappedBy" o spring não vai gerar uma nova tabela alunos, pq já temos uma pré-tabela definida para ser criada lá em aluno que é a lista de cursos
    private List<Aluno> alunos = new ArrayList<>();
    
}
