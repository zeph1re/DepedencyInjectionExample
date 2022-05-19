package binar.ganda.depedencyinjectionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var student : Student

    @Inject
    lateinit var c : String

    @Inject
    @Named("")
    lateinit var stringdua : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val a = student.nameStudent()
//        txtName.text = a

//        txtName.text = stringdua

        txtName.text = c

        jumlah_btn.setOnClickListener {
            hitung()
        }


    }

    fun hitung() {
        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()
        val di = student.hitungJumlah(a,b)

        hasil_tv.text = di.toString()
    }
}