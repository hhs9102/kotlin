package me.ham.basic

interface User{
    val nickname: String
}

//별명 저장만
class PrivateUser(override val nickname:String): User

//이메일 함께 저장
//class SubscribingUser(override val nickname: String, val email: String): User
class SubscribingUser(val email: String): User{
    override val nickname: String
    get() = email.substringBefore("@")  //커스텀 게터 -> 매번 이메일 주소에서 계산하여 반환
}

//페이스북 계정 ID 저장
class FacebookUser(val facebookId: String): User{
    override val nickname = getFacebookName(facebookId)
}
fun getFacebookName(facebookId: String): String {
    //facebookId 연동하여 nickname을 가져온다
    return "hosik"
}

fun main() {
    val faceBookUser = FacebookUser("hsham")
    println("nickname : ${faceBookUser.nickname}, facebookId: ${faceBookUser.facebookId}")
}