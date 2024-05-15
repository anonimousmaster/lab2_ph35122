package com.example.myapplication

class bai4SinhVienModel (var tenSV : String , var mssv: String, var diemTB : Float) {
    var daTotNghiep : Boolean? = null
    var tuoi : Int? = null

    fun getThongTin() :String{
        var sDaTotNghiep : String
        if (daTotNghiep == null){
            sDaTotNghiep = "chua co du lieu"
        }else{
            if (daTotNghiep !!)
                sDaTotNghiep = "da tot nghiep"
            else{
                sDaTotNghiep = "chua tot nghiep"
            }
        }
        var sTuoi : Int
        if(tuoi == null){
            sTuoi = 18
        }else{
            sTuoi = 19
        }
        return "ten: $tenSV, mssv : $mssv, diemtb : $diemTB, datotnghiep : $daTotNghiep, tuoi : $tuoi "
    }
    fun setThongTin(tenSV: String, mssv: String, diemTB: Float, daTotNghiep: Boolean?, tuoi: Int?) {
        this.tenSV = tenSV
        this.mssv = mssv
        this.diemTB = diemTB
        this.daTotNghiep = daTotNghiep
        this.tuoi = tuoi
    }

}