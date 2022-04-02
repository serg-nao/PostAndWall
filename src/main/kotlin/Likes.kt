package ru.netology

data class Likes (
    val count: UInt,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
    )