/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuesto67;

/**
 *
 * @author USER
 */
public class EquipoMaratonProgramacion {
    String nombreEquipo;
    String universidad;
    String lenguajeProgramación;
    
    Programador[] programadores;
    int tamañoEquipo;

    EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramación){
        this.nombreEquipo = nombreEquipo;
        this.universidad = this.universidad;
        this.lenguajeProgramación = this.lenguajeProgramación;
        this.programadores = this.programadores;
        tamañoEquipo = 0;
        programadores = new Programador[3];
    }
    
boolean estaLleno(){
    return tamañoEquipo == programadores.length;
}

void añadir(Programador programador) throws Exception{
    if (estaLleno()==true){
        throw new Exception ("El equipo esta lleno. No se pudo agregar programador");
    }

programadores[tamañoEquipo]=programador;
    tamañoEquipo=tamañoEquipo+1;
}

static void validarCampo(String campo) throws Exception{
    for (int j=0; j<campo.length(); j++){
        char c = campo.charAt(j);
        if (Character.isDigit(c)){
            throw new Exception ("El nombre no puede tener digitos");
        }
    }
    if (campo.length()>20){
        throw new Exception ("La longitud no debe ser superior a 20 caracteres");
    }
}
}
