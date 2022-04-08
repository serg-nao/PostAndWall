package ru.netology

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val postCopy: Post = post.copy(
        id = if (posts.isEmpty()) 1L else (posts.last().id + 1L)
        )
        posts += postCopy
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val i = lookForId(post.id)
        return if (i >= 0) {
            val postCopy: Post = posts.elementAt(i).copy(
                ownerId = post.ownerId,
                date = post.date
            )
            posts[i] = postCopy
            true
        } else false
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
}
