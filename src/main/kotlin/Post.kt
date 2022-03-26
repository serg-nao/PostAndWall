package ru.netology

data class Post(
    val id: ULong,
    val ownerId: ULong,
    val fromId: ULong,
    val createdBy: ULong,
    val date: ULong,
    val text: String,
    val replyOwnerId: ULong,
    val replyPostId: ULong,
    val friendsOnly: Boolean,
    val comments: Comments,
    val postType: String,
    val signerId: UInt,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val isPinned: UInt,
    val markedAsAds: Boolean,
    val isFavourite: Boolean,
    val donut: Donut,
    val postponedId: UInt
)