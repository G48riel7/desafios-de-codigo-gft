class ContaBancaria {
    private double saldo;
 
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
 
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito feito.");
        }
        imprimirSaldo();
    }
 
    public void sacar(double valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque feito.");
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado.");
            }
        }
        imprimirSaldo();
    }
 
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}