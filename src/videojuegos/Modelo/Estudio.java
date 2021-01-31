package videojuegos.Modelo;

public class Estudio {

    private int Id_Estudio;
    private int EquiposDesarrollo;
    private String Nombre;
    private Empresa empresa;

    public Estudio(int Id_Estudio, int EquiposDesarrollo, String Nombre, Empresa empresa) {
        this.Id_Estudio = Id_Estudio;
        this.EquiposDesarrollo = EquiposDesarrollo;
        this.Nombre = Nombre;
        this.empresa = empresa;
    }

    //<editor-fold defaultstate="collapsed" desc="Geters y seters">
    public int getId_Estudio() {
        return Id_Estudio;
    }

    public int getEquiposDesarrollo() {
        return EquiposDesarrollo;
    }

    public String getNombre() {
        return Nombre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setId_Estudio(int Id_Estudio) {
        this.Id_Estudio = Id_Estudio;
    }

    public void setEquiposDesarrollo(int EquiposDesarrollo) {
        this.EquiposDesarrollo = EquiposDesarrollo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    //</editor-fold>
}
