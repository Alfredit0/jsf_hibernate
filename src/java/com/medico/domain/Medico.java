package com.medico.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // autoincrementar el id en la base de datos
    private Long idMedico;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "apellidos", nullable = false, length = 50)
    private String apellidos;
        
    @Column(name = "especialidad", nullable = false, length = 50)
    private String especialidad;
    
    @Column(name = "curp", nullable = false, length = 50)
    private String curp;
    
    @Column(name = "direccion", nullable = false, length = 50)
    private String direccion;
    
    @Column(name = "telefono", nullable = false, length = 50)
    private String telefono;
    
    @Column(name = "salario_m", nullable = true)
    private long salario_m;
    
    @Column(name = "estadocivil", nullable = true)
    private String estadocivil;
    
    @Column(name = "puesto", nullable = true)
    private String puesto;

    public Medico(String nombre) {
        this.nombre = nombre;
    }

    public Medico() {
    }

    
    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idJugador) {
        this.idMedico = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getSalario_m() {
        return salario_m;
    }

    public void setSalario_m(long salario_m) {
        this.salario_m = salario_m;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
