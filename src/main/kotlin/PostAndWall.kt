package ru.netology

fun main() {

    var post = Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 1648771100, text = "It's my first post",
        replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
        groupsCanPost = true, canClose = false, false), postType = "News", postSource = PostSource("vk",
        "android", "like", "https://vk.com/dev/objects/post_source"), attachment = null,geo = Geo("city",
        "54.5476 x 61.4809", Place(0, "native place", 56, -45, 1648771100,
        "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
        "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true, canEdit = true,
        copyright = Copyright(100UL, "url", "Sergey", "noType"), likes = Likes(1U,
        userLikes = true, canLike = true, true), reposts = Reposts(1U, true),
        views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true, donut = Donut(true,
        30U, placeholder = Placeholder(), true, "noEdit"), postponedId = 1)

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

    val myFirstComment = Comment(
        ownerId = 1, postId = 1L, fromGroup = null, message = "Это мой первый комментарий", replyToComment = 0,
        attachments = null, stickerId = null, guid = 100L
    )
    wall.createComment(myFirstComment)
}