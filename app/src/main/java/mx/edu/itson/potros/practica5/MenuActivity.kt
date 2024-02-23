package mx.edu.itson.potros.practica5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.btnAntojitos) as Button
        var btnSpecials: Button = findViewById(R.id.btnEspecialidades) as Button
        var btnCombo: Button = findViewById(R.id.btnCombinations) as Button
        var btnTortas: Button = findViewById(R.id.btnTortas) as Button
        var btnSopas: Button = findViewById(R.id.btnSopas) as Button
        var btnDrinks: Button = findViewById(R.id.btnDrinks) as Button

        btnAntojitos.setOnClickListener {
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)
        }

        btnSpecials.setOnClickListener {
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Especiales")
            startActivity(intent)
        }

        btnCombo.setOnClickListener {
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Combos")
            startActivity(intent)
        }

        btnTortas.setOnClickListener {
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener {
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener {
            var intent : Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Drinks")
            startActivity(intent)
        }
    }
}
