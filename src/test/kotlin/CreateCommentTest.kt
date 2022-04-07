import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

import ru.netology.*

internal class CreateCommentTest {

    private val service = WallService()
    private val myPost = Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 1648771100,
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


    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        service.add(myPost)
        val failComment = Comment(ownerId = 1, postId = 5L, fromGroup = null, message = "Это мой первый комментарий",
            replyToComment = 0, attachments = null, stickerId = null, guid = 100L)
        service.createComment(failComment)
    }

    @Test
    fun notShouldThrow() {
        //arrange
        val successfulComment = Comment(ownerId = 1, postId = 1L, fromGroup = null, message = "Это мой первый комментарий",
            replyToComment = 0, attachments = null, stickerId = null, guid = 100L)

        //act
        service.add(myPost)
        val result: Comment = service.createComment(successfulComment)

        //assert
        assertEquals(successfulComment, result)
    }


}