package ru.netology

data class VideoAttachment (
    override val type: String = "video",
    val video: Video = Video(1,1,1,1)
) : Attachment