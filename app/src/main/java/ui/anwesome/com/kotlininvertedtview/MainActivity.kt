package ui.anwesome.com.kotlininvertedtview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ui.anwesome.com.invertedtview.InvertedTView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        InvertedTView.create(this)
    }
}
