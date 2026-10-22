package es.riberadeltajo.buscaminas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogoConfiguracion extends DialogFragment {
    DialogoConfiguracion.onRespuestaListener respuestaListener;
    public interface onRespuestaListener{
        public void onRespuesta(String respuesta);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder confi=new AlertDialog.Builder(getActivity());
        confi.setTitle("Dificultad");
        String[]opciones={"principiante", "amateur", "avanzado"};
        confi.setSingleChoiceItems(opciones, -1, ((dialog, which) ->
                respuestaListener.onRespuesta(opciones[which])));
        confi.setPositiveButton("Ok",null);
        return confi.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        respuestaListener=(DialogoConfiguracion.onRespuestaListener)context;
    }

}
