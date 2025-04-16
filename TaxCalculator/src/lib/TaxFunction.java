package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	private static final int BASE_NON_TAXABLE = 54000000;
        private static final int MARRIED_ADDITION = 4500000;
        private static final int CHILD_ADDITION = 1500000;
        private static final int MAX_CHILDREN = 3;

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
            if (numberOfMonthWorking > 12) {
                System.err.println("More than 12 months working per year");
            }

            if (numberOfChildren > MAX_CHILDREN) {
                numberOfChildren = MAX_CHILDREN;
            }

            int nonTaxableIncome = BASE_NON_TAXABLE;

            if (isMarried) {
                nonTaxableIncome += MARRIED_ADDITION;
            }

            nonTaxableIncome += numberOfChildren * CHILD_ADDITION;

            int annualIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
            int taxableIncome = annualIncome - deductible - nonTaxableIncome;
            int tax = (int) Math.round(0.05 * taxableIncome);

            return Math.max(tax, 0); 
        }
}
