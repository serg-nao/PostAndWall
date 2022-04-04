import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import ru.netology.*

internal class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val service = WallService()

        //act
        val postAdded: Post = service.add(Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my first post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1))
        val finalId = postAdded.id
        val result: Boolean = (finalId != 0L)

        //assert
        assertTrue(result)
    }

    @Test
    fun updateExisting() {
        //arrange
        val service = WallService()

        service.add(Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my first post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1))

        service.add(Post(id = 0, ownerId = 2, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my second post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1))

        service.add(Post(id = 0, ownerId = 3, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my last post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1))

        val update = Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my first post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1)

        //act
        val result = service.update(update)

        //assert
        assertTrue(result)
    }

    @Test
    fun updateFail() {
        //arrange
        val service = WallService()

        service.add(Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my first post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1))

        service.add(Post(id = 0, ownerId = 2, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my second post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
            true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
            "noEdit"), postponedId = 1))

        val update = Post(id = 0, ownerId = 3, fromId = 1, createdBy = 1, date = 1648771100,
            text = "It's my last post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(
            1U, canPost = true, groupsCanPost = true, canClose = false, false), postType = "News",
            postSource = PostSource("vk", "android", "like",
            "https://vk.com/dev/objects/post_source"), attachment = null, geo = Geo("city", "54.5476 x 61.4809",
            Place(0, "native place", 56, -45, 1648771100,
            "https://vk.com/dev/objects/place", 2, 1648771200, 0, 12, 83,
            "Main Street 19a")), signerId = 1, copyHistory = ArrayList(), canPin = true, canDelete = true,
            canEdit = true, copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true), reposts = Reposts(1U,
                true), views = Views(50U), isPinned = 1, markedAsAds = false, isFavourite = true,
            donut = Donut(true, 30U, placeholder = Placeholder(), true,
                "noEdit"), postponedId = 1)

        //act
        val result = service.update(update)

        //assert
        assertFalse(result)
    }
}