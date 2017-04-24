package br.com.qualserie.cursoandroid.allinedelara.qualserie;

import android.app.Activity;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imagem;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBarId);
        imageView = (ImageView) findViewById(R.id.imageView3);
        imagem = (ImageView) findViewById(R.id.imagemId);

        imageView.setImageResource(R.drawable.logo);
        imagem.setImageResource(R.drawable.pouco);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int valorProgresso = progress;

                if(valorProgresso == 1){
                    imagem.setImageResource(R.drawable.pouco);
                }else if(valorProgresso == 2){
                    imagem.setImageResource(R.drawable.medio);

                }else if(valorProgresso == 3){
                    imagem.setImageResource(R.drawable.muito);
                }else if(valorProgresso == 4){
                    imagem.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

}
