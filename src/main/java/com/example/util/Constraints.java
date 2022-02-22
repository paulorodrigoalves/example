package com.example.util;

import javafx.scene.control.TextField;

public class Constraints {

    //D -> DÍGITO   * -> QUALQUER QUANTIDADE
    //SE O NOVO VALOR NÃO FOR DESSA FORMA, SERÁ SETADO O VALOR ANTIGO
    public static void setTextFieldInteger(TextField txt){
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*")) {
                txt.setText(oldValue);
            }
        });
    }

    //TESTAR O TAMANHO MÁXIMO
    public static void setTextFieldMaxLength(TextField txt, int max){
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && newValue.length() > max) {
                txt.setText(oldValue);
            }
        });
    }

    //VERIFICAÇÃO DE NÚMERO DOUBLE
    public static void setTextFieldDouble(TextField txt){
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
                txt.setText(oldValue);
            }
        });
    }
}
