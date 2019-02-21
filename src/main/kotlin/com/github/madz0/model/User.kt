package com.github.madz0.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
class User:BaseModel() {
    @Column var name: String?=null
}