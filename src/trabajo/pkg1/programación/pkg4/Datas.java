package trabajo.pkg1.programación.pkg4;

public class Datas {

    private int largo;
    private float[] datos;

    //Creación del constructor//
    public Datas(int nlargo) {

        this.largo = nlargo;
        this.datos = new float[nlargo];
    }

    //Encapsulado de variables//
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public float[] getDatos() {
        return datos;
    }

    public void setDatos(float[] datos) {
        this.datos = datos;
    }

    //funciones de vector//
    public void indata(float data, int pos) {
        this.datos[pos] = data;
    }

    public float getdatapos(int pos) {
        float data = this.datos[pos];
        return data;
    }

}
