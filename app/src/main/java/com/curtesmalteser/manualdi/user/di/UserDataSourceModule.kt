package com.curtesmalteser.manualdi.user.di

import com.curtesmalteser.manualdi.user.LocalUserDataSource
import com.curtesmalteser.manualdi.user.LocalUserHandler
import com.curtesmalteser.manualdi.user.RemoteDataSource
import com.curtesmalteser.manualdi.user.UserDataSource

/**
 * Created by António Bastião on 10.11.21
 * Refer to <a href="https://github.com/CurtesMalteser">CurtesMalteser github</a>
 */
class UserDataSourceModule {

    private val remoteDataSource: UserDataSource = RemoteDataSource()
    private val localUserDataSource: LocalUserDataSource = LocalUserDataSource()

    fun provideRemoteDataSource(): UserDataSource = remoteDataSource
    fun provideLocalDataSource(): UserDataSource = localUserDataSource
    fun provideLocalUserHandler(): LocalUserHandler = localUserDataSource
}