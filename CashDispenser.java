// CashDispenser.java
// Representa o dispensador de cédulas do ATM

public class CashDispenser {
    // o número inicial padrão de celula no dispensador de cédulas
    private final static int INITIAL_COUNT = 500;
    private int count; // número de cédulas de USS 20 remanescente

    // construtor sem argumentos CashDispenser inicializa a count para o padrão
    public CashDispenser() {
        count = INITIAL_COUNT; //configura atributo count como padrão
    } // fim do construtor CashDispenser

    // simula entrega da quantia especificada de cédulas
    public void dispenseCash(int amount){
        int billResquired = amount / 20; // número de cédulas de USS 20 requerido
        count -= billResquired;          // atualiza a contagem das células
    }  // fim do método dispenseCash

    // indica se o dispensador de cédulas pode entregar a quantia desejada
    public boolean isSufficientCashAvaiable(int amount) {
        int billResquired = amount / 20; // número de cédulas USS 20 requerido
        return count >= billResquired; // se há ou cédulas sudficientes disponíveis
    } // fim do método isSuficientCashAviable

} // fim da classe CashDispenser
  