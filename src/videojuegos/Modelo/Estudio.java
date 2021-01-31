package videojuegos.Modelo;

public class Estudio {
    private int Id_Estudio;
    private int EquiposDesarrollo;
    private String Nombre;
    private int IdEmpresa;

    public Estudio(int Id_Estudio, int EquiposDesarrollo, String Nombre, int IdEmpresa) {
        this.Id_Estudio = Id_Estudio;
        this.EquiposDesarrollo = EquiposDesarrollo;
        this.Nombre = Nombre;
        this.IdEmpresa = IdEmpresa;
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

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    // Setters
    
    public void setId_Estudio(int Id_videoJu) {
        this.Id_Estudio = Id_videoJu;
    }

    public void setEquiposDesarrollo(int EquiposDesarrollo) {
        this.EquiposDesarrollo = EquiposDesarrollo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdEmpresa(int IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }
    //</editor-fold>
}
