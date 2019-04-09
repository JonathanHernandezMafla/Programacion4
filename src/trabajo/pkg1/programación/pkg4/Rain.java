package trabajo.pkg1.programación.pkg4;

public class Rain {

    public float vRain(Datas datas) {

        float pi = (float) Math.PI;

        float l = datas.getdatapos(0);
        float a = datas.getdatapos(1);
        float b = datas.getdatapos(2);
        float o = (float) Math.toRadians(datas.getdatapos(3));
        float r = datas.getdatapos(4);
        float h = datas.getdatapos(5);
        float x = datas.getdatapos(6);

        float area = (float) ((a * Math.cos(o) * l + b * l + pi * Math.pow(r, 2))/100);
        
        float result = area;
        
        return result;
    }

}
