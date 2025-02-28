/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;

 
import Cola.Cola;
import Data.Emergencia; 
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author juanm
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label titulo;
    
    
    @FXML
    private TextField txtNiveLPrioridad;
    
    @FXML
    private TextField txtTipoEmergencia;
    
     @FXML
    private TextField txtTiempoEstimadoAtencion;
    
    @FXML
    private TextArea textAreaMostrar;
    
    
    Cola<Emergencia> colaEmergencia;
    
    
    @FXML
    private void procesarEmergencia(ActionEvent event) {
        
        String tipoE=txtTipoEmergencia.getText();
        int nivelP = Integer.parseInt(txtNiveLPrioridad.getText());
        int tiempoA = Integer.parseInt(txtTiempoEstimadoAtencion.getText());
        
        // Comprobar que la prioridad está entre 1 y 10
            if (nivelP < 1 || nivelP > 10 || tiempoA <= 0) {
                textAreaMostrar.setText("Prioridad debe estar entre 1 y 10, y el tiempo debe ser mayor a 0.");
                return;
            }
            Emergencia emergencia= new Emergencia(tipoE, nivelP);
            
            colaEmergencia.encolar(emergencia);
            
            txtTipoEmergencia.clear();
            txtNiveLPrioridad.clear();
            txtTiempoEstimadoAtencion.clear();
            
            MostrarCola();
        } catch (NumberFormatException e) {
            textAreaMostrar.setText("Error: Prioridad y tiempo deben ser valores numéricos.");
        }
    
    
    @FXML
    private void RemoverCola(ActionEvent event) {
        if (colaEmergencia.estaVacia()) {
            textAreaMostrar.setText("⚠️ No hay emergencias en la cola.");
            return;
        }
        
        Emergencia atendida = colaEmergencia.desencolar();
        textAreaMostrar.setText("Atendida: " + atendida.toString());

        // Actualizar la vista de la cola
        MostrarCola();
    }
        
    
    
    @FXML
    private void MostrarCola(ActionEvent event) {
        
       if (colaEmergencia.estaVacia()) {
            textAreaMostrar.setText("No hay emergencias pendientes.");
        } else {
            textAreaMostrar.setText("Emergencias en cola:\n" + colaEmergencia.toString());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colaEmergencia = new Cola<>();
    }    
    
}
