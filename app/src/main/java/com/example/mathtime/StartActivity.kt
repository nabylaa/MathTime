package com.example.mathtime
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class StartActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var Start: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        Start = findViewById(R.id.start)
        Start.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.start->{
                val intentBiasa = Intent(this@StartActivity, MainActivity::class.java)
                startActivity(intentBiasa)
            }

        }
    }
}