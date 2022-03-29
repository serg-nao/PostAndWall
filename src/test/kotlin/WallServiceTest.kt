import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import ru.netology.*

internal class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val service = WallService()

        //act
        val postAdded: Post = service.add(Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 500000000,
            text = "It's my first post",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
                groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
            canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
                "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1))
        val finalId = postAdded.id
        val result: Boolean = (finalId != 0L)

        //assert
        assertTrue(result)
    }

    @Test
    fun updateExisting() {
        //arrange
        val service = WallService()

        service.add(Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 500000000, text = "It's my first post",
        replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
        groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
        canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
        "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
        reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
        isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
        true, "noEdit"), postponedId = 1))

        service.add(Post(id = 0, ownerId = 2, fromId = 1, createdBy = 1, date = 500000021, text = "It's my second post",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
                groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
            canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
                "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1))

        service.add(Post(id = 0, ownerId = 3, fromId = 1, createdBy = 1, date = 500000641, text = "It's my third post",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
                groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
            canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
                "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1))

        val update = Post(id = 15000000001, ownerId = 1, fromId = 1, createdBy = 1, date = 500000000,
            text = "It's my changed post", replyOwnerId = 1, replyPostId = 1, friendsOnly = true,
            comments = Comments(1U, canPost = true, groupsCanPost = true, canClose = false, false),
            postType = "News", signerId = 1, canPin = true, canDelete = true, canEdit = true,
            copyright = Copyright(100UL, "url", "Sergey", "noType"),
            likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1)

        //act
        val result = service.update(update)

        //assert
        assertTrue(result)
    }

    @Test
    fun updateFail() {
        //arrange
        val service = WallService()

        service.add(Post(id = 0, ownerId = 1, fromId = 1, createdBy = 1, date = 500000000, text = "It's my first post",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
                groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
            canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
                "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1))

        service.add(Post(id = 0, ownerId = 2, fromId = 1, createdBy = 1, date = 500000021, text = "It's my second post",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
                groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
            canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
                "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1))

        val update = Post(id = 0, ownerId = 3, fromId = 1, createdBy = 1, date = 500000641, text = "It's my third post",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = true, comments = Comments(1U, canPost = true,
                groupsCanPost = true, canClose = false, false), postType = "News", signerId = 1,
            canPin = true, canDelete = true, canEdit = true, copyright = Copyright(100UL, "url", "Sergey",
                "noType"), likes = Likes(1U, userLikes = true, canLike = true, true),
            reposts = Reposts(1U, true), views = Views(50U), isPinned = 1, markedAsAds = false,
            isFavourite = true, donut = Donut(true, 30U, placeholder = Placeholder(),
                true, "noEdit"), postponedId = 1)

        //act
        val result = service.update(update)

        //assert
        assertFalse(result)
    }
}