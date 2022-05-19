package binar.ganda.depedencyinjectionexample.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.depedencyinjectionexample.R
import binar.ganda.depedencyinjectionexample.Student
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_konversi_nilai.*
import javax.inject.Inject

@AndroidEntryPoint
class KonversiNilai : AppCompatActivity() {

    @Inject
    lateinit var nilai: Nilai

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_nilai)

        convert_btn.setOnClickListener {
            convertScore()
        }

    }

    fun convertScore(){
        val angka = score.text.toString().toInt()
        val convert = nilai.konversiNilai(angka)

        convertedScore.text = convert
    }
}