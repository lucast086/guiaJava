package ej8;

public class CadenaService {

    public CadenaService() {
    }

    public Cadena crearCadena(){
        return new Cadena("",0);
    }
    public Cadena crearCadena(String a,int l){
        return new Cadena(a,l);
    }

    public int mostrarVocales(Cadena cadena){
        String vocals = "AEIOU";
        int count = 0;
        for (int i = 0; i < cadena.getLongitud();i++){
            if (vocals.contains(cadena.getFrase().substring(i,i+1))) count++;
        }
        return count;
    }
    public String invertirFrase(Cadena cadena){
        return inversor(cadena.getFrase());
    }

    private String inversor(String st){
        if (st.length()==1) return st;
        else {
            return inversor(st.substring(1)).concat(st.substring(0,1));
        }
    }
    public int vecesRepetido(Cadena cadena, String letra){
        int count = 0;
        int i = cadena.getFrase().indexOf(letra);
        while (i != -1){
            i = cadena.getFrase().indexOf(letra,i+1);
                count++;
        }
        return count;
    }
    public int compararLongitud(Cadena cadena, String frase){
        return cadena.getFrase().compareTo(frase);
    }
    public String unirFrases(Cadena cadena, String frase){
        return cadena.getFrase().concat(frase);
    }
    public String reemplazar(Cadena cadena, String letra){
        return cadena.getFrase().replace('a',letra.charAt(0));
    }
    public boolean contiene(Cadena cadena, String letra){
        return cadena.getFrase().contains(letra);
    }
}
