public class TestaSacaNegativo {
    
    public static void main (String [] args){

        Conta conta = new Conta();

        conta.deposita(100);
        System.out.println(conta.saca(200));  //mostra false pois não pode ter valor negativo no saldo da conta
        


        conta.saca(101);

        System.out.println(conta.getSaldo());






    }


}
