package com.github.madz0.model

import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
abstract class BaseModel {
    @Id
    var id: Long? = null
    @Version
    var version: Long? = 0
}