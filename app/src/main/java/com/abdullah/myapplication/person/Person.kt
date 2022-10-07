package com.abdullah.myapplication.person

import java.io.Serializable

data class Person(val name:String,val age:Int,val isMale:Boolean) : Serializable {
}