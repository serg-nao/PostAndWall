package ru.netology

data class Comment (
    val ownerId: Int,
    val postId: Long,
    val fromGroup: Int?,
    val message: String,
    val replyToComment: Int?,
    val attachments: Attachment?,
    val stickerId: Int?,
    val guid: Long
        )