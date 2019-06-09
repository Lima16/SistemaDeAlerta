package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiCloud;


/**
 * Classe que representa a tabela REGISTROS
 * @generated
 */
@Entity
@Table(name = "\"REGISTROS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.registros")
public class registros implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String titulo;

  /**
  * @generated
  */
  @Column(name = "comentario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String comentario;

  /**
  * @generated
  */
  @Column(name = "imagem", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiCloud(type = "dropbox", value="3--Ip5uiVtAAAAAAAAAAC0C25lVSFLrV6_788GnMG00FspWAGiOHOSfHHESHHIzI")
  
  private java.lang.String imagem;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_grau", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private grau grau;

  /**
   * Construtor
   * @generated
   */
  public registros(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public registros setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém titulo
   * return titulo
   * @generated
   */
  
  public java.lang.String getTitulo(){
    return this.titulo;
  }

  /**
   * Define titulo
   * @param titulo titulo
   * @generated
   */
  public registros setTitulo(java.lang.String titulo){
    this.titulo = titulo;
    return this;
  }

  /**
   * Obtém comentario
   * return comentario
   * @generated
   */
  
  public java.lang.String getComentario(){
    return this.comentario;
  }

  /**
   * Define comentario
   * @param comentario comentario
   * @generated
   */
  public registros setComentario(java.lang.String comentario){
    this.comentario = comentario;
    return this;
  }

  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  
  public java.lang.String getImagem(){
    return this.imagem;
  }

  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public registros setImagem(java.lang.String imagem){
    this.imagem = imagem;
    return this;
  }

  /**
   * Obtém grau
   * return grau
   * @generated
   */
  
  public grau getGrau(){
    return this.grau;
  }

  /**
   * Define grau
   * @param grau grau
   * @generated
   */
  public registros setGrau(grau grau){
    this.grau = grau;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    registros object = (registros)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
