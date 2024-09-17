/*
package com.first.photonotes.ui.theme

import androidx.lifecycle.LiveData
import com.first.appprym.NoteDao


class NoteRepository(private val noteDao: NoteDao) {

    suspend fun insert(note: Note) {
        noteDao.insert(note)
    }

    suspend fun update(note: Note) {
        noteDao.update(note)
    }

    fun getNoteById(id: Int): LiveData<Note> {
        return noteDao.getNoteById(id)
    }

    suspend fun getAllNotes(): LiveData<List<Note>> {
        return noteDao.getAllNotes()
    }
}
*/