package com.example.myapplication

fun main(){
    // khai bao su dung lamdafuncition
    val soA : Int? =5
    val soB : Int? =10
    val tong = tinhTong(soA!!, soB!!)
    println("tong hai so $soA va $soB = $tong")
    println("binh phuong $soA = ${binhPhuong(soA)}")

    println("tong thuong hai so $soA va $soB = $tinhThuong(" +
            "soA)")

}
//1 lamda funcition
val tinhTong : (Int ,Int )-> Int
        = {soA : Int , soB : Int ->(soA + soB) }
//2 lamda funcition
val tinhHieu = {soA : Int , soB : Int ->(soA + soB) }
//3 lamda funcition
val binhPhuong : (Int) -> Int = {it * it}
//4 lamda funcition
val tinhThuong ={soA : Float ,soB: Float -> {
    if(soB == 0f){
        "so bi chia phai khac khong"
    }else{
        val c = soA/soB
        c
    }
    soA / soB
}
}