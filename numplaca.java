package picoyplaca;

import javax.swing.JOptionPane;

public class numplaca {

    public numplaca() {
    }
    String nplaca ="";
    int tamano = 0;
    String digplaca="";
    int p = 0;
    public void digitoplaca (){    
        nplaca = placa.tfplaca.getText();
        tamano = nplaca.length();
        digplaca = ""+nplaca.charAt(tamano-1);
        p = Integer.valueOf(digplaca);
    }
    int ndia=0;
    int rdia=0;
    int nmes=0;
    int tmes=0;
    String anio;
    int nanio=0;
    int anioac=0;
    int danio=0;
    int tsiglo=6;
    String dia="";
    public void diapyp (){
        anio = placa.tffecha.getText();
        anioac=Integer.valueOf(anio.substring(6,10));
        nanio=anioac-2000;
        danio=nanio/4;
        ndia=Integer.valueOf(anio.substring(0,2));
        nmes=Integer.valueOf(anio.substring(3,5));
        switch(nmes){
            case 1:
                tmes=0;
                break;
            case 2:
                tmes=3;
                break;
            case 3:
                tmes=3;
                break;
            case 4:
                tmes=6;
                break;
            case 5:
                tmes=1;
                break;
            case 6:
                tmes=0;
                break;
            case 7:
                tmes=4;
                break;
            case 8:
                tmes=2;
                break;
            case 9:
                tmes=5;
                break;
            case 10:
                tmes=0;
                break;
            case 11:
                tmes=3;
                break;
            case 12:
                tmes=5;
                break;
            default:
                tmes=tmes;
            break;
        }
        rdia=ndia+tmes+nanio+danio+tsiglo;
        rdia=rdia%7;
        switch(rdia){
            case 1:
                dia="LUN";
                break;
            case 2:
                dia="MAR";
                break;
            case 3:
                dia="MIE";
                break;
            case 4:
                dia="JUE";
                break;
            case 5:
                dia="VIE";
                break;
            case 6:
                dia="SAB";
                break;
            case 0:
                dia="DOM";
                break;
            default:
                dia="----";
            break;
        }
    }
    String hora="";
    int time=0;
    public void hora (){
        hora = placa.tfhora.getText();
        time = Integer.valueOf(hora.substring(0,2)+hora.substring(3,5));
    }
    String day="";
    String msg="";
    public void control(){
        switch(p){
            
            case 1:
                day="LUN";
                break;
            case 2:
                day="LUN";
                break;
            case 3:
                day="MAR";
                break;
            case 4:
                day="MAR";
                break;
            case 5:
                day="MIE";
                break;
            case 6:
                day="MIE";
                break;
            case 7:
                day="JUE";
                break;
            case 8:
                day="JUE";
                break;
            case 9:
                day="VIE";
                break;
            case 0:
                day="VIE";
                break;
            default:
                day="---";
            break;
    }
        if(day.equalsIgnoreCase(dia)){
            if((time>=700&&time<=930)){
               msg="TIENE PROHIBICION";
            }
            else
                if((time>=1600&&time<=1930)){
               msg="TIENE PROHIBICION";
            }
            else
                msg="NO TIENE PROHIBICION";
    }
    }
    public void escribir (){
        JOptionPane.showMessageDialog(null, "El carro "+msg, "Verificado",JOptionPane.PLAIN_MESSAGE);
    }
}
