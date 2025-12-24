package com.example.kpopdemonhuntersfanapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kpopdemonhuntersfanapp.activities.AboutActivity
import com.example.kpopdemonhuntersfanapp.activities.CharactersActivity
import com.example.kpopdemonhuntersfanapp.activities.LoreActivity
import com.example.kpopdemonhuntersfanapp.activities.MusicActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons and set click listeners
        val btnCharacters: Button = findViewById(R.id.btn_characters)
        val btnLore: Button = findViewById(R.id.btn_lore)
        val btnMusic: Button = findViewById(R.id.btn_music)
        val btnAbout: Button = findViewById(R.id.btn_about)

        btnCharacters.setOnClickListener(this)
        btnLore.setOnClickListener(this)
        btnMusic.setOnClickListener(this)
        btnAbout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent: Intent? = null
        when (v?.id) {
            R.id.btn_characters -> intent = Intent(this, CharactersActivity::class.java)
            R.id.btn_lore -> intent = Intent(this, LoreActivity::class.java)
            R.id.btn_music -> intent = Intent(this, MusicActivity::class.java)
            R.id.btn_about -> intent = Intent(this, AboutActivity::class.java)
        }
        intent?.let { startActivity(it) }
    }
}