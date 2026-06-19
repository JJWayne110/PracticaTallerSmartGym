package com.fitmanage.smartgym.controller;

import com.fitmanage.smartgym.model.RegistroCentral;
import com.fitmanage.smartgym.model.SensorHilo;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class GymController {

    // Variables enlazadas automáticamente con el archivo FXML mediante sus fx:id
    @FXML private Label labelTemp;
    @FXML private Label labelHum;
    @FXML private Pane panelAlerta;

    private RegistroCentral modelo;

    @FXML
    public void initialize() {
        // Inicialización del recurso crítico compartido
        this.modelo = new RegistroCentral();

        // TODO: Issue #3 - Instanciar las tareas de los sensores climáticos
        // SensorHilo tareaTemp = new SensorHilo("TEMPERATURA", modelo, this);
        // SensorHilo tareaHum = new SensorHilo("HUMEDAD", modelo, this);

        // TODO: Issue #3 - Crear los objetos de tipo Thread correspondientes y arrancar su ejecución (.start())
    }

    public void actualizarPantalla() {
        // TODO: Issue #3 - Implementar la actualización de la UI encapsulada de forma hilo-segura
        // Requisitos:
        // 1. Invocación obligatoria a Platform.runLater(() -> { ... });
        // 2. Dentro del bloque seguro, extraer las métricas actualizadas del 'modelo' usando los getters.
        // 3. Modificar los textos de labelTemp y labelHum.
        // 4. Evaluar condicionalmente si (temperatura > 35 || humedad < 20). Si se cumple, cambiar el fondo
        //    del panelAlerta a color ROJO (-fx-background-color: #d9534f;); de lo contrario, mantenerlo VERDE.
    }
}