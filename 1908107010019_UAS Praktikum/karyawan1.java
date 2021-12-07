public class karyawan1 implements Salary {
    private int salary;

    // mengatur gaji berdasarkan inputan user
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // mengoverride method abstrac yang ada pada inteface PICK
    @Override
    public int getSalary() {
        return salary;
    }

}
