
package com.medico.service;

import com.medico.domain.Medico;
import java.util.List;

public interface MedicoService {
    public List<Medico> obtenerRegistros();
    public void crearRegistro(Medico jugador);
    public void actualizarRegistro(Medico jugador);
    public void eliminarRegistro(Medico jugador);
    public Medico obtenerRegistro(int idJugador);
}
