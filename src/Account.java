class Client{
    String name;
    String CPF;
    String adress;
    int age;
    char sex;

    public Client(String name, String CPF, String adress, int age, char sex) {
        this.name = name;
        this.CPF = CPF;
        this.adress = adress;
        this.age = age;
        this.sex = sex;
    }

}

public class Account {

    Client owner;
    double balance;
    int num;
    int limit;
    String agency;
    
    public Account(Client owner, double balance, int num, int limit, String agency) {
        this.owner = owner;
        this.balance = balance;
        this.num = num;
        this.limit = limit;
        this.agency = agency;
    }


    boolean deposit(double value) {
        if(value > 0.0) {
            this.balance += value;
            return true;
        } else {
            return false;
        }
    }


    boolean withdraw(double value) {
        if(value > 0.0 && value <= this.balance) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }


    boolean transfer(Account destineAccount, double value) {
        boolean withdrawMade = this.withdraw(value);
        if(withdrawMade) {
            boolean deposit = destineAccount.deposit(value);
            return deposit;
        } else {
            return false;
        }
    }
    
    
     void printOut() {
        System.out.println("Nome do dono da conta: " + this.owner.name);
         System.out.println("CPF: " + this.owner.CPF);
         System.out.println("Endereço: " + this.owner.adress);
         System.out.println("Idade: " + this.owner.age);
         System.out.println("Sexo: " + this.owner.sex);
        System.out.println("Número da conta: " + this.num);
        System.out.println("Saldo atual: " + this.balance);
        System.out.println("Limite: " + this.limit);
    }
}
