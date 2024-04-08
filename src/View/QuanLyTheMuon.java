package View;

import java.util.ArrayList;
import java.util.List;

import Model.SinhVien;
import Model.TheMuon;

public class QuanLyTheMuon<dsTheMuon>  {
	
	    private List<TheMuon> dsTheMuon;

	    public QuanLyTheMuon() {
	        dsTheMuon = new ArrayList<>();
	    }

	    public void themTheMuon(TheMuon theMuon) {
	        dsTheMuon.add(theMuon);
	    }

	    public void xoaTheMuon(String maPhieuMuon) {
	        TheMuon theMuon = timTheMuon(maPhieuMuon);
	        if (theMuon != null) {
	            dsTheMuon.remove(theMuon);
	            System.out.println("Đã xoá thẻ mượn có mã phiếu mượn: " + maPhieuMuon);
	        } else {
	            System.out.println("Không tìm thấy thẻ mượn có mã phiếu mượn: " + maPhieuMuon);
	        }
	    }

	    public void hienThiThongTinTheMuon() {
	        if (dsTheMuon.isEmpty()) {
	            System.out.println("Danh sách thẻ mượn trống.");
	        } else {
	            System.out.println("Danh sách thẻ mượn:");
	            for (TheMuon theMuon : dsTheMuon) {
	                System.out.println("Mã phiếu mượn: " + theMuon.getMaPhieuMuon());
	                System.out.println("Ngày mượn: " + theMuon.getNgayMuon());
	                System.out.println("Hạn trả: " + theMuon.getHanTra());
	                System.out.println("Số hiệu sách: " + theMuon.getSoHieuSach());
	                SinhVien sinhVienMuon = theMuon.getSinhVienMuon();
	                System.out.println("Thông tin sinh viên:");
	                System.out.println("Họ tên: " + sinhVienMuon.getHoTen());
	                System.out.println("Tuổi: " + sinhVienMuon.getTuoi());
	                System.out.println("Lớp: " + sinhVienMuon.getLop());
	                System.out.println("---------------------------------");
	            }
	        }
	    }

	    private TheMuon timTheMuon(String maPhieuMuon) {
	        for (TheMuon theMuon : dsTheMuon) {
	            if (theMuon.getMaPhieuMuon().equals(maPhieuMuon)) {
	                return theMuon;
	            }
	        }
	        return null;
	    }
	}

