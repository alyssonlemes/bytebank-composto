public class Conta {

    // as classes são arquivos de suporte, por isso não executam sozinhas

    private double saldo; //private significa que o atributo só pode ser modificado na propria classe
    int agencia;
    int numero;
    Cliente titular;

    void deposita(double valor) {
        // a primeira parte é o que o método devolve e a segunda é o que ele recebe
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else{
            return false;
        }
    }

    public double getSaldo(){

        return this.saldo;

    }


}
