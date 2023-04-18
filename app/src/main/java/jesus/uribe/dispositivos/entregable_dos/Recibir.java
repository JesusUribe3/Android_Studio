package jesus.uribe.dispositivos.entregable_dos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class Recibir extends AppCompatActivity {

    String nombre, titulo, mensaje, hora, telefono, ciudad;

    TextView textoNombre, textoTitulo, textoMensaje, textoHora, textoTelefono, textoCiudad;

    int imagen;

    CircleImageView image;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);
        textoNombre = findViewById(R.id.textoNombre);
        textoTitulo = findViewById(R.id.textoTitulo);
        textoMensaje = findViewById(R.id.textoMensaje);
        textoTelefono = findViewById(R.id.telefono);
        textoCiudad = findViewById(R.id.ciudad);
        textoHora = findViewById(R.id.tv_ultimaHora);
        image = findViewById(R.id.imagen);

        Intent datos = getIntent();
        if (datos !=null){
            nombre = datos.getStringExtra("nombre");
            titulo = datos.getStringExtra("titulo");
            mensaje = datos.getStringExtra("mensaje");
            hora = datos.getStringExtra("hora");
            telefono = datos.getStringExtra("telefono");
            ciudad = datos.getStringExtra("ciudad");
            imagen = datos.getIntExtra("imagen", R.drawable.ronaldinho);

            textoCiudad.setText(ciudad);
            textoNombre.setText(nombre);
            textoTelefono.setText(telefono);
            textoTitulo.setText((titulo));
            textoMensaje.setText((mensaje));
            image.setImageResource(imagen);
        }
    }
}