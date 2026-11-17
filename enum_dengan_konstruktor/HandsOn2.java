package enum_dengan_konstruktor;

public class HandsOn2 {
    enum AccountType {
        SAVINGS("SA", 0.05), CREDIT("CR", 0.1), DEPOSIT("DP", 0.08);

    private String code;
    private double interestRate;

    private AccountType(String code, double interestRate){
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode(){
        return code;
    }

    public double getInterestRate(){
        return interestRate;
        }

    }

    public static void main(String[] args){
        System.out.println("=== DAFTAR TIPE AKUN BANK ===");
        for (AccountType type : AccountType.values()){
            System.out.println("Tipe       : " + type.name());
            System.out.println("Kode       : " + type.getCode());
            System.out.println("Suku Bunga : " + type.getInterestRate());
            System.out.println("--------------------------------------");
        }
    }


}
