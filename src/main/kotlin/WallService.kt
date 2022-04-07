package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        post.id = (posts.size+1).toLong()
        posts += post
        return posts.last()
    }

    fun createComment(comment: Comment): Comment {
        findById(comment.postId)
        comments += comment
        println("Комментарий успешно добавлен")
        return comments.last()
    }

    fun update(post: Post): Boolean {
        val i = lookForId(post.id)
        if (i >= 0) {
                posts.elementAt(i).fromId = post.fromId
                posts.elementAt(i).createdBy = post.createdBy
                posts.elementAt(i).text = post.text
                posts.elementAt(i).replyOwnerId = post.replyOwnerId
                posts.elementAt(i).replyPostId = post.replyPostId
                posts.elementAt(i).friendsOnly = post.friendsOnly
                posts.elementAt(i).comments = post.comments
                posts.elementAt(i).postType = post.postType
                posts.elementAt(i).signerId = post.signerId
                posts.elementAt(i).canPin = post.canPin
                posts.elementAt(i).canDelete = post.canDelete
                posts.elementAt(i).canEdit = post.canEdit
                posts.elementAt(i).copyright = post.copyright
                posts.elementAt(i).likes = post.likes
                posts.elementAt(i).reposts = post.reposts
                posts.elementAt(i).views = post.views
                posts.elementAt(i).isPinned = post.isPinned
                posts.elementAt(i).markedAsAds = post.markedAsAds
                posts.elementAt(i).isFavourite = post.isFavourite
                posts.elementAt(i).donut = post.donut
                posts.elementAt(i).postponedId = post.postponedId
            return true
            } else return false
        }

        private fun lookForId(postId: Long): Int {
            var index = -1
            for (i in 0 ..posts.size-1) {
                if (postId == posts.elementAt(i).id) {
                    index = i
                }
            }
            return index
        }

        private fun findById(id: Long): Post {
            for (post in posts) {
                if (post.id == id) return post
            }
            throw PostNotFoundException("Post is not found")
        }
}
