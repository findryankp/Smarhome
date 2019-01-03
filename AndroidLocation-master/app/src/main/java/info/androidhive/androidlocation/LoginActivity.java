package info.androidhive.androidlocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user,pass;
    Button buka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        buka = findViewById(R.id.buka);

        buka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("5")||pass.getText().toString().equals("55555"))
                {
                    startActivity(new Intent(LoginActivity.this,QRCodeActivity.class));
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Password atau Username Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
