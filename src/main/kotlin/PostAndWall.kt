package ru.netology

fun main() {
    val post = Post(
        id = 10000001UL,
        ownerId = 10000001UL,
        fromId = 1UL,
        createdBy = 1UL,
        date = 500000000UL,
        text = "It's my first post",
        replyOwnerId = 1UL,
        replyPostId = 1UL,
        friendsOnly = true,
        comments = Comments(1U, canPost = true, groupsCanPost = true, canClose = false, false),
        postType = "News",
        signerId = 1U,
        canPin = true,
        canDelete = true,
        canEdit = true,
        copyright = Copyright(100UL, "url", "Sergey", "noType"),
        likes = Likes(1U, userLikes = true, canLike = true,true),
        reposts = Reposts(1U, true),
        views = Views(50U),
        isPinned = 1U,
        markedAsAds = false,
        isFavourite = true,
        donut = Donut(true, 30U, placeholder = Placeholder(), true, "noEdit"),
        postponedId = 1U
    )
    val wall = WallService()
    wall.add(post)
}