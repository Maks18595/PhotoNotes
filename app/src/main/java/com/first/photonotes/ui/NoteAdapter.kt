/*package com.first.photonotes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.first.photonotes.ui.theme.Note
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private val notesFile = File(application.filesDir, FILE_NAME)
    private val _notesLiveData = MutableLiveData<List<Note>>()
    val notesLiveData: LiveData<List<Note>> = _notesLiveData

    init {
        loadNotes()
    }

    private fun loadNotes() {
        _notesLiveData.value = if (notesFile.exists()) {
            val json = notesFile.readText()
            val type = object : TypeToken<List<Note>>() {}.type
            Gson().fromJson(json, type)
        } else {
            emptyList()
        }
    }

    fun insert(note: Note) {
        val currentNotes = _notesLiveData.value?.toMutableList() ?: mutableListOf()
        currentNotes.add(note)
        saveNotes(currentNotes)
    }

    fun update(updatedNote: Note) {
        val currentNotes = _notesLiveData.value?.toMutableList() ?: mutableListOf()
        val index = currentNotes.indexOfFirst { it.id == updatedNote.id }
        if (index != -1) {
            currentNotes[index] = updatedNote
            saveNotes(currentNotes)
        }
    }

    fun delete(note: Note) {
        val currentNotes = _notesLiveData.value?.toMutableList() ?: mutableListOf()
        val index = currentNotes.indexOfFirst { it.id == note.id }
        if (index != -1) {
            currentNotes.removeAt(index)
            saveNotes(currentNotes)
        }
    }

    fun getNoteById(noteId: Int): LiveData<Note?> {
        val result = MutableLiveData<Note?>()
        _notesLiveData.value?.find { it.id == noteId }?.let {
            result.value = it
        }
        return result
    }

    private fun saveNotes(notes: List<Note>) {
        val json = Gson().toJson(notes)
        FileOutputStream(notesFile).use { outputStream ->
            OutputStreamWriter(outputStream).use { writer ->
                writer.write(json)
            }
        }
        _notesLiveData.value = notes
    }

    companion object {
        private const val FILE_NAME = "notes.json"
    }
}
*/

