package com.jpstudio.versiculododia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proximoVersiculo(View view) {

        String[] versiculos = {
          "Alegre-se, jovem, na sua mocidade! Seja feliz o seu coração nos dias da sua juventude! Siga por onde seu coração mandar, até onde a sua vista alcançar; mas saiba que por todas essas coisas Deus o trará a julgamento.\n" +
                  "\n"
                  +"Eclesiastes 11:9",
          "Não acumulem para vocês tesouros na terra, onde a traça e a ferrugem destroem e onde os ladrões arrombam e furtam. Mas acumulem para vocês tesouros nos céus, onde a traça e a ferrugem não destroem e onde os ladrões não arrombam nem furtam. Pois onde estiver o seu tesouro, aí também estará o seu coração.\n" +
                  "\n"
                  +"Mateus 6:19-21"

        };

        int frases = new Random().nextInt(2);

        TextView texto = findViewById(R.id.VersiculoDoDia);
        texto.setText( versiculos[frases] );

    }
}