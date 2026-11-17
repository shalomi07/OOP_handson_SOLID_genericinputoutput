package bank_account_enum;

public class Main {
    enum AccountType {
        SAVINGS, CREDIT, DEPOSIT
    }

    static class Account {
        private AccountType type;
        public Account(AccountType type){ this.type = type;}
        public AccountType getType(){return type;}

        @Override
        public String toString(){
            return "Account Type: " + type;
        }
    }

    public static void main(String[] args){
        System.out.println("=== Daftar Semua Tipe Enum ===");
        for (AccountType t : AccountType.values()){
            System.out.println(t);
        }

        System.out.println("\n=== Pengujian Class Account ===");
        Account acc = new Account(AccountType.DEPOSIT);
        System.out.println(acc.toString());
    }
}
