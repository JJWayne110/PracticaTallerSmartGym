package com.fitmanage.smartgym.model;

import com.fitmanage.smartgym.controller.GymController;
import java.util.Random;

// TODO: Issue #2 - Modificar la firma de la clase para que pueda ejecutarse en un hilo secundario

public class SensorHilo {
    private final String tipoSensor; // Recibe "TEMPERATURA" o "HUMEDAD"
    private final RegistroCentral modelo;
    private final GymController controlador;
    private final Random random = new Random();

    public SensorHilo(String tipoSensor, RegistroCentral modelo, GymController controlador) {
        this.tipoSensor = tipoSensor;
        this.modelo = modelo;
        this.controlador = controlador;
    }

// TODO: Issue #2 - Sobrescribir el método de ciclo de vida del hilo
// Requisitos:
// 1. Crear un ciclo infinito 'while' controlado.
// 2. Si 'tipoSensor' es "TEMPERATURA", generar un aleatorio entre 15 y 45 y llamar a modelo.registrarTemperatura().
// 3. Si 'tipoSensor' es "HUMEDAD", generar un aleatorio entre 10 y 90 y llamar a modelo.registrarHumedad().
// 4. Invocar el método controlador.actualizarPantalla() para gatillar el refresco visual.
// 5. Utilizar Thread.sleep() para pausar la ejecución del hilo de forma asíncrona.
}