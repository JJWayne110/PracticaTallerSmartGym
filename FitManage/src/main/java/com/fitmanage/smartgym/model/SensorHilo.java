package com.fitmanage.smartgym.model;

import com.fitmanage.smartgym.controller.GymController;
import java.util.Random;

public class SensorHilo implements Runnable {
    private final String tipoSensor; // Recibe "TEMPERATURA" o "HUMEDAD"
    private final RegistroCentral modelo;
    private final GymController controlador;
    private final Random random = new Random();

    public SensorHilo(String tipoSensor, RegistroCentral modelo, GymController controlador) {
        this.tipoSensor = tipoSensor;
        this.modelo = modelo;
        this.controlador = controlador;
    }

    @Override
    public void run(){
        boolean flip = true;
        while(flip){
            switch (tipoSensor){
                case "temperatura":
                    modelo.registrarTemperatura(Math.round(10 * (15 + (Math.random() * 46))) / 10.0);
                    controlador.actualizarPantalla();
                    break;
                case "humedad":
                    modelo.registrarHumedad(Math.round(10 * (10 + (Math.random() * 91))) / 10.0);
                    controlador.actualizarPantalla();
                    break;
                default:
                    System.out.println("Error al registrar un tipo de sensor");
                    controlador.actualizarPantalla();
                    break;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
// TODO: Issue #2 - Sobrescribir el método de ciclo de vida del hilo
// Requisitos:
// 1. Crear un ciclo infinito 'while' controlado.
// 2. Si 'tipoSensor' es "TEMPERATURA", generar un aleatorio entre 15 y 45 y llamar a modelo.registrarTemperatura().
// 3. Si 'tipoSensor' es "HUMEDAD", generar un aleatorio entre 10 y 90 y llamar a modelo.registrarHumedad().
// 4. Invocar el metodo controlador.actualizarPantalla() para gatillar el refresco visual.
// 5. Utilizar Thread.sleep() para pausar la ejecución del hilo de forma asíncrona.
}