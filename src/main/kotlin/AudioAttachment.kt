package ru.netology

data class AudioAttachment (
    override val type: String = "audio",
    val audio: Audio = Audio(1, 1, 1, 1)
) : Attachment