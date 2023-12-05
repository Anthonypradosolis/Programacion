import javax.swing.JOptionPane;
public class Llamadas {
    private float tiempo ;
    private float precio;
    private int dia;
    private float preciofinal;
    public Llamadas() {
    }
    public Llamadas(float tiempo, int diasemana, float preciofinal) {
        this.tiempo = tiempo;
        this.dia = diasemana;
        this.preciofinal = preciofinal;
    }
    public void tiempoGasto(){
        int salir;
        salir=Integer.parseInt(JOptionPane.showInputDialog("Quieres iniciar el programa: \n1=Si \n2=No"));
        if(salir==1)
            do{
                tiempo= Float.parseFloat(JOptionPane.showInputDialog("Escribe el tiempo el cual vas a estar "));
                if(tiempo<=5){
                    precio=1;
                }
                else if(tiempo>5&&tiempo<=8){
                    precio=1.8f;
                }
                else if(tiempo>8&&tiempo<=10){
                    precio=2.5f;
                }
                else if(tiempo>10){
                    precio=2.5f+((tiempo-10)*0.5f);
                }
                dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige el dia de la semana: \n1=Domingo \n2=De Lunes a Sábado de mañana \n3=De Lunes a Sábado de tarde"));

                switch(dia){
                    case 1:
                        preciofinal=(precio*0.03f)+precio;
                        System.out.println("El tiempo que estas de llamda es: "+tiempo+" mins "+"\nEl precio final es de: "+preciofinal+" €");
                        break;
                    case 2:
                        preciofinal=(precio*0.15f)+precio;
                        System.out.println("El tiempo que estas de llamda es: "+tiempo+" mins "+"\nEl precio final es de: "+preciofinal+" €");
                        break;
                    case 3:
                        preciofinal=(precio*0.1f)+precio;
                        System.out.println("El tiempo que estas de llamda es: "+tiempo+" mins "+"\nEl precio final es de: "+preciofinal+" €");
                        break;
                    default: System.out.println("Opcion Incorrecta");
                }
            }while(salir==1);
    }
}