package ru.netology

data class Post(
    var id: Long,
    val ownerId: Int,
    var fromId: Int,
    var createdBy: Int?,
    val date: Int,
    var text: String,
    var replyOwnerId: Int?,
    var replyPostId: Int?,
    var friendsOnly: Boolean,
    var comments: Comments?,
    var postType: String,
    var postSource: PostSource?,
    var attachment: Array<Attachment>?,
    var geo: Geo?,
    var signerId: Int?,
    var copyHistory: ArrayList<Post>?,
    var canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    var copyright: Copyright?,
    var likes: Likes?,
    var reposts: Reposts?,
    var views: Views?,
    var isPinned: Int?,
    var markedAsAds: Boolean,
    var isFavourite: Boolean,
    var donut: Donut?,
    var postponedId: Int?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (attachment != null) {
            if (other.attachment == null) return false
            if (!attachment.contentEquals(other.attachment)) return false
        } else if (other.attachment != null) return false

        return true
    }

    override fun hashCode(): Int {
        return attachment?.contentHashCode() ?: 0
    }
}