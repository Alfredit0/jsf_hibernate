
package com.medico.service;

import com.medico.dao.MedicoDaoImpl;
import com.medico.domain.Medico;
import java.util.List;
import com.medico.dao.MedicoDao;

public class MedicoServiceImpl implements MedicoService {
   
    private MedicoDao jugadorDao = new MedicoDaoImpl();

    @Override
    public void crearRegistro(Medico jugador) {
        jugadorDao.crearRegistro(jugador);
    }

    @Override
    public List<Medico> obtenerRegistros() {
        return jugadorDao.obtenerRegistros();
    }

    @Override
    public void actualizarRegistro(Medico jugador) {
        jugadorDao.actualizarRegistro(jugador);
    }

    @Override
    public void eliminarRegistro(Medico jugador) {
        jugadorDao.eliminarRegistro(jugador);
    }

    @Override
    public Medico obtenerRegistro(int idJugador) {
        return jugadorDao.obtenerRegistro(idJugador);
    }
    
}
