package com.example.myapplication

fun  main(){
    println("Hien thi thong tin")
    val sv1 = bai4SinhVienModel("do long", "ph35122", 8f)
    sv1.daTotNghiep = true
    sv1.tuoi = 18

    val sv2 = bai4SinhVienModel("do long 2 ", "ph35122", 8f)
    sv2.daTotNghiep = true
    sv2.tuoi = 18

    val sv3 = bai4SinhVienModel("do long 3 ", "ph35122", 8f)
    sv3.daTotNghiep = true
    sv3.tuoi = 18

    // Khởi tạo một sinh viên mới và thiết lập thông tin của sinh viên đó
    val svMoi = bai4SinhVienModel("", "", 0f)
    svMoi.setThongTin("do long 4", "ph35125", 8.8f, true, 21)
    //    // in binh thuong
    //    println( sv1. getThongTin())

    // add sinh vien
    val listSV = mutableListOf<bai4SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    listSV.add(svMoi)

    // xoa sinh vien
    listSV.remove(sv3)

    // dung vong lap for de hien thi
    for (sinhvien in listSV){
        println(sinhvien.getThongTin())
    }
    for (i in listSV.indices){
        println("sv thu $i - ${listSV.get(i).getThongTin()}")
    }

    var month = 0
    println("Nhập vòa lựa chọn của bạn")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1 -> println("thêm thông tin")

        2 -> println("sửa thông tin")

        3 -> println("xóa thông tin")

        4 -> println("hiển thị")

        else -> println("ban đã lựa chọn sai")
    }
}