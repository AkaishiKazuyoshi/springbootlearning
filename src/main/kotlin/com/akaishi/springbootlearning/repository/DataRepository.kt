package com.akaishi.springbootlearning.repository

import com.akaishi.springbootlearning.entity.DataEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DataRepository: JpaRepository<DataEntity, String>