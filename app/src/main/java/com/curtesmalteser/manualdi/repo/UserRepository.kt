package com.curtesmalteser.manualdi.repo

import com.curtesmalteser.manualdi.user.LocalUserHandler
import com.curtesmalteser.manualdi.user.UserDataSource

/**
 * Created by António Bastião on 10.11.21
 * Refer to <a href="https://github.com/CurtesMalteser">CurtesMalteser github</a>
 */
interface UserRepository {
}

class UserRepoImpl(
    private val remoteDataSource: UserDataSource,
    private val localUserDataSource: UserDataSource,
    private val userHandler: LocalUserHandler,
) : UserRepository {

}