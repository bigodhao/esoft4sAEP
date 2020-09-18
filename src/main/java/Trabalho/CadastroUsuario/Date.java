package Trabalho.CadastroUsuario;

public class Date {
    int dia;
    int mes;
    int ano;

    public Date(int dia, int mes, int ano){
        if (validar(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    @Override
    public String toString() {
        return " " + dia + "/" + mes + "/" + ano + " ";
    }
    
    private static final int[] daysPerMonth ={ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private static boolean validar(int dia, int mes, int ano){
        if (mes <= 0 || mes > 12){
            throw new RuntimeException("mês (" + mes + ") deve ser 1-12");
        }else{
            if (dia <= 0 || (dia > daysPerMonth[mes] && !(mes == 2 && dia == 29))){
                throw new RuntimeException("dia (" + dia + ") fora do intervalo para o mês e ano especificados");

            }else{
                if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))){
                    throw new RuntimeException("dia (" + dia + ") fora do intervalo para o mês e ano especificados");
                }else{
                    return true;
                }
            }
        }
    }
}
