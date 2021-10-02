package com.kkagurazaka.hilt.migration.infra

import com.kkagurazaka.hilt.migration.domain.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor() : UserRepository
