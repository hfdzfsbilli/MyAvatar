package com.example.myavatar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText prodiInput;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referensi elemen UI
        prodiInput = findViewById(R.id.prodi_input);
        submitButton = findViewById(R.id.submit_button);

        // Set onClickListener untuk tombol Submit
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String programStudi = prodiInput.getText().toString().trim();

                // Cek apakah input Program Studi tidak kosong
                if (!programStudi.isEmpty()) {
                    // Menampilkan Toast jika program studi berhasil ditambahkan
                    Toast.makeText(MainActivity.this, "Program Studi: " + programStudi + " berhasil ditambahkan!", Toast.LENGTH_SHORT).show();
                } else {
                    // Menampilkan pesan kesalahan jika input kosong
                    Toast.makeText(MainActivity.this, "Harap masukkan Program Studi!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
