package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
    
        private static final double FOREIGNER_SALARY_MULTIPLIER = 1.5;

	private String employeeId;
	private Identity identity;
        private JoinDate joinDate;
        private PersonalInfo personalInfo; 
		
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames = new LinkedList<>();
        private List<String> childIdNumbers = new LinkedList<>();

	
	public Employee(String employeeId, PersonalInfo personalInfo, Identity identity, JoinDate joinDate) {
            this.employeeId = employeeId;
            this.personalInfo = personalInfo;
            this.identity = identity;
            this.joinDate = joinDate;
        }
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
	public void setMonthlySalary(Salary grade) {
	int initialSalary = grade.getInitialSalary();
            if (personalInfo.isForeigner()){
                initialSalary *= FOREIGNER_SALARY_MULTIPLIER;
            }
            this.monthlySalary = initialSalary;
        }

	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = spouseIdNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
	private boolean hasSpouse() {
            return spouseIdNumber != null && !spouseIdNumber.isEmpty();
        }

        public int getAnnualIncomeTax() {
            int monthWorkingInYear = joinDate.getMonthWorkingInYear();
            return TaxFunction.calculateTax(
                monthlySalary,
                otherMonthlyIncome,
                monthWorkingInYear,
                annualDeductible,
                !hasSpouse(),
                childIdNumbers.size()
            );
        }
}
