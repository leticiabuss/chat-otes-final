package br.edu.oprofvalmor.cliente2.modelo;

import androidx.databinding.ObservableField;

import java.util.List;

public class ListaMensagens {
    private static ObservableField<List<String>> listaMensagens = new ObservableField<List<String>>();
    public static ObservableField<List<String>> getListaDeMensagens() {
        return listaMensagens;
    }
}
