package ru.netology

data class PhotoAttachment (
    override val type: String = "photo",
    val photo: Photo = Photo(1,1,1,1)
) : Attachment