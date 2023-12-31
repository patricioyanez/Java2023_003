
import java.sql.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date vigencia;
    private Trabajador trabajador;

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.vigencia = null;
        this.trabajador = null;
    }
    public GiftCard(long codigo, int clave, int monto, Date vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String imprimir() {
        return  "\nCodigo           = " + codigo + 
                "\nClave            = " + clave + 
                "\nMonto            = " + monto + 
                "\nVigencia         = " + vigencia + 
                "\nDatos Trabajador =\n" + trabajador.imprimir();
    }
    
    public boolean validarClave()
    {
        String auxRut = this.trabajador.getRut().
                                    replace(".","").
                                    substring(0, 4);
        int claveRut = Integer.parseInt(auxRut);
        if(claveRut == clave)
            return true;
        else
            return false;
        
//        return claveRut == clave;
    }
    public boolean validarSaldoCompra(int montoCompra)
    {
        if(montoCompra <= monto)
            return true;
        else
            return false;
    }
}
