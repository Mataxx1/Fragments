package mx.udg.cuvalles.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private EditText etDatos;
    private Button btnEnviar;
    private DataListener callback;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            callback = (DataListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString()+" No se puede implementar DataListener");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_blank, container, false);

        etDatos = (EditText) vista.findViewById(R.id.textoInput);
        btnEnviar = (Button) vista.findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String textToSend = etDatos.getText().toString();
                callback.sendData(textToSend);
            }
        });


        return vista;
    }

    public interface DataListener{
        void sendData(String text);

    }
}
