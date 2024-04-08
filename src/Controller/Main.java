package Controller;

import Model.SinhVien;
import Model.TheMuon;
import View.QuanLyTheMuon;
public class Main {
	
	    public static void main(String[] args) {
	        // Khởi tạo đối tượng QuanLyTheMuon
	        QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();

	        // Tạo đối tượng SinhVien
	        SinhVien sinhVien1 = new SinhVien("Nguyễn Văn A", 20, "K62-CNSH");
	        SinhVien sinhVien2 = new SinhVien("Trần Thị B", 21, "K63-CNTT");

	        // Tạo đối tượng TheMuon
	        TheMuon theMuon1 = new TheMuon("PM001", 1, 7, 123, sinhVien1);
	        TheMuon theMuon2 = new TheMuon("PM002", 2, 8, 456, sinhVien2);

	        // Thêm TheMuon vào QuanLyTheMuon
	        quanLyTheMuon.themTheMuon(theMuon1);
	        quanLyTheMuon.themTheMuon(theMuon2);

	        // Hiển thị thông tin các thẻ mượn
	        quanLyTheMuon.hienThiThongTinTheMuon();

	        // Xoá một thẻ mượn
	        quanLyTheMuon.xoaTheMuon("PM001");

	        // Hiển thị lại thông tin các thẻ mượn sau khi xoá
	        quanLyTheMuon.hienThiThongTinTheMuon();
	    }
	}

