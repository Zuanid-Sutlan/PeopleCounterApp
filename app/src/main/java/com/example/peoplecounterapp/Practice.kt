package com.example.peoplecounterapp

fun main() {


//    var months = listOf("January", "February", "March", "April")
//    println(months)
//
//    val mutableMonths = months.toMutableList()
//
//    val newMonth = arrayOf("May", "June")
//
//    mutableMonths.addAll(newMonth)
//    println(mutableMonths)
//
//    months = mutableMonths
//
//    println(months)



    /**
     * Please write a program that adds five Numbers (Double) to an arrayList and t
     * hen calculates the average of those numbers. Please use a for (in) loop in this exercise.
     * Good luck :)
        **/


    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Avarage is " + average)


}