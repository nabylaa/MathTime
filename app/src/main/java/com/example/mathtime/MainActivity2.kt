package com.example.mathtime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.*


class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    private lateinit var etAngka1: EditText
    private lateinit var etAngka2: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvHasil: TextView
    private lateinit var spOperator: Spinner
    private lateinit var btn_exit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        btn_exit = findViewById(R.id.btn_exit)
        btn_exit.setOnClickListener(this)

        etAngka1 = findViewById(R.id.et_angka1)
        etAngka2 = findViewById(R.id.et_angka2)
        btnHitung = findViewById(R.id.btn_hitung)
        tvHasil = findViewById(R.id.tv_hasil)
        spOperator = findViewById(R.id.sp_operator)

        btnHitung.setOnClickListener {
            val nilaiAngka1 = etAngka1.text.toString().toInt()
            val nilaiAngka2 = etAngka2.text.toString().toInt()

            tvHasil.text = doHitungHasil(nilaiAngka1, nilaiAngka2)
        }
    }

    private fun doHitungHasil(nilai1: Int, nilai2: Int): String {
        var hitungHasil: Int = 0
        val pilihOperator = spOperator.selectedItem.toString()

        when (pilihOperator) {
            "x" -> hitungHasil = nilai1 * nilai2
            "/" -> hitungHasil = nilai1 / nilai2
            "+" -> hitungHasil = nilai1 + nilai2
            "-" -> hitungHasil = nilai1 - nilai2
            else -> {
                Toast.makeText(this, "Silahkan Pilih Operator", Toast.LENGTH_SHORT).show()
            }
        }
        return hitungHasil.toString()
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_exit->{
                val intentBiasa = Intent(this@MainActivity2, StartActivity::class.java)
                startActivity(intentBiasa)
            }

        }
    }
}

