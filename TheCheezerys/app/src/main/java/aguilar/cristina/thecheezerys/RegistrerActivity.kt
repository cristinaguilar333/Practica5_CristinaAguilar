package aguilar.cristina.thecheezerys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrer)

        val button: Button =findViewById(R.id.sing_in_button)

        button.setOnClickListener{
            var intent: Intent= Intent(this, activity_menu::class.java)
            startActivity(intent)
        }
    }
}
