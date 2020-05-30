package sample;

import com.jfoenix.controls.*;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javax.print.DocFlavor;
import javax.xml.soap.Text;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    // Aquí declaro algunas variables globales que se usaron.

    private Paises administradorPaises;

    Boolean esAsesor = false;
    Boolean esCliente = false;

    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<Asesor> listaAsesores = new ArrayList<Asesor>();

    public Controller() {

    }

    // Esta sección es de la lista de colecciones uasadas, para los botones desplegables.

    //Sección de tipo de documentos

    ObservableList<String> comboDocumentos =
            FXCollections.observableArrayList("C.C.", "C.E.");

    /*ObservableList<String> comboEstadoCivil =
            FXCollections.observableArrayList("Soltero", "Casado");*/

    //Sección de ubicación geográfica

    ObservableList<String> countryItems =
            FXCollections.observableArrayList("Brasil","Chile","Colombia"
            );

    ObservableList<String> comboDepartamentos =
            FXCollections.observableArrayList("");

    /*ObservableList<String> comboCiudades =
            FXCollections.observableArrayList();*/

    //Sección de nivel - cargo

    ObservableList<String> comboNivel =
            FXCollections.observableArrayList("Practicante", "Junior", "Senior");


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        administradorPaises = new Paises();
        SeleccionPais.setItems(administradorPaises.getCountries());

        campoNombre.addEventFilter(KeyEvent.ANY, numeros);
        campoApellido.addEventFilter(KeyEvent.ANY, numeros);
        campoIdentificacion.addEventFilter(KeyEvent.ANY, numeros);

        campoDireccion.addEventFilter(KeyEvent.ANY, numeros);
        campoTelefono.addEventFilter(KeyEvent.ANY, numeros);

        SeleccionTipoDocumento.setItems(comboDocumentos);
        //SeleccionEstadoCivil.setItems(comboEstadoCivil);

        SeleccionPais.setItems(countryItems);
        SeleccionDepartamento.setItems(comboDepartamentos);
        //SeleccionCiudad.setItems(comboCiudades);


        SeleccionNivel.setItems(comboNivel);

        ToggleGroup grupo = new ToggleGroup();
        botonRadialAsesor.setToggleGroup(grupo);
        botonRadialCliente.setToggleGroup(grupo);

    }

    //Aquí se encuentran todos los botones con acciones, usados en el Scene Builder.

    @FXML
    private ImageView flechaAsesor;
    @FXML
    private ImageView flechaUbicacion;
    @FXML
    private ImageView flechaEducacion;

    @FXML private ImageView flechaGuardados;

    @FXML
    private AnchorPane panelAsesor;
    @FXML
    private AnchorPane panelUbicacion;
    @FXML
    private AnchorPane panelEducacion;

    @FXML private AnchorPane panelGuardados;

    //@FXML
    //private JFXComboBox<String> SeleccionEstadoCivil;
    @FXML
    private JFXComboBox<String> SeleccionTipoDocumento;

    @FXML
    private JFXComboBox<String> SeleccionPais;
    @FXML
    private JFXComboBox<String> SeleccionDepartamento;
   //@FXML
    //private JFXComboBox<String> SeleccionCiudad;

    @FXML
    private JFXComboBox<String> SeleccionNivel;

    @FXML
    private JFXRadioButton botonRadialAsesor;
    @FXML
    private JFXRadioButton botonRadialCliente;

    @FXML
    private JFXTextField campoNombre;
    @FXML
    private JFXTextField campoApellido;
    @FXML
    private JFXTextField campoIdentificacion;

    @FXML private JFXTextField AreaPerteneciente;
    @FXML private JFXTextField carreraEstudiando;

    @FXML private JFXTextField campoDireccion;
    @FXML private JFXTextField campoTelefono;

    @FXML private Label nombreCliente1;
    @FXML private Label apellidoCliente1;
    @FXML private Label identificacionCliente1;

    @FXML private Label nombreCliente2;
    @FXML private Label apellidoCliente2;
    @FXML private Label identificacionCliente2;

    @FXML private Label nombreAsesor1;
    @FXML private Label apellidoAsesor1;
    @FXML private Label identificacionAsesor1;

    @FXML private Label nombreAsesor2;
    @FXML private Label apellidoAsesor2;
    @FXML private Label identificacionAsesor2;

    //Aquí se encuentran todos los métodos que hacen funcionar los íconos como botones.

    public void botonSalir(MouseEvent event) {

        Platform.exit();
        System.exit(0);
    }

    public void botonAsesor(MouseEvent event) {

        if (panelAsesor.isVisible()) {
            panelAsesor.setVisible(false);
            flechaAsesor.setVisible(false);
            return;
        }

        panelAsesor.setVisible(true);
        flechaAsesor.setVisible(true);

        panelUbicacion.setVisible(false);
        flechaUbicacion.setVisible(false);

        panelEducacion.setVisible((false));
        flechaEducacion.setVisible(false);

        panelGuardados.setVisible(false);
        flechaGuardados.setVisible(false);

    }

    public void botonUbicacion(MouseEvent event) {

        if (panelUbicacion.isVisible()) {

            panelUbicacion.setVisible(false);
            flechaUbicacion.setVisible(false);
            return;
        }

        panelUbicacion.setVisible(true);
        flechaUbicacion.setVisible(true);

        panelAsesor.setVisible(false);
        flechaAsesor.setVisible(false);

        panelEducacion.setVisible((false));
        flechaEducacion.setVisible(false);

        panelGuardados.setVisible(false);
        flechaGuardados.setVisible(false);

    }

    public void botonEducacion(MouseEvent event) {

        if (panelEducacion.isVisible()) {

            panelEducacion.setVisible(false);
            flechaEducacion.setVisible(false);
            return;
        }

        panelEducacion.setVisible(true);
        flechaEducacion.setVisible(true);

        panelUbicacion.setVisible(false);
        flechaUbicacion.setVisible(false);
        panelAsesor.setVisible((false));
        flechaAsesor.setVisible(false);

        panelGuardados.setVisible(false);
        flechaGuardados.setVisible(false);

        SeleccionNivel.requestFocus();
    }

    public void botonGuardados(MouseEvent event) {

        if (panelGuardados.isVisible()) {

            panelGuardados.setVisible(false);
            flechaGuardados.setVisible(false);
            return;
        }

        panelEducacion.setVisible(false);
        flechaEducacion.setVisible(false);

        panelUbicacion.setVisible(false);
        flechaUbicacion.setVisible(false);

        panelAsesor.setVisible((false));
        flechaAsesor.setVisible(false);

        panelGuardados.setVisible(true);
        flechaGuardados.setVisible(true);

        consultarClientes();
        consultarAsesores();

    }

    public void consultarAsesores(){

        System.out.println(listaAsesores.size());

        int auxiliar = 0;

        for(Asesor asesor: listaAsesores){

            if(auxiliar == 0){

                nombreAsesor1.setText(asesor.nombre);
                apellidoAsesor1.setText(asesor.apellido);
                identificacionAsesor1.setText(Integer.toString(asesor.identificacion));

                auxiliar++;

            }else{

                nombreAsesor2.setText(asesor.nombre);
                apellidoAsesor2.setText(asesor.apellido);
                identificacionAsesor2.setText(Integer.toString(asesor.identificacion));

            }
        }

    }


    public void consultarClientes(){

        System.out.println(listaClientes.size());

        int auxiliar = 0;

            for(Cliente cliente: listaClientes){

                if(auxiliar == 0){

                    nombreCliente1.setText(cliente.nombre);
                    apellidoCliente1.setText(cliente.apellido);
                    identificacionCliente1.setText(Integer.toString(cliente.identificacion));

                    auxiliar++;

                }else{

                    nombreCliente2.setText(cliente.nombre);
                    apellidoCliente2.setText(cliente.apellido);
                    identificacionCliente2.setText(Integer.toString(cliente.identificacion));

                }
            }

    }

    /*EventHandler<KeyEvent> letras = new EventHandler<KeyEvent>() {

        private boolean willConsume = false;

        @Override
        public void handle(KeyEvent event) {

            Object tempo = event.getSource();
            if (willConsume) {

                event.consume();
            }
            String temp = event.getCode().toString();
            if (!event.getCode().toString().matches("[a-zA-Z]") && event.getCode() != KeyCode.BACK_SPACE
                    && event.getCode() != KeyCode.SHIFT) {

                if (event.getEventType() == KeyEvent.KEY_PRESSED) {
                    willConsume = true;
                } else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
                    willConsume = false;
                }
            }
        }
    };
*/

    // Con este EventHandler se pretendía controlar la cantidad de números ingresados.

    EventHandler<KeyEvent> numeros = new EventHandler<KeyEvent>() {

        private boolean willConsume = false;
        private int maxLength = 30;

        @Override
        public void handle(KeyEvent event) {
            JFXTextField temp = (JFXTextField) event.getSource();

            if (willConsume) {
                event.consume();
            }

            if (!event.getText().matches("[0-9]") && event.getCode() != KeyCode.BACK_SPACE) {
                if (event.getEventType() == KeyEvent.KEY_PRESSED) {
                    willConsume = false;
                } else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
                    willConsume = false;
                }
            }
            if (temp.getText().length() > maxLength - 1) {
                if (event.getEventType() == KeyEvent.KEY_PRESSED) {
                    willConsume = true;
                } else if (event.getEventType() == KeyEvent.KEY_RELEASED) {
                    willConsume = false;
                }
            }
        }
    };

    //En esta sección se realizó el código para los botones desplegables o seleccionables.

    public void cambiarPaises(ActionEvent event){

        SeleccionDepartamento.setDisable(false);
        for(int i = 0; i < administradorPaises.getSize(); i++){
            if(SeleccionPais.getValue().equals(administradorPaises.getCountry(i))){
                SeleccionDepartamento.setItems(administradorPaises.getStates(i));
            }
        }
    }

    public void cambiarCiudades(ActionEvent event){

        //SeleccionCiudad.setDisable(false);
        /*for(int j = 0; j < administradorPaises.getSize(); j++){
            if(SeleccionDepartamento.getValue().equals(administradorPaises.getStates(j))){
                SeleccionCiudad.setItems(administradorPaises.getCities(j));
            }*/
        }

    public void cambiarNivel (ActionEvent event){

        for(int k = 1; k< comboNivel.size(); k++){
            if (SeleccionNivel.getValue().equals(comboNivel.get(k))){
                AreaPerteneciente.setDisable(false);
                return;

            }
        }
        AreaPerteneciente.setDisable(true);
    }

    public void toggleEstudiante(ActionEvent event){

        if(carreraEstudiando.isDisable())
        carreraEstudiando.setDisable(false);
        else {
            carreraEstudiando.setText("");
            carreraEstudiando.setDisable(true);
        }

    }

    //El botonGuardar, que valida los campos y crea los objetos "Asesor" o "Cliente".

    public void botonGuardar(ActionEvent event){

        //ALERTA
        if(
                (campoNombre.getText().isEmpty()) || (campoApellido.getText().isEmpty()) || (campoIdentificacion.getText().isEmpty())
        || (campoTelefono.getText().isEmpty()) || (campoDireccion.getText().isEmpty()) || ((!esCliente) && (!esAsesor))

        ){

            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Información");
            alerta.setContentText(" Hay campos sin diligenciar");
            alerta.showAndWait();

        }

        else {

            if(esCliente){

                Cliente cliente1 = new Cliente(campoNombre.getText(), campoApellido.getText(),
                        Integer.parseInt(campoIdentificacion.getText()), campoDireccion.getText(),
                        Integer.parseInt(campoTelefono.getText()), SeleccionPais.getValue());



                listaClientes.add(cliente1);

                System.out.println(cliente1.nombre);
                System.out.println(cliente1.apellido);
                System.out.println(cliente1.identificacion);
                System.out.println(cliente1.numeroTelefono);
                System.out.println(cliente1.pais);


            }else{
                Asesor asesor1 = new Asesor(campoNombre.getText(), campoApellido.getText(),
                        Integer.parseInt(campoIdentificacion.getText()), SeleccionNivel.getValue());

                listaAsesores.add(asesor1);

                System.out.println(asesor1.nombre + "\n" +
                         asesor1.apellido + "\n" +
                         asesor1.identificacion + "\n" +
                        asesor1.nivel);

            }

        }

    }

    public void setAsesor(){

        esAsesor = !esAsesor;
    }

    public void setCliente(){

        esCliente = !esCliente;
    }
}