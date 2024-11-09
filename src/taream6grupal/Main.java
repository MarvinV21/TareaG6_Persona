/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taream6grupal;

/**
 *
 * @author marvi
 */

// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear un doctor y un deportista
        Doctor doctor = new Doctor("Juan Lpoez", 40, "Cardiologo");
        Deportista deportista = new Deportista("Marvin Valle", 37, "Futbol");

        // Mostrar información usando el polimorfismo
        doctor.mostrarInformacion();
        deportista.mostrarInformacion();
    }
}