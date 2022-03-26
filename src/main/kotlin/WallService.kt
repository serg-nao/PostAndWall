package ru.netology

class WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return post
    }
}