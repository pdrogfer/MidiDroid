package com.pdrogfer.mididroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pgf.mididroid.MidiFile
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = File("example.mid")
        val midi = MidiFile(input)
    }
}