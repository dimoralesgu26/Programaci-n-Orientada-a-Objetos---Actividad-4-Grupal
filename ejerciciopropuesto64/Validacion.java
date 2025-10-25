package ejerciciopropuesto64;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Validacion {
    public static double CalcularDivision(double numerador, double denominador) {
    double cociente = 0;
    try {
        if (denominador > 0) {
            return cociente = numerador/denominador;
    }
    }
    catch (ArithmeticException e) {
    }
    return cociente;
}  

public static String ObtenerTexto(String mensaje) {
    try {
        if(mensaje.isEmpty()==false){
            return mensaje;
        }
    }   
    catch (Exception ex){
        return "Error: " + ex.getMessage();
        }
    return "Texto vacio";
}
}