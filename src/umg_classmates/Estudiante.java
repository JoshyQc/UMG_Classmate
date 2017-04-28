/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg_classmates;

/**
 *
 * @author EPA
 */
//POJO Plain Old Java Object  :v
public class Estudiante {
    
    private int idEstudiante;
    private String nombreAlumno; 
    private double matematica;
    private double lectura;
    private double fisica;
    private double ortografia;
    
    private Estudiante() {}

    public Estudiante(int idEstudiante, String nombreAlumno,
            double matematica, double lectura, double fisica, double ortografia) {
        this.idEstudiante = idEstudiante;
        this.nombreAlumno = nombreAlumno;
        this.matematica = matematica;
        this.lectura = lectura;
        this.fisica = fisica;
        this.ortografia = ortografia;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public double getMatematica() {
        return matematica;
    }

    public void setMatematica(double matematica) {
        this.matematica = matematica;
    }

    public double getLectura() {
        return lectura;
    }

    public void setLectura(double lectura) {
        this.lectura = lectura;
    }

    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getOrtografia() {
        return ortografia;
    }

    public void setOrtografia(double ortografia) {
        this.ortografia = ortografia;
    }

        
    
}
