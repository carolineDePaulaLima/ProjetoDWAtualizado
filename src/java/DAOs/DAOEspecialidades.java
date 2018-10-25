package DAOs;

import DAOs.DAOGenerico;
import static DAOs.DAOGenerico.em;
import Entidades.Especialidades;
import java.util.ArrayList;
import java.util.List;



public class DAOEspecialidades extends DAOGenerico<Especialidades> {

    public DAOEspecialidades() {
        super(Especialidades.class);
    }

    public int autoIdEspecialidades() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idEspecialidades) FROM Especialidades e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Especialidades> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Especialidades e WHERE e.nomeEspecialidades LIKE :nome").setParameter("nome", "%" + nome + "%").getResultList();
    }

    public List<Especialidades> listById(int id) {
        return em.createQuery("SELECT e FROM Especialidades e WHERE e.idEspecialidades = :id").setParameter("id", id).getResultList();
    }

    public List<Especialidades> listInOrderNome() {
        return em.createQuery("SELECT e FROM Especialidades e ORDER BY e.nomeEspecialidades").getResultList();
    }

    public List<Especialidades> listInOrderId() {
        return em.createQuery("SELECT e FROM Especialidades e ORDER BY e.idEspecialidades").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Especialidades> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getIdEspecialidades() + "-" + lf.get(i).getNomeEspecialidade());
        }
        return ls;
    }
}
