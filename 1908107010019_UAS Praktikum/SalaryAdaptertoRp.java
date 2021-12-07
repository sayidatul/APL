public class SalaryAdaptertoRp implements Salary {
    private Salary salary;

    public SalaryAdaptertoRp(Salary salary) {
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        int hasil = salary.getSalary();
        return convertSalary(hasil);
    }

    // mengubah/mengkonversi gaji dari dollar ke rupiah
    private int convertSalary(int salary) {
        return salary * 14526;
    }
}
