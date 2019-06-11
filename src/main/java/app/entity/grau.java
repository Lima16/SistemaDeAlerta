package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela GRAU
 * @generated
 */
@Entity
@Table(name = "\"GRAU\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.grau")
public class grau implements Serializable {

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
  @Column(name = "grauPericulosidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String grauPericulosidade;

  /**
   * Construtor
   * @generated
   */
  public grau(){
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
  public grau setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém grauPericulosidade
   * return grauPericulosidade
   * @generated
   */
  
  public java.lang.String getGrauPericulosidade(){
    return this.grauPericulosidade;
  }

  /**
   * Define grauPericulosidade
   * @param grauPericulosidade grauPericulosidade
   * @generated
   */
  public grau setGrauPericulosidade(java.lang.String grauPericulosidade){
    this.grauPericulosidade = grauPericulosidade;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    grau object = (grau)obj;
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
