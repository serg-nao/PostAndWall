package ru.netology

fun main() {
    var post = Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 500000000, text = "It's my first post",
        replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
            groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
        canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
            "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
        reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
        isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
            true, "noEdit"), postponedId = 1)

    var nextPost = post.copy(
        ownerId = 2,
        text = "It's my second post"
    )

    var lastPost = post.copy(
        ownerId = 3,
        text = "It's my last post"
    )

    val wall = WallService()
    wall.add(post)
    wall.add(lastPost)

    post.text = "Text changed"
    nextPost.postType = "Ads"

    wall.update(post)
    wall.update(nextPost)
    wall.update(lastPost)
}