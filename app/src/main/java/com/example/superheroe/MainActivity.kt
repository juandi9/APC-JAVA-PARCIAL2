package com.example.superheroe

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_done).setOnClickListener{
            addNickname(it)
        }



    }
    private fun changeImage(){
        val imageView : ImageView = findViewById(R.id.super_image)
        val imageViewOne : ImageView = findViewById(R.id.super_one)
        val imageViewTwo : ImageView = findViewById(R.id.super_two)
        val imageViewThree : ImageView = findViewById(R.id.super_three)



    }



    private fun addNickname(view: View) {
        val editText : EditText = findViewById(R.id.nickname)
        val textNickname : TextView = findViewById(R.id.nickname_text)
        val arrayTracks = arrayOf("Uniforme azul y una capa roja. ¿Quien es? ","Tiene una 'S' en el pecho. ¿Quien es?")
        if (editText.text.toString().toLowerCase().equals("superman")){
            textNickname.text = editText.text
            textNickname.visibility= TextView.VISIBLE
            view.button_done.visibility = TextView.GONE
            editText.visibility = TextView.GONE
        }else{
            val randomInteger = (0..1).shuffled().first()

            Toast.makeText(this,arrayTracks[randomInteger],Toast.LENGTH_SHORT).show();
        }


        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0 )

    }
}




