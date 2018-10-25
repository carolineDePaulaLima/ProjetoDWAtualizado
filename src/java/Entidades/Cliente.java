/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author a1711938
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private Integer cpf;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @JoinColumn(name = "sexo_idsexo", referencedColumnName = "idsexo")
    @ManyToOne(optional = false)
    private Sexo sexoIdsexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<ClienteHasHorario> clienteHasHorarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCpf")
    private List<Contato> contatoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<ClienteHasEspecialidades> clienteHasEspecialidadesList;

    public Cliente() {
    }

    public Cliente(Integer cpf) {
        this.cpf = cpf;
    }

    public Cliente(Integer cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexoIdsexo() {
        return sexoIdsexo;
    }

    public void setSexoIdsexo(Sexo sexoIdsexo) {
        this.sexoIdsexo = sexoIdsexo;
    }

    public List<ClienteHasHorario> getClienteHasHorarioList() {
        return clienteHasHorarioList;
    }

    public void setClienteHasHorarioList(List<ClienteHasHorario> clienteHasHorarioList) {
        this.clienteHasHorarioList = clienteHasHorarioList;
    }

    public List<Contato> getContatoList() {
        return contatoList;
    }

    public void setContatoList(List<Contato> contatoList) {
        this.contatoList = contatoList;
    }

    public List<ClienteHasEspecialidades> getClienteHasEspecialidadesList() {
        return clienteHasEspecialidadesList;
    }

    public void setClienteHasEspecialidadesList(List<ClienteHasEspecialidades> clienteHasEspecialidadesList) {
        this.clienteHasEspecialidadesList = clienteHasEspecialidadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cliente[ cpf=" + cpf + " ]";
    }
    
}
