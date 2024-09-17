
package com.first.photonotes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}



/*
package com.first.photonotes

import NoteViewModelFactory
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.first.photonotes.ui.NoteAdapter
import com.first.photonotes.ui.theme.AppDatabase
import com.first.photonotes.R


class MainActivity : AppCompatActivity() {

    private lateinit var noteViewModel: NoteViewModel
    private lateinit var noteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use Application context for creating the ViewModel
        val viewModelFactory = NoteViewModelFactory(application)
        noteViewModel = ViewModelProvider(this, viewModelFactory)[NoteViewModel::class.java]

        noteAdapter = NoteAdapter(listOf(), noteViewModel)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = noteAdapter

        noteViewModel.allNotes.observe(this) { notes ->
            notes?.let { noteAdapter.updateNotes(it) }
        }

        noteViewModel.getNotes()

        findViewById<Button>(R.id.fab_add_note).setOnClickListener {
            startActivity(Intent(this, AddNoteActivity::class.java))
        }
    }
}
*/

