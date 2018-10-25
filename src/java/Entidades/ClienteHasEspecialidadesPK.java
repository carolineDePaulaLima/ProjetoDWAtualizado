/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author a1711938
 */
@Embeddable
public class ClienteHasEspecialidadesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cliente_cpf")
    private int clienteCpf;
    @Basic(optional = false)
    @Column(name = "especialidades_id_especialidades")
    private int especialidadesIdEspecialidades;

    public ClienteHasEspecialidadesPK() {
    }

    public ClienteHasEspecialidadesPK(int clienteCpf, int especialidadesIdEspecialidades) {
        this.clienteCpf = clienteCpf;
        this.especialidadesIdEspecialidades = especialidadesIdEspecialidades;
    }

    public int getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(int clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public int getEspecialidadesIdEspecialidades() {
        return especialidadesIdEspecialidades;
    }

    public void setEspecialidadesIdEspecialidades(int especialidadesIdEspecialidades) {
        this.especialidadesIdEspecialidades = especialidadesIdEspecialidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) clienteCpf;
        hash += (int) especialidadesIdEspecialidades;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteHasEspecialidadesPK)) {
            return false;
        }
        ClienteHasEspecialidadesPK other = (ClienteHasEspecialidadesPK) object;
        if (this.clienteCpf != other.clienteCpf) {
            return false;
        }
        if (this.especialidadesIdEspecialidades != other.especialidadesIdEspecialidades) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ClienteHasEspecialidadesPK[ clienteCpf=" + clienteCpf + ", especialidadesIdEspecialidades=" + especialidadesIdEspecialidades + " ]";
    }
    
}
