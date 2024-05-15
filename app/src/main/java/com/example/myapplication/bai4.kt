package com.example.myapplication

fun main(){
    // khai báo nullsafety phải có ?
    val mssv : String? = readLine()
    val tenSafeVarargs = getTenSV(mssv!!)
    println("nhap ma so sinh vien")
    val tenSv = ""
    println("ten sinh vien la $mssv va ten la $tenSv")
}

val danhsachSV : Map<String, String> = mutableMapOf("ph35122" to "long" , "ph35122" to "long" ,"ph35122" to "long")
fun getTenSV(mssv : String): String{
    val tenSv = danhsachSV.get(mssv)

    if (tenSv == null){
        return (" khong tim thay sinh vien")
    }
    return tenSv
}