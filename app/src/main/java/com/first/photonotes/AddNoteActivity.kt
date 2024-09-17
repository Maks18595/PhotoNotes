package com.first.photonotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import com.first.photonotes.ui.theme.Note
import com.first.photonotes.R

class AddNoteActivity : AppCompatActivity() {

    private val noteViewModel: NoteViewModel by viewModels()

    private lateinit var noteEditText: EditText
    private var currentNoteId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        noteEditText = findViewById(R.id.noteEditText)
        val saveButton: Button = findViewById(R.id.saveButton)

        // Retrieve the NOTE_ID from the Intent
        currentNoteId = intent.getIntExtra("NOTE_ID", -1)

        if (currentNoteId != -1) {
            // Load the note details for editing
            loadNoteForEditing(currentNoteId)
        }

        saveButton.setOnClickListener {
            val noteText = noteEditText.text.toString().trim()
            if (noteText.isNotEmpty()) {
                if (currentNoteId != -1) {
                    // Update existing note
                    val updatedNote = Note(
                        id = currentNoteId,
                        imagePath = "", // Set appropriate image path if needed
                        noteText = noteText
                    )
                    noteViewModel.update(updatedNote)
                } else {
                    // Create new note
                    val newNote = Note(
                        id = 0, // Generate ID if needed
                        imagePath = "", // Set appropriate image path if needed
                        noteText = noteText
                    )
                    noteViewModel.insert(newNote)
                }
                finish()
            } else {
                // Handle empty note text case
                // You might want to show a message to the user
            }
        }
    }

    private fun loadNoteForEditing(noteId: Int) {
        // Fetch the note from ViewModel or repository using noteId
        // For demonstration, this assumes the note is fetched from ViewModel directly
        noteViewModel.getNoteById(noteId).observe(this) { note ->
            note?.let {
                noteEditText.setText(it.noteText)
            }
        }
    }
}
