package com.curtesmalteser.manualdi.application.di

import com.curtesmalteser.manualdi.repo.UserRepoImpl
import com.curtesmalteser.manualdi.repo.UserRepository
import com.curtesmalteser.manualdi.user.di.UserDataSourceModule

/**
 * Created by António Bastião on 10.11.21
 * Refer to <a href="https://github.com/CurtesMalteser">CurtesMalteser github</a>
 */
class AppContainer {

    private val userDataSourceModule: UserDataSourceModule = UserDataSourceModule()

    val userRepository: UserRepository = UserRepoImpl(
        remoteDataSource = userDataSourceModule.provideRemoteDataSource(),
        localUserDataSource = userDataSourceModule.provideLocalDataSource(),
        userHandler = userDataSourceModule.provideLocalUserHandler()
    )
}