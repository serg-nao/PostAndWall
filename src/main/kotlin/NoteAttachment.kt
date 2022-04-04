package ru.netology

data class NoteAttachment (
    override val type: String = "note",
    val note: Note = Note(1,1,1,1)
) : Attachment