class bankaccount {
    double x=50000.0;
    double y=100000.0;
    double z=60000.0;
    double totsa,totca;
    public double getaccountbalance() {
        return x;
        
    }
    public void setaccountbalance() {
        this.x=x;
        
    }
    public double getfixedDeposite() {
        return y;
        
    }
    public void setfixedDeposite() {
        this.y=y;
        
    }
    public double getcashcredit() {
        return z;
    }
    public void setcashcredit() {
        this.z=z;
    }
    public double getcatotalbalance() {
        return totca;
    }
    public void setcatotalbalance() {
        this.totca=x+z;
        System.out.println(totca+"is your total balance in current account");
            }
            public double getsatotalbalance() {
                return totsa;
            }
            public void setsatotalbalance() {
                this.totsa=x+y;
                System.out.println(totsa+"is your total balance in saving account");
                    }
}
class savingaccount extends bankaccount{
    public double getfixedDeposite() {
        return y;
        
    }
    public void setfixedDeposite() {
        this.y=100000.0;
    }
    
}
class currentaccount extends bankaccount{
    public double getcashcredit() {
        return z;
    }
    public void setcashcredit() {
        this.z=50000.0;
    }
    
            
}
class Bank extends bankaccount{
    public static void main(String[] args) {
        bankaccount s= new bankaccount();
        s.setsatotalbalance();
        s.getsatotalbalance();
        s.setcatotalbalance();
        s.getcatotalbalance();
    }
}