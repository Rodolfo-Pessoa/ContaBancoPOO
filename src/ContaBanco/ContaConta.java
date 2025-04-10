package ContaBanco;

public class ContaConta {

//------------------------- Atributos-------------------------

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

//------------------------- Método Personalizado-------------------------

    public void estadoAtual() {
        System.out.println("____________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: "+ this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }

//------------------------- Cosntrutor-------------------------
// Quer dizer qual será o estado da conta assim que for aberta
//Sem salto e fechada
    public ContaConta() {
        this.setSaldo(0);
        this.setStatus(false);
    }
//------------------------- Métodos-------------------------
//------------------------- Abrir conta-------------------------
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50.00);
        } else if (t == "CP") {
            this.setSaldo(150.00);
        }
    }
    //------------------------- Fechar Conta-------------------------
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com salto positivo, favor sacar antes de fechar a conta!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com saldo devedor, favor quitar o débito antes de fechar a conta!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    //------------------------- Depositar-------------------------
    public void depositar(double v) {
        if (this.getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
   //--------------------------Comentário--------------------------
   //modifique o saldo para getSlado + v, some o valor e devolva para saldo
   //É a mesma coisa de: saldo = saldo + v;
   //----------------------------------------------------------------------
        } else {
            System.out.println("Impossível depositar");
            // Pois, se for status for 'false' a conta estará fechada
        }
    }
    //-------------------------Sacar-------------------------
    public void sacar(double v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            }else {
                System.out.println("Saldo Insuficiente");
            }
            }else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    //------------------------- Pagar Mensalidade-------------------------
    public void pagarMenal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() != true) {
            saldo = saldo - v;
        }else {
            System.out.println("Imposível pagar uma conta fechada");
        }
    }
//------------------------- Getters e Setters-------------------------
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }
//----------------------------------------------------------
    public void setDono(String d) {
        this.dono = d;

    }
    public String getDono() {
        return dono;
    }

//-----------------------------------------------------------------
    public void setTipo(String t) {
        this.tipo = t;

    }
    public String getTipo() {
        return tipo;
    }
 //-----------------------------------------------------------------
 public void setSaldo(double s) {
        this.saldo = s;
    }
    public double getSaldo() {
        return saldo;
    }

//----------------------------------------------------------------
   public void setStatus(boolean st) {
       this.status = st;
   }
   public boolean getStatus() {
            return status;
   }
}
