package es.riberadeltajo.buscaminas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogoInstrucciones extends DialogFragment {
    onRespuestaListener respuestaListener;
    public interface onRespuestaListener{
        public void onRespuesta(String respuesta);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder info=new AlertDialog.Builder(getActivity());
        info.setTitle("Instrucciones de juego");
        info.setMessage("Cuando pulsas en una casilla, sale un número que identifica cuántas minas hay alrededor: " +
                "Ten cuidado porque si pulsas en una casilla que tenga una mina escondida, perderás. " +
                "Si crees o tienes la certeza de que hay una mina, haz un click largo sobre la casilla para señlarla. " +
                "No hagas click largo en una casilla donde no hay una mina porque perderás. Ganas una vez hayas encontrado todas las minas.");
        info.setPositiveButton("Ok",null);
        return info.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        respuestaListener=(onRespuestaListener)context;
    }
}
