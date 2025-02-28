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
    private Label label;
    
    
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
       
        
        Emergencia emergencia= new Emergencia(tipoE, tiempoA, nivelP);
        colaEmergencia.encolar(emergencia);
    }
    
    
    @FXML
    private void RemoverCola(ActionEvent event) {
        colaEmergencia.desencolar(); 
    }
    
    
    @FXML
    private void MostrarCola(ActionEvent event) {
        
        textAreaMostrar.setText(colaEmergencia.toString());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        colaEmergencia = new Cola<>();
    }    
    
}
