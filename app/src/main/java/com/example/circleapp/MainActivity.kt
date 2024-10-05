package com.example.circleapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.PI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radiusInput = findViewById<EditText>(R.id.radiusInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultArea = findViewById<TextView>(R.id.resultArea)
        val resultPerimeter = findViewById<TextView>(R.id.resultPerimeter)

        calculateButton.setOnClickListener {
            val radius = radiusInput.text.toString().toDoubleOrNull()

            if (radius != null && radius > 0) {
                val area = PI * radius * radius
                val perimeter = 2 * PI * radius

                resultArea.text = "Площа: %.2f".format(area)
                resultPerimeter.text = "Периметр: %.2f".format(perimeter)
            } else {
                resultArea.text = "Неправильний радіус"
                resultPerimeter.text = ""
            }
        }
    }
}
