package ru.netology

data class Post(
    var id: Long,
    val ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    val date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean,
    var comments: Comments,
    var postType: String,
    var signerId: Int,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var isPinned: Int,
    var markedAsAds: Boolean,
    var isFavourite: Boolean,
    var donut: Donut,
    var postponedId: Int
)