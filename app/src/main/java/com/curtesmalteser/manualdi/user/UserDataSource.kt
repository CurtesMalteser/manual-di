package com.curtesmalteser.manualdi.user

/**
 * Created by António Bastião on 10.11.21
 * Refer to <a href="https://github.com/CurtesMalteser">CurtesMalteser github</a>
 */
interface UserDataSource {
    suspend fun fetchUserData(): UserData?
}

interface LocalUserHandler {
    var userData: UserData?
}

class LocalUserDataSource : UserDataSource, LocalUserHandler {

    private var _userData: UserData? = null
    override var userData: UserData?
        get() = _userData
        set(value) {
            _userData = value
        }

    override suspend fun fetchUserData(): UserData? = userData

}

class RemoteDataSource : UserDataSource {
    override suspend fun fetchUserData(): UserData = UserData(
        userName = "John Doe",
        userID = -1,
        accessToken = "that amazing token"
    )
}