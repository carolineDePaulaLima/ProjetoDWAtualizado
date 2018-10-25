/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author a1711938
 */
@Embeddable
public class ClienteHasHorarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cliente_cpf")
    private int clienteCpf;
    @Basic(optional = false)
    @Column(name = "horario_id_horario")
    private String horarioIdHorario;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Basic(optional = false)
    @Column(name = "especialidades_id_especialidades")
    private int especialidadesIdEspecialidades;

    public ClienteHasHorarioPK() {
    }

    public ClienteHasHorarioPK(int clienteCpf, String horarioIdHorario, Date data, int especialidadesIdEspecialidades) {
        this.clienteCpf = clienteCpf;
        this.horarioIdHorario = horarioIdHorario;
        this.data = data;
        this.especialidadesIdEspecialidades = especialidadesIdEspecialidades;
    }

    public int getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(int clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getHorarioIdHorario() {
        return horarioIdHorario;
    }

    public void setHorarioIdHorario(String horarioIdHorario) {
        this.horarioIdHorario = horarioIdHorario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
        hash += (horarioIdHorario != null ? horarioIdHorario.hashCode() : 0);
        hash += (data != null ? data.hashCode() : 0);
        hash += (int) especialidadesIdEspecialidades;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteHasHorarioPK)) {
            return false;
        }
        ClienteHasHorarioPK other = (ClienteHasHorarioPK) object;
        if (this.clienteCpf != other.clienteCpf) {
            return false;
        }
        if ((this.horarioIdHorario == null && other.horarioIdHorario != null) || (this.horarioIdHorario != null && !this.horarioIdHorario.equals(other.horarioIdHorario))) {
            return false;
        }
        if ((this.data == null && other.data != null) || (this.data != null && !this.data.equals(other.data))) {
            return false;
        }
        if (this.especialidadesIdEspecialidades != other.especialidadesIdEspecialidades) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ClienteHasHorarioPK[ clienteCpf=" + clienteCpf + ", horarioIdHorario=" + horarioIdHorario + ", data=" + data + ", especialidadesIdEspecialidades=" + especialidadesIdEspecialidades + " ]";
    }
    
}
