package aguilar.cristina.thecheezerys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button =findViewById(R.id.button_cold_drinks) as Button

        btnCold.setOnClickListener{
            var intent: Intent =Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
    }
}
