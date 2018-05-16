
package com.medico.controller;

import com.medico.domain.Medico;
import com.medico.service.MedicoServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import com.medico.service.MedicoService;
//import javax.inject.Named;

@ViewScoped
@ManagedBean(name = "medicoController")
public class MedicoController implements Serializable{
   private List<Medico> listaRegistro;
   
   private Medico selectedJudor;
   
   private MedicoService jugadorService;   
   
   private Medico medico;

    public MedicoService getJugadorService() {
        return jugadorService;
    }

    public void setJugadorService(MedicoService jugadorService) {
        this.jugadorService = jugadorService;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
   
   
   // Inicializar Objetos al momento de iniciar la ejecucion del programa
   @PostConstruct
   public void init(){
        medico = new Medico();
       jugadorService = new MedicoServiceImpl();
       inicializarListaJugador();
      
   }
   
   // Cargar la lista de registros del jugador
   private void inicializarListaJugador(){
       listaRegistro = new ArrayList<>();
       listaRegistro = jugadorService.obtenerRegistros();
   }
   
   // Método para crea el registro
   public void crearRegistro(Medico jugador){
       jugadorService.crearRegistro(jugador);
   }
   
   public void eliminarRegistro(Medico jugador){
       jugadorService.eliminarRegistro(jugador);
       inicializarListaJugador();
   }
    
   public void actualizarRegistro(Medico jugador){
       jugadorService.actualizarRegistro(jugador);
   }
     
   public Medico obtenerRegistro(Integer idJugador){
      return jugadorService.obtenerRegistro(idJugador);
   }
      
   public List<Medico> obtenerRegistros(){
       return jugadorService.obtenerRegistros();
   }

   public void onRowSelect(SelectEvent event){
      FacesMessage mensaje = new FacesMessage("Jugador Seleccionado", ((Medico) event.getObject()).getIdMedico().toString());
      FacesContext.getCurrentInstance().addMessage(null, mensaje);        
   }
   
   public void onRowEdit(RowEditEvent event){
       
       jugadorService.actualizarRegistro(selectedJudor);
       
       // Medico jugador = (Medico)event.getObject();
       
       FacesMessage mensaje = new FacesMessage("Jugador Actualizado", ((Medico) event.getObject()).getIdMedico().toString());
       FacesContext.getCurrentInstance().addMessage(null, mensaje); 
   }
   
   public void onRowCancel(RowEditEvent event){
       FacesMessage mensaje = new FacesMessage("Jugador Cancelado", ((Medico) event.getObject()).getIdMedico().toString());
       FacesContext.getCurrentInstance().addMessage(null, mensaje);
   }
   
    // GETS Y SETS
    public List<Medico> getListaRegistro() {
        return listaRegistro;   
    }

    public void setListaRegistro(List<Medico> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }

    public Medico getSelectedJudor() {
        return selectedJudor;
    }

    public void setSelectedJudor(Medico selectedJudor) {
        this.selectedJudor = selectedJudor;
    }
}
