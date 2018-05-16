/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medico.dao;

import com.medico.domain.Medico;
import java.util.List;

/**
 *
 * @author labso06
 */
public interface MedicoDao {
    public List<Medico> obtenerRegistros();
    public void crearRegistro(Medico jugador);
    public void actualizarRegistro(Medico jugador);
    public void eliminarRegistro(Medico jugador);
    public Medico obtenerRegistro(int idJugador);

}
