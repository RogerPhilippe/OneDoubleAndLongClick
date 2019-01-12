package caraoucoroa.philippesis.com.br.onedoubleandlongclick;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMain = findViewById(R.id.idbtnMain);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                // Criado para detectar duplo clock
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            Toast.makeText(MainActivity.this, "One Click", Toast.LENGTH_SHORT).show();
                        } else if (i == 2) {
                            Toast.makeText(MainActivity.this, "Two Click", Toast.LENGTH_SHORT).show();
                        }
                        i = 0;
                    }
                }, 500);
            }
        });

        btnMain.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Long Click", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

}
