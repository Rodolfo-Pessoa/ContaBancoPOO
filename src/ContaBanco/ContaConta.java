package ContaBanco;

public class ContaConta {

//------------------------- Atributos-------------------------

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

//------------------------- Cosntrutor-------------------------
    public ContaConta() {
        saldo = 0;
        status = false;
    }
//------------------------- Métodos-------------------------
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50.00);
        } else if (t == "CP") {
            setSaldo(150.00);
        }
    }
    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta com salto positivo, favor sacar antes de fechar a conta!");
        } else if (saldo < 0) {
            System.out.println("Conta com saldo devedor, favor quitar o débito antes de fechar a conta!");
        } else {
            setStatus(false);
        }
    }
    public void depositar(double v) {
        if (status = true) {
            setSaldo(getSaldo() + v);
   //------------------------------------------------------------------
   //modifique o saldo para getSlado + v, some o valor e devolva para saldo
   //É a mesma coisa de: saldo = saldo + v;
   //----------------------------------------------------------------------
        } else {
            System.out.println("Impossível depositar");
            // Pois, se for status for 'false' a conta estará fechada
        }
    }
    public void sacar(double v) {
        if (status = true) {
            if (saldo > v) {
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("Saldo Insuficiente");
            }
            }

    }
    public void pagarMenal() {
        int v = 0;
        if (tipo == "CC") {
            v = 12;
        } else if (tipo == "CP") {
            v = 20;
        }
        if (status == true) {
            saldo = saldo - v;
        }
    }
//------------------------- Getters e Setters-------------------------
    public void setNumConta(int n) {
        numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }
//----------------------------------------------------------
    public void setDono(String d) {
        dono = d;

    }
    public String getDono() {
        return dono;
    }

//-----------------------------------------------------------------
    public void setTipo(String t) {
        tipo = t;

    }
    public String getTipo() {
        return tipo;
    }
 //-----------------------------------------------------------------
 public void setSaldo(double s) {
        saldo = s;
    }
    public double getSaldo() {
        return saldo;
    }

//----------------------------------------------------------------
   public void setStatus(boolean st) {
       status = st;
   }
   public boolean getStatus() {
            return status;
   }
}
