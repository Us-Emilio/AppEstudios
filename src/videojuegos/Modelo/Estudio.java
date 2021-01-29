package videojuegos.Modelo;

public class Estudio {
    private int Id_videoJu;
    private int EquiposDesarrollo;
    private String Nombre;
    private int IdEmpresa;

    public Estudio(int Id_videoJu, int EquiposDesarrollo, String Nombre, int IdEmpresa) {
        this.Id_videoJu = Id_videoJu;
        this.EquiposDesarrollo = EquiposDesarrollo;
        this.Nombre = Nombre;
        this.IdEmpresa = IdEmpresa;
    }

    //Getters
    
    public int getId_videoJu() {
        return Id_videoJu;
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
    
    public void setId_videoJu(int Id_videoJu) {
        this.Id_videoJu = Id_videoJu;
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
    
}
