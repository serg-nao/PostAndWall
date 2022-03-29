package ru.netology

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id = (posts.size+1).toLong()        //generateId(post, posts.size)
        posts += post
        return posts.last()
    }

    //private fun generateId(post: Post, index: Int): Long {
    //    val firstPartId = post.ownerId.toString()
    //    val secondPartId = post.date.toString()
    //    val thirdPartId = index.toString()
    //    val s = firstPartId + secondPartId + thirdPartId
    //    return s.toLong()
    //}

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
}
