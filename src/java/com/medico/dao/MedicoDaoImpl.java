/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medico.dao;

import com.medico.domain.Medico;
import com.medico.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author labso06
 */
public class MedicoDaoImpl implements MedicoDao{
    // Establecer la sesión con la base de datos
    Session session = null;
    

    @Override
    public List<Medico> obtenerRegistros() {
       try {
            // Abrir sesión
            int var = 1;
            session = HibernateUtil.getSessionFactory().openSession();
            
            // Insertar el objeto en la base de datos
            // listaJugador = session.createQuery("SELECT * FROM jugador").list();
            List<Medico> listaJugador = session.createQuery("FROM Medico").list();
            
            session.close();
            return listaJugador;
        } catch (HibernateException e) {
            System.out.println("Error al obtener los registros: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void crearRegistro(Medico jugador) {
        try {
            // Abrir sesión
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            // Insertar el objeto en la base de datos
            session.save(jugador);
            
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Medico jugador) {
        try {
            // Abrir sesión
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            // Insertar el objeto en la base de datos
            session.update(jugador);
            
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Medico jugador) {
        try {
            // Abrir sesión
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            // Insertar el objeto en la base de datos
            //session.createQuery("DELETE FROM jugador WHERE idJugador=" + idJugador).executeUpdate();
            session.delete(jugador);
            
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());
        }
    }

    @Override
    public Medico obtenerRegistro(int idJugador) {
        try {
            // Abrir sesión
            session = HibernateUtil.getSessionFactory().openSession();
            
            // Insertar el objeto en la base de datos
            // listaJugador = session.createQuery("SELECT * FROM jugador").list();
            Medico jugador = (Medico) session.createQuery("SELECT * FROM medico WHERE idMedico = " + idJugador).uniqueResult();
            
            session.close();
            return jugador;
        } catch (HibernateException e) {
            System.out.println("Error al obtener el registro: " + e.getMessage());
            return null;
        }
    }
   
}
