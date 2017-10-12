package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;

public class Controller {
    /// tenga piedad inge :)
    public TextField oracion;
    public Button evaluar;
    public Label error;
    public TextField resultado;


    public void evaluando() {
        String palabras[] = oracion.getText().split("\\s");
        String acumulador = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == 1) {
                error.setText("No se Aceptan letras");
                return;
            } else {
                error.setText("");
                String letras[] = palabras[0].split("");
                System.out.println(palabras[0].length());

            }

        }
    }

}
