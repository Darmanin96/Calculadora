package org.example;

import javafx.beans.property.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class VerControler implements Initializable {
    Calculadora calculadora = new Calculadora();

public VerControler() {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/VerView2.fxml"));
        fxmlLoader.setController(this);
        fxmlLoader.load();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}



    @FXML
    private BorderPane root;

    @FXML
    private Button C;

    @FXML
    private Button CE;

    @FXML
    private GridPane Panel;

    @FXML
    private TextField Result;

    @FXML
    private Button cero;

    @FXML
    private Button divide;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button less;

    @FXML
    private Button multi;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    void onActionC(ActionEvent event) {
        calculadora.borrar();
        Actualizar();
    }

    @FXML
    void onActionCE(ActionEvent event) {
            calculadora.borrarTodo();
            Actualizar();
    }

    @FXML
    void onActionCero(ActionEvent event) {
        calculadora.insertar('0');
        Actualizar();
    }

    @FXML
    void onActionDivide(ActionEvent event) {
            calculadora.operar(Calculadora.DIVIDIR);
            Actualizar();
    }

    @FXML
    void onActionEight(ActionEvent event) {
        calculadora.insertar('8');
        Actualizar();

    }

    @FXML
    void onActionEqual(ActionEvent event) {
        calculadora.operar(Calculadora.IGUAL);
        Actualizar();
    }

    @FXML
    void onActionFive(ActionEvent event) {
        calculadora.insertar('5');
        Actualizar();
    }

    @FXML
    void onActionFour(ActionEvent event) {
        calculadora.insertar('4');
        Actualizar();
    }

    @FXML
    void onActionLess(ActionEvent event) {
        calculadora.operar(Calculadora.RESTAR);
        Actualizar();
    }

    @FXML
    void onActionMulti(ActionEvent event) {
        calculadora.operar(Calculadora.MULTIPLICAR);
        Actualizar();
    }

    @FXML
    void onActionNine(ActionEvent event) {
            calculadora.insertar('9');
            Actualizar();
    }

    @FXML
    void onActionOne(ActionEvent event) {
        calculadora.insertar('1');
        Actualizar();
    }

    @FXML
    void onActionPlus(ActionEvent event) {
        calculadora.operar(Calculadora.SUMAR);
        Actualizar();
    }

    @FXML
    void onActionPoint(ActionEvent event) {
        calculadora.insertarComa();
    }

    @FXML
    void onActionSix(ActionEvent event) {
        calculadora.insertar('6');
        Actualizar();
    }

    @FXML
    void onActionThree(ActionEvent event) {
        calculadora.insertar('3');
        Actualizar();
    }

    @FXML
    void onActionTwo(ActionEvent event) {
        calculadora.insertar('2');
        Actualizar();
    }

    @FXML
    void onActionseven(ActionEvent event) {
        calculadora.insertar('7');
        Actualizar();
    }

    public BorderPane getRoot() {
        return root;
    }

    public void Actualizar(){
        Result.setText(calculadora.getPantalla());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }




}
