package com.example.mybooking


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mybooking.R

class MainActivity : AppCompatActivity() {


    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var edt3: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        edt3 = findViewById(R.id.edt3)
        button = findViewById(R.id.btn5)

        button.setOnClickListener {

            val name: String = edt1.text.toString().trim()
            val email: String = edt2.text.toString().trim()
            val pass: String = edt3.text.toString().trim()


            if (name.isEmpty()) {
                edt1.error = "Name is required"
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                edt2.error = "Email is required"
                return@setOnClickListener
            }
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edt2.error = "Invalid email format"
                return@setOnClickListener
            }

            if (pass.isEmpty()) {
                edt3.error = "Password is required"
                return@setOnClickListener
            }


            val intent = Intent(this@MainActivity, MainScreen::class.java)


            startActivity(intent)
        }
    }
}



