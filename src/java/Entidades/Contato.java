/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author a1711938
 */
@Entity
@Table(name = "contato")
@NamedQueries({
    @NamedQuery(name = "Contato.findAll", query = "SELECT c FROM Contato c")})
public class Contato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "contato")
    private String contato;
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private Cliente clienteCpf;
    @JoinColumn(name = "tipo_contato_id_tipo_contato", referencedColumnName = "id_tipo_contato")
    @ManyToOne(optional = false)
    private TipoContato tipoContatoIdTipoContato;

    public Contato() {
    }

    public Contato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Cliente getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(Cliente clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public TipoContato getTipoContatoIdTipoContato() {
        return tipoContatoIdTipoContato;
    }

    public void setTipoContatoIdTipoContato(TipoContato tipoContatoIdTipoContato) {
        this.tipoContatoIdTipoContato = tipoContatoIdTipoContato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contato != null ? contato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contato)) {
            return false;
        }
        Contato other = (Contato) object;
        if ((this.contato == null && other.contato != null) || (this.contato != null && !this.contato.equals(other.contato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Contato[ contato=" + contato + " ]";
    }
    
}
