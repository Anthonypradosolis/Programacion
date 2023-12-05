import javax.swing.JOptionPane;
public class TransporteInternacional {
    private float peso;
    public void TransporteInter(){
        peso=Float.parseFloat(JOptionPane.showInputDialog("Escribe el peso para el envio"));
        if(peso>5||peso<0){
            System.out.println("Peso no valido");
        }
        else {
            float pesofinal;
            int n1=Integer.parseInt(JOptionPane.showInputDialog("Escribe a que destino envias el pedido: \n1=America del Norte \n2=America Central \n3=America del Sur \n4=Europa \n5=Asia"));
            switch(n1){
                case 1:
                    pesofinal=peso*24;
                    System.out.println(pesofinal+" €");
                    break;
                case 2:
                    pesofinal=peso*20;
                    System.out.println(pesofinal+" €");
                    break;
                case 3:
                    pesofinal=peso*21;
                    System.out.println(pesofinal+" €");
                    break;
                case 4:
                    pesofinal=peso*10;
                    System.out.println(pesofinal+" €");
                    break;
                case 5:
                    pesofinal=peso*18;
                    System.out.println(pesofinal+" €");
                    break;
                default:System.out.println("Opcion incorrecta");;
            }
        }
    }
}