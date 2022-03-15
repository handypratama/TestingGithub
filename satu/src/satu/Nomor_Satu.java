package satu;


public class Nomor_Satu {

	public static void main(String[] args) {
		int hari_Senin = 15,
			hari_Selasa = 15,
			hari_Rabu = 15,
			hari_Kamis = 15,
			hari_Jumat = 10;
		int Jumlah_bel_berbunyi = hari_Senin + hari_Selasa + hari_Rabu + hari_Kamis + hari_Jumat; 
		System.out.println("Jumlah Bel Berbunyi Pada Hari Senin  :  " + hari_Senin +" Kali");
		System.out.println("Jumlah Bel Berbunyi Pada Hari Selasa :  " + hari_Selasa +" Kali");
		System.out.println("Jumlah Bel Berbunyi Pada Hari Rabu   :  " + hari_Rabu +" Kali");
		System.out.println("Jumlah Bel Berbunyi Pada Hari Kamis  :  " + hari_Kamis +" Kali");
		System.out.println("Jumlah Bel Berbunyi Pada Hari Jumat  :  " + hari_Jumat +" Kali");
		System.out.println("Jumlah Bel Berbunyi Selama Seminggu  :  " + Jumlah_bel_berbunyi +" Kali");
	}

}
